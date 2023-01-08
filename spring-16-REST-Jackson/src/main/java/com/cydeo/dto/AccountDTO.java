package com.cydeo.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties(value = {"address", "country"}, ignoreUnknown = true) to ignore multiple fields
@JsonIgnoreProperties(ignoreUnknown = true) //ignoreUnknown = true if there is anything coming from API to my app that I don't know, these things that are not known will get into our app
public class AccountDTO {

    @JsonIgnore
    private String name;
    private String address;
    private String country;
    private String state;
    private String city;
    private Integer age;
    private String postalCode;

    @JsonBackReference  // This field is not going to be serialized, we can still send User info if we want
//    @JsonIgnore we do not use in every-case this because it is because if want send user info we cannot. it will be ignored in request in respond
    private UserDTO user;

}
