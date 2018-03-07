package com.roadassistance.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.roadassistance.api.dto.AcceptHelp;
import com.roadassistance.api.dto.GetProblemsByFilter;
import com.roadassistance.api.dto.HelpRequest;
import com.roadassistance.api.dto.RespondToHelpRequest;
import com.roadassistance.entity.Problem;
import com.roadassistance.interfaces.IProblem;
import com.roadassistance.repository.ProblemRepository;
@Repository
public class ProblemCrud implements IProblem {
@Autowired
ProblemRepository problemRepository;
	@Override
	public boolean createHelprequest(HelpRequest helpRequest) {
		//TODO userId&Saving logic&Java time
		long acceptingUserIdDefault=0;
		LocalDate now=LocalDate.now();
		Problem problem=new Problem(2,helpRequest.getProblemType(),helpRequest.getDescription(),
				helpRequest.getLat(),helpRequest.getLng(),helpRequest.getDirection(),
				helpRequest.getStatus(),helpRequest.getExtra(),acceptingUserIdDefault,false,
				now);
		problemRepository.save(problem);
		return true;
	}
	@Override
	public boolean respondToHelpRequest(RespondToHelpRequest respondToHelpRequest) {
		Problem problem=problemRepository.findOne(respondToHelpRequest.getProblemId());
		if(problem==null) {
			return false;
		}
		//TODO problemSolverCoordiantes?
		problem.setAcceptingUserId(respondToHelpRequest.getUserId());
		problem.setStatus(0);///TODO Handle status with frontEnd
		problemRepository.save(problem);
		return true;
	}
	@Override
	public boolean acceptHelp(AcceptHelp acceptHelp) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Iterable<GetProblemsByFilter> getProblemsByFilter(double lat, double lng, double radius,
			boolean[] problemTypes) {
		// TODO Auto-generated method stub
		return null;
	}

}
