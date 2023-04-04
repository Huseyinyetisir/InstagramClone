package com.cloneproject.instagram.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreatePostRequest extends BasePostRequest{
    private String id;
}
