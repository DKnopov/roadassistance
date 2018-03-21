package com.roadassistance.model;

import com.roadassistance.api.dto.*;
import com.roadassistance.entity.User;
import com.roadassistance.interfaces.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class UserCrud implements IUser {
    @Autowired
    MongoOperations mongoOperations;

    @Override
    public boolean registration(String userPhone) {
        User user = new User(userPhone);
        mongoOperations.save(user);
        return true;
    }

    @Override
    public boolean editOwnProfile(EditOwnProfile editOwnProfile) {
        User user = mongoOperations.findById(editOwnProfile.getPhone(), User.class);
        user.setName(editOwnProfile.getName());
        user.setSurname(editOwnProfile.getSurname());
        user.setUserPhoto(editOwnProfile.getUserPhoto());
        user.setUserVehicles(editOwnProfile.getUserVehicles());
        mongoOperations.save(user);
        return true;
    }

    @Override
    public ViewProfile viewProfile(String userPhone) {
        User user = mongoOperations.findById(userPhone, User.class);
        ViewProfile viewProfile = new ViewProfile(
                user.getPhone(), user.getName(),
                user.getSurname(), user.getRating(),
                user.getFeedbacks());
        return viewProfile;
    }


    @Override
    public boolean leaveFeedback(Feedback feedback) {
        User user = mongoOperations.findById(feedback.getUserPhone(), User.class);
        double rating = user.getRating();
        int count = user.getCountEstimates();
        double newRating = (count * rating + feedback.getEstimate()) / (count + 1);
        Query query = new Query(Criteria.where("_id").is(feedback.getUserPhone()));
        Update update = new Update();
        update.push("feedbacks", feedback);
        update.inc("countEstimates",+1 );
        update.set("rating", newRating);
        mongoOperations.upsert(query, update, User.class);
        return true;
    }

    @Override
    public GetHelperCoordinates getHelperCoordinates(String userPhone) {
        User user = mongoOperations.findById(userPhone, User.class);
        return new GetHelperCoordinates(user.getPhone(), user.getGeoLocation(), user.getDirection());
    }


}
