package com.roadassistance.controller;

import com.roadassistance.api.dto.Registration;
import com.roadassistance.common.DeviceProvider;
import com.roadassistance.entity.User;
import com.roadassistance.entity.UserTokenState;
import com.roadassistance.model.UserCrud;
import com.roadassistance.security.TokenHelper;
import com.roadassistance.security.auth.JwtAuthenticationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mobile.device.Device;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;

/**
 * Created by fan.jin on 2017-05-10.
 */

@RestController
@RequestMapping(value = "/auth", produces = MediaType.APPLICATION_JSON_VALUE)
public class AuthenticationController {

    @Autowired
    TokenHelper tokenHelper;

    @Autowired
    UserCrud userCrud;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @Autowired
    private DeviceProvider deviceProvider;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(
            @RequestBody JwtAuthenticationRequest authenticationRequest,
            HttpServletResponse response
    ) throws AuthenticationException, IOException {

        String username = authenticationRequest.getUsername();
        String password = authenticationRequest.getPassword();
//        System.out.println("username: " + username + ", password : " + password);

        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username, password);
        // Perform the security
        final Authentication authentication = authenticationManager.authenticate(token);

        // Inject into security context
        SecurityContextHolder.getContext().setAuthentication(authentication);

        // token creation
        User user = (User) authentication.getPrincipal();
        //System.out.println(user);
        String jws = tokenHelper.generateToken(user.getUsername());
        //System.out.println("jws: "+jws);
//        int expiresIn = tokenHelper.getExpiredIn(device);
        // Return the token
        return ResponseEntity.ok(new UserTokenState(jws));
    }

    @RequestMapping(value = "/refresh", method = RequestMethod.POST)
    public ResponseEntity<?> refreshAuthenticationToken(
            HttpServletRequest request,
            HttpServletResponse response,
            Principal principal
    ) {

        String authToken = tokenHelper.getToken(request);

        Device device = deviceProvider.getCurrentDevice(request);

        if (authToken != null && principal != null) {

            // TODO check user password last update
            String refreshedToken = tokenHelper.refreshToken(authToken, device);
            //int expiresIn = tokenHelper.getExpiredIn(device);

            return ResponseEntity.ok(new UserTokenState(refreshedToken));
        } else {
            UserTokenState userTokenState = new UserTokenState();
            return ResponseEntity.accepted().body(userTokenState);
        }
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    @CrossOrigin
    @Transactional
    public ResponseEntity<?> addUser(@RequestBody Registration registration, HttpServletResponse response) throws org.apache.tomcat.websocket.AuthenticationException {
        String password = registration.getPassword();
        if (userDetailsService.registration(new User(registration.getEmail()))) {
       /* if (userCrud.registration(registration)) {*/
            UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(registration.getEmail(), password);
            // Perform the security
            final Authentication authentication = authenticationManager.authenticate(token);
            // Inject into security context
            SecurityContextHolder.getContext().setAuthentication(authentication);
            // token creation
            String jws = tokenHelper.generateToken(((User) authentication.getPrincipal()).getUsername());
            return ResponseEntity.ok(new UserTokenState(jws));
        }
        throw new org.apache.tomcat.websocket.AuthenticationException("User with this mail already exists");
    }

/*    @RequestMapping(value = "/change-password", method = RequestMethod.POST)
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<?> changePassword(@RequestBody PasswordChanger passwordChanger) {
        userDetailsService.changePassword(passwordChanger.oldPassword, passwordChanger.newPassword);
        Map<String, String> result = new HashMap<>();
        result.put("result", "success");
        return ResponseEntity.accepted().body(result);
    }*/

    static class PasswordChanger {
        public String oldPassword;
        public String newPassword;
    }
}