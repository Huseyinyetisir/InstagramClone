package com.cloneproject.instagram.model;

import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Post {

    @Id
    private String id;

    private String userId;

    private String imageUrl;

    private String caption;
//    @ManyToOne
//    @JoinColumn(name = "user_id",nullable = false)
//    private User user;
}
