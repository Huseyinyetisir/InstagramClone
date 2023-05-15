package com.cloneproject.instagram.controller;


import com.cloneproject.instagram.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/post")
public class PostController {

    private final PostService postService;


    public PostController(PostService postService) {
        this.postService = postService;
    }


    @PostMapping
    public ResponseEntity<PostDto> createPost (@RequestBody CreatePostRequest createPostRequest){
        return ResponseEntity.ok(postService.createPost(createPostRequest));

    }
    @GetMapping
    public ResponseEntity<List<PostDto>> getAllPosts(){
        return ResponseEntity.ok(postService.getAllPosts());
    }
        @GetMapping
    public ResponseEntity<List<PostDto>> getAllPosts2(){
        return ResponseEntity.ok(postService.getAllPosts());
    }

    @GetMapping("{id}")
    public ResponseEntity<PostDto> getPostById(@PathVariable String id){
        return ResponseEntity.ok(postService.getPostById(id));


    }
}
