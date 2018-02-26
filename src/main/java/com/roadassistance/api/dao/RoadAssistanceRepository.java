package com.roadassistance.api.dao;

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
import com.roadassistance.interfaces.IRoadAssistanceUser;

public class RoadAssistanceRepository implements IRoadAssistanceUser {

	@Override
	public Iterable<Place> getPlacesByFilter(int[] params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createHelpRequest(HelpRequest helpRequest) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean respondToHelpRequest(RespondToHelpRequest respondToHelpRequest) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editOwnProfile(EditOwnProfile editOwnProfile) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean acceptHelp(AcceptHelp acceptHelp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ViewProfile viewProfile(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean leaveFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean pushHelperLocation(PushHelperLocation pushHelperLocation) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public GetHelperCoordinates getHelperCoordinates(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<GetProblemsByFilter> getProblems(double lat, double lng, double radius, int[] problemTypes) {
		// TODO Auto-generated method stub
		return null;
	}


}
