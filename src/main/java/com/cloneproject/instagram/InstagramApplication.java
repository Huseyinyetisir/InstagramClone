package com.cloneproject.instagram;

import com.cloneproject.instagram.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InstagramApplication {


	private final UserRepository userRepository;

	public InstagramApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(InstagramApplication.class, args);
	}


}
