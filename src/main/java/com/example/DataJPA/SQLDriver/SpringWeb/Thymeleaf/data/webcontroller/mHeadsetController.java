package com.example.DataJPA.SQLDriver.SpringWeb.Thymeleaf.data.webcontroller;


import com.example.DataJPA.SQLDriver.SpringWeb.Thymeleaf.data.payloads.request.mHeadsetRequest;
import com.example.DataJPA.SQLDriver.SpringWeb.Thymeleaf.data.payloads.response.mHeadsetResponse;
import com.example.DataJPA.SQLDriver.SpringWeb.Thymeleaf.data.service.mHeadetServiceInterface;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/elcam")

@ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 400, message = "This is a bad request, please follow the API documentation for the proper request format"),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Due to security constraints, your access request cannot be authorized"),
        @io.swagger.annotations.ApiResponse(code = 500, message = "The server is down. Please bear with us."),
}
)
public class mHeadsetController {

    @Autowired
    mHeadetServiceInterface mheadsetService;

    @PostMapping("/add")
    public ResponseEntity<mHeadsetResponse> addEmployee(@RequestBody mHeadsetRequest vheadset) {
        mHeadsetResponse newHeadset = mheadsetService.createNewHeadset(vheadset);
        return new ResponseEntity<>(newHeadset, HttpStatus.CREATED);
    }

}
