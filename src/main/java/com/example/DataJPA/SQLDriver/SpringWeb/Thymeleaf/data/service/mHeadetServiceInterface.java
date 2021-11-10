package com.example.DataJPA.SQLDriver.SpringWeb.Thymeleaf.data.service;

import com.example.DataJPA.SQLDriver.SpringWeb.Thymeleaf.data.models.mHeadset;
import com.example.DataJPA.SQLDriver.SpringWeb.Thymeleaf.data.payloads.request.mHeadsetRequest;
import com.example.DataJPA.SQLDriver.SpringWeb.Thymeleaf.data.payloads.response.mHeadsetResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface mHeadetServiceInterface {

    mHeadsetResponse createNewHeadset(mHeadsetRequest headsetRequest);
}
