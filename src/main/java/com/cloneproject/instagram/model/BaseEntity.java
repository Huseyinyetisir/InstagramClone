package com.cloneproject.instagram.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;

public class BaseEntity {

    @CreatedDate
    private Instant CreatedDate;

    @LastModifiedDate
    private Instant LastModifiedDate ;

}
