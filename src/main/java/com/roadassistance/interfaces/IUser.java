package com.roadassistance.interfaces;

import com.roadassistance.api.dto.*;

public interface IUser {
    boolean registration(Registration registration);

    boolean editOwnProfile(EditOwnProfile editOwnProfile);

    ViewProfile viewProfile(String userEmail);

    boolean leaveFeedback(Feedback feedback);

    GetHelperCoordinates getHelperCoordinates(String userEmail);

    boolean pushHelperLocation(PushHelperLocation pushHelperLocation);

    GetUsersInfo getUserInfo(String userId);
}

