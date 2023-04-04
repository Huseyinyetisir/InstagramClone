package com.cloneproject.instagram.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String  id;

    private String  mail;

    private String  firstName;

    private String  lastName;

    private String  dateOfBirth;

    private City    city;

    @OneToMany(mappedBy = "user")
    @JoinColumn(name = "post_id", nullable = false)
    private Set<Post> post;


}
