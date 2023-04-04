package com.cloneproject.instagram.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
@Entity
@Table(name = "POSTS")
public class Post {

    @Id
    private String id;

    @CreatedBy
    private String username;

    @NotNull
    private String imageUrl;

    @NotNull
    private String caption;
    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;
}
