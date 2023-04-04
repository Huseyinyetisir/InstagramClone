package com.cloneproject.instagram.dto;

import com.cloneproject.instagram.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDtoConverter {

    public UserDto convert(User user){
        UserDto userDto = new UserDto();
        userDto.setMail(user.getMail());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setDateOfBirth(user.getDateOfBirth());
        userDto.setCity(user.getCity());

    return userDto;
    }

}



