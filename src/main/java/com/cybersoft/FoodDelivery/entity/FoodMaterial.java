package com.cybersoft.FoodDelivery.entity;

import javax.persistence.*;

@Entity(name = "food_material")
public class FoodMaterial {
    @Id
    @Column(name = "id_food")
    private int idFood;

    @Id
    @Column(name = "id_material")
    private int idMaterial;
}

