package com.roadassistance.interfaces;

import com.roadassistance.api.dto.*;

public interface IUser {
    boolean registration(String userPhone);

    boolean editOwnProfile(EditOwnProfile editOwnProfile);

    ViewProfile viewProfile(String userPhone);

    boolean leaveFeedback(Feedback feedback);

    GetHelperCoordinates getHelperCoordinates(String userPhone);
}

