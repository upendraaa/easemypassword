package com.example.easemypassword.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class User {

    @Id
    @Column
    private int id;

    @Column
    private String userId;

    @Column
    private String name;

    @Column
    private String email;

    /**
     * This field will be ignored during serialization and deserialization
     */
    @Column
    @JsonIgnore
    private String password;

    @Column
    private String phoneNumber;


}
