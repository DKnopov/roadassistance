package com.roadassistance.interfaces;

import com.roadassistance.api.dto.*;
import com.roadassistance.entity.Problem;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface IProblem {
    String createHelprequest(HelpRequest helpRequest);

    boolean respondToHelpRequest(RespondToHelpRequest respondToHelpRequest) throws ExecutionException, InterruptedException;

    boolean respondToHelpRequestService(ServiceRespondToHelpRequest serviceRespondToHelpRequest) throws ExecutionException, InterruptedException;

    boolean acceptHelp(AcceptHelp acceptHelp);

    Iterable<GetProblemsByFilter> getProblemsByFilter(double lng, double lat, double radius,
                                                      boolean[] problemTypes);

    Iterable<GetProblemsByFilter> getProblemsByFilterService(String garageId);

    boolean cancelProblem(String problemId);
}
