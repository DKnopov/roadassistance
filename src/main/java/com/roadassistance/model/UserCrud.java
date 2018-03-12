package com.roadassistance.model;

import com.roadassistance.api.dto.EditOwnProfile;
import com.roadassistance.api.dto.Feedback;
import com.roadassistance.api.dto.GetHelperCoordinates;
import com.roadassistance.api.dto.ViewProfile;
import com.roadassistance.interfaces.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

@Repository
public class UserCrud implements IUser {
    @Autowired
    MongoOperations mongoOperations;

    @Override
    public boolean EditOwnProfile(EditOwnProfile editOwnProfile) {
        return false;
    }

    @Override
    public ViewProfile viewProfile(long userId) {
        return null;
    }

    @Override
    public boolean LeaveFeedback(Feedback feedback) {
        return false;
    }

    @Override
    public GetHelperCoordinates getHelperCoordinates(long userId) {
        return null;
    }
}
