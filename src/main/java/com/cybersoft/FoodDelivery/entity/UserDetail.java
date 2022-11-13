package com.cybersoft.FoodDelivery.entity;

import javax.persistence.*;

@Entity(name = "user_detail")
public class UserDetail {

    @Id
    @Column(name = "id_user")
    private int idUser;

    @Column(name = "address")
    private String address;

    @Column(name = "mobile_phone")
    private String mobilePhone;

    @Column(name = "state")
    private String state;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_user")
    private User user;

}
