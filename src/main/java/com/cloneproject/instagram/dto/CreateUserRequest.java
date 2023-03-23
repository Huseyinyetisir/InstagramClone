package com.cloneproject.instagram.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateUserRequest {

    private String id;
    private String name;
    private Integer dateOfBirth;
    private CityDto city;
}
