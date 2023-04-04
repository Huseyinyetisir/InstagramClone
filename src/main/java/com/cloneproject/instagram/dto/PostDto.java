package com.cloneproject.instagram.dto;


import lombok.*;

import javax.naming.directory.BasicAttribute;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostDto extends BasePostRequest {

    private String id;

}
