package com.cloneproject.instagram.repository;

import com.cloneproject.instagram.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,String> {
}
