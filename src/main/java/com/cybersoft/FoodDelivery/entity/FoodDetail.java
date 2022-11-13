package com.cybersoft.FoodDelivery.entity;

import javax.persistence.*;

@Entity(name = "food_detail")
public class FoodDetail {

    @Id
    @Column(name = "id_food")
    private int idFood;

    private String description;
    private String createDate;
    private float rating;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_food")
    private Food food;
}
