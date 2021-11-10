package com.example.DataJPA.SQLDriver.SpringWeb.Thymeleaf.data.service;

import com.example.DataJPA.SQLDriver.SpringWeb.Thymeleaf.data.models.mHeadset;
import com.example.DataJPA.SQLDriver.SpringWeb.Thymeleaf.data.payloads.request.mHeadsetRequest;
import com.example.DataJPA.SQLDriver.SpringWeb.Thymeleaf.data.payloads.response.mHeadsetResponse;

import com.example.DataJPA.SQLDriver.SpringWeb.Thymeleaf.data.repository.mHeadsetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//Localdate
import java.time.LocalDate; // import the LocalDate class


import java.util.List;
import java.util.Optional;

@Component
public class mHeadsetServiceImplementation implements mHeadetServiceInterface {

    @Autowired
    mHeadsetRepository mheadsetRepository;

    @Override
    public mHeadsetResponse createNewHeadset(mHeadsetRequest headsetRequest) {
        LocalDate currentDate = LocalDate.now(); // Create a date object


        mHeadset newHeadset = new mHeadset();
        newHeadset.setHeadsetNAME(headsetRequest.getHeadsetNAME());
        mheadsetRepository.save(newHeadset);
        return new mHeadsetResponse("New Headset added" + currentDate);
    }

}
