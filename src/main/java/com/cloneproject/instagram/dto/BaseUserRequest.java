package com.cloneproject.instagram.dto;

import com.cloneproject.instagram.model.City;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Builder
public class BaseUserRequest {

    private String  mail;

    private String  firstName;

    private String  lastName;

    private String  dateOfBirth;

    private City    city;
}
