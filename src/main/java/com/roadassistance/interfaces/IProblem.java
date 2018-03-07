package com.roadassistance.interfaces;

import com.roadassistance.api.dto.AcceptHelp;
import com.roadassistance.api.dto.GetProblemsByFilter;
import com.roadassistance.api.dto.HelpRequest;
import com.roadassistance.api.dto.RespondToHelpRequest;

public interface IProblem {
	boolean createHelprequest(HelpRequest helpRequest);

	boolean respondToHelpRequest(RespondToHelpRequest respondToHelpRequest);

	boolean acceptHelp(AcceptHelp acceptHelp);

	public Iterable<GetProblemsByFilter> getProblemsByFilter(double lat, double lng, double radius,
			boolean[] problemTypes);
}
