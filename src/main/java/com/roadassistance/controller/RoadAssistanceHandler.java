package com.roadassistance.controller;

import java.util.concurrent.ExecutionException;

import com.roadassistance.api.dto.*;
import com.roadassistance.interfaces.IGarage;
import com.roadassistance.interfaces.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.roadassistance.interfaces.IProblem;
import com.roadassistance.interfaces.IRoadAssistanceConstants;

@RestController
public class RoadAssistanceHandler {
    @Autowired
    IProblem problemCrud;
    @Autowired
    IUser userCrud;
    @Autowired
    IGarage garageCrud;

    @PostMapping(IRoadAssistanceConstants.RESPOND_HELP)
    @CrossOrigin
    public boolean respondHelpRequest(@RequestBody RespondToHelpRequest respondToHelpRequest) throws ExecutionException, InterruptedException {
        return problemCrud.respondToHelpRequest(respondToHelpRequest);

    }

    @GetMapping(IRoadAssistanceConstants.OBJECTS)
    @CrossOrigin
    Iterable<Place> getPlacesByFilter(@PathVariable int[] placeParams) {

        return null;
    }

    @PostMapping(IRoadAssistanceConstants.HELP_REQUEST)
    @CrossOrigin
    public String createHelpRequest(@RequestBody HelpRequest helpRequest) throws ExecutionException, InterruptedException {
        return problemCrud.createHelprequest(helpRequest);
    }

    @PutMapping(IRoadAssistanceConstants.EDIT_PROFILE)
    @CrossOrigin
    public boolean editOwnProfile(@RequestBody EditOwnProfile editOwnProfile) {
        return userCrud.editOwnProfile(editOwnProfile);
    }

    @PostMapping(IRoadAssistanceConstants.ACCEPT_HELP)
    @CrossOrigin
    public boolean acceptHelp(@RequestBody AcceptHelp acceptHelp) {
        return false;
    }

    @GetMapping(IRoadAssistanceConstants.VIEW_PROFILE)
    @CrossOrigin
    public ViewProfile viewProfile(@RequestParam String userId) {
        return userCrud.viewProfile(userId);
    }

    @PostMapping(IRoadAssistanceConstants.LEAVE_FEEDBACK)
    @CrossOrigin
    public boolean leaveFeedBack(@RequestBody Feedback feedback) {
        return userCrud.leaveFeedback(feedback);
    }

    @PostMapping(IRoadAssistanceConstants.PUSH_HELPER_LOCATION)
    @CrossOrigin
    public boolean pushHelperLocation(@RequestBody PushHelperLocation helperLoation) {
        return userCrud.pushHelperLocation(helperLoation);

    }

    @GetMapping(IRoadAssistanceConstants.GET_HELPER_COORDINATES)
    @CrossOrigin
    public GetHelperCoordinates getHelperLocation(@RequestParam String userId) {
        return userCrud.getHelperCoordinates(userId);
    }

    @GetMapping(IRoadAssistanceConstants.GET_PROBLEMS_BY_FILTER)
    @CrossOrigin
    public Iterable<GetProblemsByFilter> getProblemsByFilter(@RequestParam double lng, double lat, double radius,
                                                             boolean[] problemTypes) {

        return problemCrud.getProblemsByFilter(lng, lat, radius, problemTypes);

    }

    @PostMapping(IRoadAssistanceConstants.REGISTRATION)
    @CrossOrigin
    public boolean registration(@RequestBody Registration registration) {
        return userCrud.registration(registration);
    }

    @PostMapping(IRoadAssistanceConstants.CANCEL_PROBLEM)
    @CrossOrigin
    public boolean cancel(@RequestParam String problemId) {
        return problemCrud.cancelProblem(problemId);
    }

    @PutMapping(IRoadAssistanceConstants.EDIT_SERVICE_PROFILE)
    @CrossOrigin
    public void editServiceProfile(@RequestBody EditServiceProfile editServiceProfile) {
        garageCrud.editServiceProfile(editServiceProfile);
    }

    @GetMapping(IRoadAssistanceConstants.GET_SERVICE_PROFILE)
    @CrossOrigin
    public GetServiceProfile getServiceProfile(@RequestParam String garageId) {
        return garageCrud.getServiceProfile(garageId);
    }

    @PostMapping(IRoadAssistanceConstants.SERVICE_RESPOND)
    @CrossOrigin
    public boolean serviceRespondToHelpRequest(@RequestBody ServiceRespondToHelpRequest serviceRespondToHelpRequest) throws ExecutionException, InterruptedException {
        return problemCrud.respondToHelpRequestService(serviceRespondToHelpRequest);
    }

    @PostMapping(IRoadAssistanceConstants.SERVICE_REGISTRATION)
    @CrossOrigin
    public boolean registrationService(@RequestBody Registration registration) {
        return garageCrud.registrationService(registration);
    }

    @GetMapping(IRoadAssistanceConstants.GET_PROBLEMS_SERVICE)
    @CrossOrigin
    public Iterable<GetProblemsByFilter> getProblemsByFilterService(@RequestParam String garageId) {

        return problemCrud.getProblemsByFilterService(garageId);

    }


    @GetMapping(IRoadAssistanceConstants.GET_USER_INFO)
    @CrossOrigin
    public GetUsersInfo getUsersInfo(@RequestParam String userId) {
        return userCrud.getUserInfo(userId);
    }



}
