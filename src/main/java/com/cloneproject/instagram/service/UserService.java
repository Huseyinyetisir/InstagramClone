package com.cloneproject.instagram.service;

import com.cloneproject.instagram.dto.CreateUserRequest;
import com.cloneproject.instagram.dto.UpdateUserRequest;
import com.cloneproject.instagram.dto.UserDto;
import com.cloneproject.instagram.dto.UserDtoConverter;
import com.cloneproject.instagram.model.City;
import com.cloneproject.instagram.model.User;
import com.cloneproject.instagram.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserDtoConverter userDtoConverter;

    public UserService(UserRepository userRepository, UserDtoConverter userDtoConverter) {
        this.userRepository = userRepository;
        this.userDtoConverter = userDtoConverter;
    }


    public UserDto createUser (CreateUserRequest createUserRequest){
        User user = new User();
        user.setId(createUserRequest.getId());
        user.setMail(createUserRequest.getMail());
        user.setFirstName(createUserRequest.getFirstName());
        user.setLastName(createUserRequest.getLastName());
        user.setDateOfBirth(String.valueOf(createUserRequest.getDateOfBirth()));
        user.setCity(City.valueOf(createUserRequest.getCity().name()));

        userRepository.save(user);

        UserDto userDto = new UserDto();
        userDto.setId(createUserRequest.getId());
        userDto.setMail(createUserRequest.getMail());
        userDto.setFirstName(createUserRequest.getFirstName());
        userDto.setLastName(createUserRequest.getLastName());
        userDto.setDateOfBirth(String.valueOf(createUserRequest.getDateOfBirth()));
        userDto.setCity(City.valueOf(createUserRequest.getCity().name()));

        userRepository.save(user);

        return userDtoConverter.convert(user);


    }

    public List<UserDto> getAllUsers(){
        List<User> userList = userRepository.findAll();
        List<UserDto> userDtoList = new ArrayList<>();

    for (User user:userList){
        userDtoList.add(userDtoConverter.convert(user));
    }
    return userDtoList;
    }

    public UserDto getUserDtoById(String id){
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.map(userDtoConverter::convert).orElse(new UserDto());
    }

    public UserDto updateUser(String id,UpdateUserRequest updateUserRequest) {
        Optional<User> userOptional = userRepository.findById(id);

        userOptional.ifPresent(user -> {
            user.setFirstName(updateUserRequest.getFirstName());
            user.setLastName(updateUserRequest.getLastName());
            user.setLastName(updateUserRequest.getMail());
            userRepository.save(user);

        });
        return userOptional.map(userDtoConverter::convert).orElse(new UserDto());
    }

    public void deactiveUser(String id) {
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

    protected User getUserById (String id){
        return userRepository.findById(id).orElse(new User());
    }
}
