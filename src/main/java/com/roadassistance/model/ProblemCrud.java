package com.roadassistance.model;

import com.roadassistance.api.dto.AcceptHelp;
import com.roadassistance.api.dto.GetProblemsByFilter;
import com.roadassistance.api.dto.HelpRequest;
import com.roadassistance.api.dto.RespondToHelpRequest;
import com.roadassistance.entity.Problem;
import com.roadassistance.interfaces.IProblem;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Circle;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Metrics;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
@Repository
public class ProblemCrud implements IProblem {
    @Autowired
    MongoOperations mongoOperations;

    @Override
    public boolean createHelprequest(HelpRequest helpRequest) {
        //TODO userId&Saving logic&Java time
        LocalDateTime now = LocalDateTime.of(LocalDate.now(ZoneId.of("Israel")), LocalTime.now(ZoneId.of("Israel")));
        Problem problem = new Problem(ObjectId.get().toString(), helpRequest.getRequestingUserPhone(), helpRequest.getProblemType(),
                helpRequest.getDescription(),
                helpRequest.getGeoLocation(), helpRequest.getDirection(),
                helpRequest.getStatus(), helpRequest.getExtra(),
                null, false,
                now);
        mongoOperations.save(problem);
        return true;
    }

    @Override
    public boolean respondToHelpRequest(RespondToHelpRequest respondToHelpRequest) {
        Problem problem = mongoOperations.findById(respondToHelpRequest.getProblemId(), Problem.class);
        if (problem == null) {
            return false;
        }
        //TODO problemSolverCoordiantes?
        problem.setAcceptingUserPhone(respondToHelpRequest.getUserPhone());
        problem.setStatus(0);///TODO Handle status with frontEnd
        mongoOperations.save(problem);
        return true;
    }

    @Override
    public boolean acceptHelp(AcceptHelp acceptHelp) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Iterable<GetProblemsByFilter> getProblemsByFilter(double lng, double lat, double radius,
                                                             boolean[] problemTypes) {
        Point point = new Point(lng, lat);
        Distance distance = new Distance(radius, Metrics.KILOMETERS);
        Circle area = new Circle(point, distance);
        Query query = new Query();
        query.addCriteria(Criteria.where("geoLocation").withinSphere(area));
        List<Problem> problems = mongoOperations.find(query, Problem.class);
        List<GetProblemsByFilter> problemsByFilters = new ArrayList<>();
        for (Problem p : problems) {
            GetProblemsByFilter getProblemsByFilter = new GetProblemsByFilter(p.getProblemId(),
                    p.getRequestingUserPhone(), p.getProblemType(),
                    p.getDescription(), p.getGeoLocation(),
                    p.getDirection(), p.getStatus(), p.getExtra());
            for (int i = 0; i < problemTypes.length; i++) {
                if (problemTypes[i]) {
                    if (p.getProblemType() == i + 1) {
                        problemsByFilters.add(getProblemsByFilter);
                    }
                }
            }
            //problemsByFilters.add(getProblemsByFilter);
            //TODO problemtypes
        }
        return problemsByFilters;
    }

}
