package com.cybersoft.FoodDelivery.entity;

import javax.persistence.*;

@Entity(name = "status")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToOne(mappedBy = "status")
    private TOrder tOrder;
}
