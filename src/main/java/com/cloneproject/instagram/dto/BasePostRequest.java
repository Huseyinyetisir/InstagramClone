package com.cloneproject.instagram.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BasePostRequest {

    private String userId;


    private String imageUrl;

    private String caption;
}
