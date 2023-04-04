package com.cloneproject.instagram.dto;


import com.cloneproject.instagram.model.City;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateUserRequest {

    private String  id;

    private String  mail;

    private String  firstName;

    private String  lastName;

    private String  dateOfBirth;

    private City    city;

}
