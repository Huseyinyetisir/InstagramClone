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
public class CreateUserRequest extends BaseUserRequest{

    private String  id;

}
