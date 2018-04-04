package com.roadassistance.interfaces;

import com.roadassistance.api.dto.EditServiceProfile;
import com.roadassistance.api.dto.GetServiceProfile;
import com.roadassistance.api.dto.GetUsersInfo;
import com.roadassistance.api.dto.Registration;

public interface IGarage {
    void editServiceProfile(EditServiceProfile editServiceProfile);

    GetServiceProfile getServiceProfile(String garageId);

    boolean registrationService(Registration registration);

}
