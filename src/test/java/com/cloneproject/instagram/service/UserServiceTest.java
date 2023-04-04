package com.cloneproject.instagram.service;

import com.cloneproject.instagram.dto.CreateUserRequest;
import com.cloneproject.instagram.dto.UserDtoConverter;
import com.cloneproject.instagram.model.City;
import com.cloneproject.instagram.model.User;
import com.cloneproject.instagram.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class UserServiceTest {

    private UserRepository userRepository;
    private UserDtoConverter userDtoConverter;

    private UserService userService;

    public UserServiceTest(UserRepository userRepository, UserDtoConverter userDtoConverter) {
        this.userRepository = userRepository;
        this.userDtoConverter = userDtoConverter;
    }

    @Before
    public void setUp() throws Exception {

        userRepository = Mockito.mock(UserRepository.class);
        userDtoConverter = Mockito.mock(UserDtoConverter.class);
        userService = new UserService(userRepository, userDtoConverter);

    }

    @Test
    public void whenCreateUserCalledWithValidRequest_ItShouldReturnValidUserDto(){
        CreateUserRequest createUserRequest = new CreateUserRequest("1234");
        createUserRequest.setFirstName("Hüseyin");
        createUserRequest.setLastName("Yteişir");
        createUserRequest.setMail("huseyin@gmail.com");
        createUserRequest.setCity(City.ISTANBUL);
        createUserRequest.setDateOfBirth("1999");


    }
}