package com.roadassistance.model;

import com.roadassistance.api.dto.*;
import com.roadassistance.entity.User;
import com.roadassistance.interfaces.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

@Repository
public class UserCrud implements IUser {
    @Autowired
    MongoOperations mongoOperations;

    @Override
    public boolean registration(Registration registration) {
        if (mongoOperations.findById(registration.getEmail(), User.class) != null) {
            return false;
        }
        User user = new User(registration.getEmail(), registration.getEmail(), registration.getPassword());
        mongoOperations.save(user);
        return true;
    }


    @Override
    public boolean editOwnProfile(EditOwnProfile editOwnProfile) {
        User user = mongoOperations.findById(editOwnProfile.getUserId(), User.class);
        user.setEmail(editOwnProfile.getEmail());
        user.setPhone(editOwnProfile.getPhone());
        user.setName(editOwnProfile.getName());
        user.setSurname(editOwnProfile.getSurname());
        user.setUserPhoto(editOwnProfile.getUserPhoto());
        user.setUserVehicles(editOwnProfile.getUserVehicles());
        mongoOperations.save(user);
        return true;
    }

    @Override
    public ViewProfile viewProfile(String userId) {
        User user = mongoOperations.findById(userId, User.class);
        ViewProfile viewProfile = new ViewProfile(
                user.getPhone(), user.getName(),
                user.getSurname(), user.getRating(),
                user.getFeedbacks());
        return viewProfile;
    }


    @Override
    public boolean leaveFeedback(Feedback feedback) {
        User user = mongoOperations.findById(feedback.getUserId(), User.class);
        double rating = user.getRating();
        int count = user.getCountEstimates();
        double newRating = (count * rating + feedback.getEstimate()) / (count + 1);
        Query query = new Query(Criteria.where("_id").is(feedback.getUserId()));
        Update update = new Update();
        update.push("feedbacks", new Feedback(
                feedback.getUserName(), feedback.getReviewerName(),
                feedback.getComment(), feedback.getEstimate(),
                feedback.getProblemId()));
        update.inc("countEstimates", +1);
        update.set("rating", newRating);
        mongoOperations.upsert(query, update, User.class);
        return true;
    }

    @Override
    public GetHelperCoordinates getHelperCoordinates(String userId) {
        User user = mongoOperations.findById(userId, User.class);
        return new GetHelperCoordinates(user.getUserId(), user.getGeoLocation(), user.getDirection());
    }

    @Override
    public boolean pushHelperLocation(PushHelperLocation pushHelperLocation) {
        User user = mongoOperations.findById(pushHelperLocation.getUserId(), User.class);
        user.setGeoLocation(pushHelperLocation.getGeoLocation());
        user.setDirection(pushHelperLocation.getDirection());
        mongoOperations.save(user);
        return true;
    }


}
