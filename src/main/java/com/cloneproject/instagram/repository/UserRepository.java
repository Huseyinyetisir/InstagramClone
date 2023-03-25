package com.cloneproject.instagram.repository;

import com.cloneproject.instagram.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {
}
