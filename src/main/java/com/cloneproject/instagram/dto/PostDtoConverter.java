package com.cloneproject.instagram.dto;

import com.cloneproject.instagram.model.Post;
import net.bytebuddy.asm.Advice;
import org.springframework.stereotype.Component;

@Component
public class PostDtoConverter {

    public PostDto convert(Post post){
        PostDto postDto = new PostDto();
        postDto.setId(post.getId());
        postDto.setUserId(post.getUserId());
        postDto.setCaption(post.getCaption());
        postDto.setImageUrl(post.getImageUrl());
        return postDto;
    }
}
