package com.roadassistance.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.roadassistance.api.dto.AcceptHelp;
import com.roadassistance.api.dto.EditOwnProfile;
import com.roadassistance.api.dto.Feedback;
import com.roadassistance.api.dto.GetHelperCoordinates;
import com.roadassistance.api.dto.GetProblemsByFilter;
import com.roadassistance.api.dto.HelpRequest;
import com.roadassistance.api.dto.Place;
import com.roadassistance.api.dto.PushHelperLocation;
import com.roadassistance.api.dto.RespondToHelpRequest;
import com.roadassistance.api.dto.ViewProfile;
import com.roadassistance.interfaces.IRoadAssistanceConstants;

@RestController
public class RoadAssistanceHandler {

    @PostMapping(IRoadAssistanceConstants.RESPOND_HELP)
    @CrossOrigin
    public boolean respondHelpRequest(@RequestBody RespondToHelpRequest respondToHelpRequest) {
        return false;

    }

    @GetMapping(IRoadAssistanceConstants.OBJECTS)
    @CrossOrigin
    Iterable<Place> getPlacesByFilter(@PathVariable int[] placeParams) {

        return null;
    }

    @PostMapping(IRoadAssistanceConstants.HELP_REQUEST)
    @CrossOrigin
    public boolean createHelpRequest(@RequestBody HelpRequest helpRequest) {
        return false;
    }

    @PutMapping(IRoadAssistanceConstants.EDIT_PROFILE)
    @CrossOrigin
    public boolean editOwnProfile(@RequestBody EditOwnProfile editOwnProfile) {
        return false;
    }

    @PostMapping(IRoadAssistanceConstants.ACCEPT_HELP)
    @CrossOrigin
    public boolean acceptHelp(@RequestBody AcceptHelp acceptHelp) {
        return false;
    }

    @GetMapping(IRoadAssistanceConstants.VIEW_PROFILE)
    @CrossOrigin
    public ViewProfile viewProfile(@RequestParam long userId) {
        return null;
    }

    @PostMapping(IRoadAssistanceConstants.LEAVE_FEEDBACK)
    @CrossOrigin
    public boolean leaveFeedBack(@RequestBody Feedback feedback) {
        return false;

    }

    @PostMapping(IRoadAssistanceConstants.PUSH_HELPER_LOCATION)
    @CrossOrigin
    public boolean pushHelperLocation(@RequestBody PushHelperLocation helperLoation) {
        return false;

    }

    @GetMapping(IRoadAssistanceConstants.GET_HELPER_COORDINATES)
    @CrossOrigin
    public GetHelperCoordinates getHelperLocation(@RequestParam long userId) {
        return null;
    }

    @GetMapping(IRoadAssistanceConstants.GET_PROBLEMS_BY_FILTER)
    @CrossOrigin
    public Iterable<GetProblemsByFilter> getProblemsByFilter(@RequestParam double lat, double lng, double radius,
                                                             boolean[] problemTypes) {

        return null;

    }

}
