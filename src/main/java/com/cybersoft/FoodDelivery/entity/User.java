package com.cybersoft.FoodDelivery.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "token")
    private String token;

    @Column(name = "type_token")
    private String typeToken;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "verify_code")
    private String verifyCode;

    @Column(name = "verify_code_expired")
    private String verifyCodeExpired;

    @Column(name = "is_active")
    private int isActive;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private UserDetail userDetail;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private Set<TOrder> tOrders;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private Set<FoodReview> foodReviews;
}
