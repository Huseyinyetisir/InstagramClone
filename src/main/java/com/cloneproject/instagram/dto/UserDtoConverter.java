package com.cloneproject.instagram.dto;

import com.cloneproject.instagram.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDtoConverter {

    public UserDto convert(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setDateOfBirth(user.getDateOfBirth());
        userDto.setCity(user.getCity());

    return userDto;
    }

}



