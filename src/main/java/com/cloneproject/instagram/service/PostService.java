package com.cloneproject.instagram.service;


import com.cloneproject.instagram.dto.*;
import com.cloneproject.instagram.model.Post;
import com.cloneproject.instagram.model.User;
import com.cloneproject.instagram.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final UserService userService;
    private final PostRepository postRepository;
    private final PostDtoConverter postDtoConverter;
    public PostService(UserService userService, PostRepository postRepository, PostDtoConverter postDtoConverter) {
        this.userService = userService;
        this.postRepository = postRepository;
        this.postDtoConverter = postDtoConverter;
    }


    public PostDto createPost(CreatePostRequest createPostRequest) {
        User user =  userService.getUserById(createPostRequest.getUserId());

        if (user.getId()== ""|| user.getId() == null){
            return PostDto.builder().build();
        }
        Post post = Post.builder()
                .id(createPostRequest.getId())
                .userId(createPostRequest.getUserId())
                .caption(createPostRequest.getCaption())
                .imageUrl(createPostRequest.getImageUrl())
                .build();
        return postDtoConverter.convert(postRepository.save(post));


//        Post post = new Post();
//        post.setId(createPostRequest.getId());
//        post.setCaption(createPostRequest.getCaption());
//        post.setImageUrl(createPostRequest.getImageUrl());
//
//        postRepository.save(post);
//
//        PostDto postDto = new PostDto();
//        postDto.setId(createPostRequest.getId());
//        postDto.setCaption(createPostRequest.getCaption());
//        postDto.setImageUrl(createPostRequest.getImageUrl());
//
//        postRepository.save(post);
//        return postDtoConverter.convert(post);
    }

    public PostDto updatePost(String id ,UpdatePostRequest updatePostRequest){
        User user = userService.getUserById(updatePostRequest.getUserId());
        if (user.getId()==""||user.getId()==null){
            return PostDto.builder().build();
        }
        Optional<Post> postOptional =postRepository.findById(id);

        postOptional.ifPresent(post -> {
            post.setUserId(updatePostRequest.getUserId());
            post.setImageUrl(updatePostRequest.getImageUrl());
            post.setCaption(updatePostRequest.getCaption());
            postRepository.save(post);
        } );
        return postOptional.map(postDtoConverter::convert).orElse(new PostDto());
    }

    public List<PostDto> getAllPosts() {
        List<Post> postList = postRepository.findAll();
        List<PostDto> postDtoList = new ArrayList<>();

        for (Post post:postList){
            postDtoList.add(postDtoConverter.convert(post));
        }
        return postDtoList;
    }

    public PostDto getPostById(String id) {
        Optional<Post> postOptional = postRepository.findById(id);
        return postOptional.map(postDtoConverter::convert).orElse(new PostDto());
    }



}
