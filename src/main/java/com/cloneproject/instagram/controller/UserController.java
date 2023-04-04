package com.cloneproject.instagram.controller;


import com.cloneproject.instagram.dto.CreateUserRequest;
import com.cloneproject.instagram.dto.UpdateUserRequest;
import com.cloneproject.instagram.dto.UserDto;
import com.cloneproject.instagram.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping
    public ResponseEntity<UserDto> createUser (@RequestBody CreateUserRequest createCustomerRequest){
        return ResponseEntity.ok(userService.createUser(createCustomerRequest));

    }
    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUser(){
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable String id){
        return ResponseEntity.ok(userService.getUserById(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable String id ,@RequestBody UpdateUserRequest updateUserRequest){
        return ResponseEntity.ok(userService.updateUser(id,updateUserRequest));
    }
    @PatchMapping("/{id}")
    public ResponseEntity<Void> deactiveUser (@PathVariable("id") String id){
        userService.deactiveUser(id);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser (@PathVariable("id") String id) {
        userService.deleteUser(id);
        return ResponseEntity.ok().build();


    }
}
