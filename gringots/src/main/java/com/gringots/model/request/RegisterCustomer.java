package com.gringots.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties
@Getter
@Setter
public class RegisterCustomer{

    private String firstName;
    private String lastName;
    private String nic;
    private String dob;
    private String email;
    private String address;
    private String phoneNumber;
    private String nicImage;
    private String customerType;
    private String organizationName;
    private String organizationRegNo;
    private String password;

//    private String username;
//    private String password;
//    private String email;
//    private String mobileNo;
//    private String nic;
//    private String passport;
//    private String firstName;
//    private String lastName;
//    private String profilePicPath;
//    private String latitude;
//    private String longitude;
//    private String nicImagePath;
//    private String kycImagePath;
//    private int referrerId;
//    private String preferredLanguage;
}
