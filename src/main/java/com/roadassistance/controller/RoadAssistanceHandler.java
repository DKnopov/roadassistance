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
	public void respondHelpRequest(@RequestBody RespondToHelpRequest respondToHelpRequest) {

	}

	@GetMapping(IRoadAssistanceConstants.OBJECTS)
	@CrossOrigin
	Place[] getPlacesByFilter(@PathVariable String placeParams) {
		Place place = new Place(140, "Place1", "Type1", 214, 4311);
		Place Secondplace = new Place(141, "Place2", "Type3", 214, 4311);
		Place[] placeArr = new Place[2];
		placeArr[0] = place;
		placeArr[1] = Secondplace;
		return placeArr;
	}

	@PostMapping(IRoadAssistanceConstants.HELP_REQUEST)
	@CrossOrigin
	public boolean createHelpRequest(@RequestBody HelpRequest helpRequest) {
		return true;
	}

	@PutMapping(IRoadAssistanceConstants.EDIT_PROFILE)
	@CrossOrigin
	public boolean editOwnProfile(@RequestBody EditOwnProfile ownProfile) {
		return true;
	}

	@PostMapping(IRoadAssistanceConstants.ACCEPT_HELP)
	@CrossOrigin
	public boolean acceptHelp(@RequestBody AcceptHelp acceptHelp) {
		return true;
	}

	@GetMapping(IRoadAssistanceConstants.VIEW_PROFILE)
	@CrossOrigin
	public ViewProfile viewProfile(@RequestParam long userId) {
		return null;
	}

	@PostMapping(IRoadAssistanceConstants.LEAVE_FEEDBACK)
	@CrossOrigin
	public boolean leaveFeedBack(@RequestBody Feedback feedBack) {
		return true;
	}

	@PostMapping(IRoadAssistanceConstants.PUSH_HELPER_LOCATION)
	@CrossOrigin
	public boolean pushHelperLocation(@RequestBody PushHelperLocation location) {
		return true;
	}

	@GetMapping(IRoadAssistanceConstants.GET_HELPER_COORDINATES)
	@CrossOrigin
	public GetHelperCoordinates getHelperLocation(@RequestParam long userId) {
			return null;
	}

}
