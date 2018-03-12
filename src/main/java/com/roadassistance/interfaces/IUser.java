package com.roadassistance.interfaces;

import com.roadassistance.api.dto.EditOwnProfile;
import com.roadassistance.api.dto.Feedback;
import com.roadassistance.api.dto.GetHelperCoordinates;
import com.roadassistance.api.dto.ViewProfile;

public interface IUser {
    boolean EditOwnProfile(EditOwnProfile editOwnProfile);

    ViewProfile viewProfile(long userId);

    boolean LeaveFeedback(Feedback feedback);

    GetHelperCoordinates getHelperCoordinates(long userId);
}

