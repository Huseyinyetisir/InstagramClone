package com.cloneproject.instagram.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    private String  id;

    private String  name;

    private String  dateOfBirth;
    private City    city;

}
