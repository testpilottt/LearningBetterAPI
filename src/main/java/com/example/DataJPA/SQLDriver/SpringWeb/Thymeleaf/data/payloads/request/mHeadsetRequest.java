package com.example.DataJPA.SQLDriver.SpringWeb.Thymeleaf.data.payloads.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
//Lombok
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class mHeadsetRequest {

    @NotBlank
    @NotNull
    private @Getter @Setter String headsetNAME;
    private @Getter @Setter String headsetMAC;


}
