package com.cybersoft.FoodDelivery.entity;

import javax.persistence.*;

@Entity(name = "food_review")
public class FoodReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//    Foreign key
//    private int idFood;

    @ManyToOne
    @JoinColumn(name = "id_food")
    private Food food;

//    Foreign key
//    private int idUser;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @Column(name = "content")
    private String content;

    @Column(name = "create_date")
    private String createDate;

    @Column(name = "rate")
    private float rate;
}
