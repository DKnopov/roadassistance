package com.roadassistance.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
	static ObjectMapper mapper = new ObjectMapper();

	@PostMapping(IRoadAssistanceConstants.RESPOND_HELP)
	@CrossOrigin
	public void respondHelpRequest(@RequestBody RespondToHelpRequest respondToHelpRequest) {

	}

	@GetMapping(IRoadAssistanceConstants.OBJECTS)
	@CrossOrigin
	Place[] getPlacesByFilter(@PathVariable int[] placeParams) {
		Place place = new Place(140, "Place1", "Type1", 214, 4311);
		Place Secondplace = new Place(141, "Place2", "Type3", 214, 4311);
		Place[] placeArr = new Place[2];
		placeArr[0] = place;
		placeArr[1] = Secondplace;
		return placeArr;
	}

	@PostMapping(IRoadAssistanceConstants.HELP_REQUEST)
	@CrossOrigin
	public boolean createHelpRequest(@RequestBody String helpRequest) {
		try {
			HelpRequest request = mapper.readValue(helpRequest, HelpRequest.class);
			/*
			 * if(request.getAcceptingUser()==0||request.getAnswer()==0||request.
			 * getDescription()==null
			 * ||request.getDirection()==0||request.getDirection()==0||request.getLat()==0||
			 * request.getLng()==0|| request.getRequestingUser()==0) { return false; }
			 */
			return true;
		} catch (JsonParseException e) {
			return false;
		} catch (JsonMappingException e) {
			return false;
		} catch (IOException e) {
			return false;
		}

	}

	@PutMapping(IRoadAssistanceConstants.EDIT_PROFILE)
	@CrossOrigin
	public boolean editOwnProfile(@RequestBody String profile) {
		try {
			EditOwnProfile ownProfile = mapper.readValue(profile, EditOwnProfile.class);
			if (ownProfile.getName() == null || ownProfile.getPhone() == null || ownProfile.getSurname() == null) {
				return false;
			}
			return true;
		} catch (JsonParseException e) {
			return false;
		} catch (JsonMappingException e) {
			return false;
		} catch (IOException e) {
			return false;
		}

	}

	@PostMapping(IRoadAssistanceConstants.ACCEPT_HELP)
	@CrossOrigin
	public boolean acceptHelp(@RequestBody String acceptHelp) {
		try {
			AcceptHelp acceptHelp1 = mapper.readValue(acceptHelp, AcceptHelp.class);
			if (acceptHelp1.getHelperId() == 0 || acceptHelp1.getProblemId() == 0) {
				return false;
			}
			return true;
		} catch (JsonParseException e) {
			return false;
		} catch (JsonMappingException e) {
			return false;
		} catch (IOException e) {
			return false;
		}
	}

	@GetMapping(IRoadAssistanceConstants.VIEW_PROFILE)
	@CrossOrigin
	public ViewProfile viewProfile(@RequestParam long userId) {
		Feedback[] feedback = new Feedback[2];
		ViewProfile test = new ViewProfile(userId, "test", "test", "test", feedback);
		return test;
	}

	@PostMapping(IRoadAssistanceConstants.LEAVE_FEEDBACK)
	@CrossOrigin
	public boolean leaveFeedBack(@RequestBody String feedback) {
		try {
			Feedback feed = mapper.readValue(feedback, Feedback.class);
			if (feed.getComment() == null || feed.getProblemId() == 0) {
				return false;
			}
			return true;
		} catch (JsonParseException e) {
			return false;
		} catch (JsonMappingException e) {
			return false;
		} catch (IOException e) {
			return false;
		}

	}

	@PostMapping(IRoadAssistanceConstants.PUSH_HELPER_LOCATION)
	@CrossOrigin
	public boolean pushHelperLocation(@RequestBody String helperLoation) {
		try {
			PushHelperLocation location = mapper.readValue(helperLoation, PushHelperLocation.class);
			if (location.getDirection() == 0 || location.getLat() == 0 || location.getLng() == 0
					|| location.getUserId() == 0) {
				return false;
			}
			return true;
		} catch (JsonParseException e) {
			return false;
		} catch (JsonMappingException e) {
			return false;
		} catch (IOException e) {
			return false;
		}

	}

	@GetMapping(IRoadAssistanceConstants.GET_HELPER_COORDINATES)
	@CrossOrigin
	public GetHelperCoordinates getHelperLocation(@RequestParam long userId) {
		GetHelperCoordinates coordinates=new GetHelperCoordinates(userId, 12, 12, 10);
		return coordinates;
	}

}
