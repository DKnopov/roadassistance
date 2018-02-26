package com.roadassistance.interfaces;

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

public interface IRoadAssistanceUser {
	boolean createHelpRequest(HelpRequest helpRequest);

	boolean respondToHelpRequest(RespondToHelpRequest respondToHelpRequest);

	boolean editOwnProfile(EditOwnProfile editOwnProfile);

	boolean acceptHelp(AcceptHelp acceptHelp);

	ViewProfile viewProfile(long userId);

	boolean leaveFeedback(Feedback feedback);

	boolean pushHelperLocation(PushHelperLocation pushHelperLocation);

	GetHelperCoordinates getHelperCoordinates(long userId);
	Iterable<GetProblemsByFilter> getProblems(double lat,double lng,double radius,int[] problemTypes);
	Iterable<Place> getPlacesByFilter(int[] params);
}
