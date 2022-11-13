package com.cybersoft.FoodDelivery.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "restaurant")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "image")
    private String image;

    @Column(name = "name")
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "restaurant")
    private Set<RestaurantReview> restaurantReviews;
}
