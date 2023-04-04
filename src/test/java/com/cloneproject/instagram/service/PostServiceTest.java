package com.cloneproject.instagram.service;

import com.cloneproject.instagram.dto.CreatePostRequest;
import com.cloneproject.instagram.dto.PostDtoConverter;
import com.cloneproject.instagram.dto.UserDtoConverter;
import com.cloneproject.instagram.model.City;
import com.cloneproject.instagram.model.Post;
import com.cloneproject.instagram.model.User;
import com.cloneproject.instagram.repository.PostRepository;
import com.cloneproject.instagram.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PostServiceTest {


    private PostService postService;

    private  PostRepository postRepository;
    private  UserService userService;

    private  PostDtoConverter postDtoConverter;



    @Before
    public void setUp() throws Exception {
        postRepository = Mockito.mock(PostRepository.class);
        postDtoConverter = Mockito.mock(PostDtoConverter.class);
        userService = Mockito.mock(UserService.class);
        postService = new PostService(userService,postRepository,postDtoConverter);

    }
    @Test
    public void WhenCreatePostCalledWithValidRequest_ItShouldReturnValidPostDto(){
        CreatePostRequest createPostRequest = new CreatePostRequest("1234");
        createPostRequest.setUserId("12345");
        createPostRequest.setImageUrl("sadsadsadda");
        createPostRequest.setCaption("asdkmakdmsa");

        User user = User.builder()
                .id("12345")
                .firstName("Sadık")
                .lastName("Solmaz")
                .mail("sado@gmail.com")
                .dateOfBirth("1998")
                .city(City.ISTANBUL)
                .build();

        Post post = Post.builder()
                .id(createPostRequest.getId())
                .userId(createPostRequest.getUserId())
                .caption(createPostRequest.getCaption())
                .imageUrl(createPostRequest.getImageUrl())
                .build();

        Mockito.when(userService.getUserById("12345")).thenReturn(user);
    }

}