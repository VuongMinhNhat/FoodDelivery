package com.cybersoft.FoodDelivery.entity;

import javax.persistence.*;

@Entity(name = "material")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToOne(mappedBy = "material")
    private Food food;
}
