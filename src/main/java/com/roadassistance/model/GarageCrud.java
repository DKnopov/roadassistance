package com.roadassistance.model;

import com.roadassistance.api.dto.EditServiceProfile;
import com.roadassistance.api.dto.GetServiceProfile;
import com.roadassistance.api.dto.Registration;
import com.roadassistance.entity.Garage;
import com.roadassistance.interfaces.IGarage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

@Repository
public class GarageCrud implements IGarage {
    @Autowired
    MongoOperations mongoOperations;

    @Override
    public void editServiceProfile(EditServiceProfile editServiceProfile) {
        Garage garage = mongoOperations.findById(editServiceProfile.getGarageId(), Garage.class);
        garage.setPhoto(editServiceProfile.getPhoto());
        garage.setEmail(editServiceProfile.getEmail());
        garage.setAddress(editServiceProfile.getAddress());
        garage.setPhone(editServiceProfile.getPhone());
        garage.setCompanyName(editServiceProfile.getCompanyName());
        garage.setGeoLocation(editServiceProfile.getGeoLocation());
        garage.setDistance(editServiceProfile.getDistance());
        garage.setBrand(editServiceProfile.getBrand());
        mongoOperations.save(garage);
    }

    @Override
    public GetServiceProfile getServiceProfile(String garageId) {
        Garage garage = mongoOperations.findById(garageId, Garage.class);
        GetServiceProfile getServiceProfile = new GetServiceProfile(
                garage.getEmail(), garage.getPhone(),
                garage.getCompanyName(), garage.getRating(),
                garage.getFeedbacks(), garage.getDistance());
        return getServiceProfile;
    }

    @Override
    public boolean registrationService(Registration registration) {
        if (mongoOperations.findById(registration.getEmail(), Garage.class) != null) {
            return false;
        }
        Garage garage = new Garage(registration.getEmail(), registration.getEmail(), registration.getPassword());
        mongoOperations.save(garage);
        return true;
    }

}
