package com.roadassistance.interfaces;

import com.roadassistance.api.dto.AcceptHelp;
import com.roadassistance.api.dto.GetProblemsByFilter;
import com.roadassistance.api.dto.HelpRequest;
import com.roadassistance.api.dto.RespondToHelpRequest;
import com.roadassistance.entity.Problem;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface IProblem {
	boolean createHelprequest(HelpRequest helpRequest);

	boolean respondToHelpRequest(RespondToHelpRequest respondToHelpRequest) throws ExecutionException, InterruptedException;

	boolean acceptHelp(AcceptHelp acceptHelp);

	Iterable<GetProblemsByFilter> getProblemsByFilter(double lng, double lat, double radius,
												 boolean[] problemTypes);
}
