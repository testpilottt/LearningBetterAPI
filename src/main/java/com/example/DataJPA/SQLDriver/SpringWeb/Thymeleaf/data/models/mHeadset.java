package com.example.DataJPA.SQLDriver.SpringWeb.Thymeleaf.data.models;

//Lombok
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class mHeadset {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private @Getter @Setter Integer headsetID;
    private @Getter @Setter String headsetNAME;
    private @Getter @Setter String headsetMAC;

}
