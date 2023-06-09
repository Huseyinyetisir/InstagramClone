package com.cloneproject.instagram.dto;

import com.cloneproject.instagram.model.City;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    private String    id;

    private String  mail;

    private String  firstName;

    private String  lastName;

    private String  dateOfBirth;

    private City    city;


}
