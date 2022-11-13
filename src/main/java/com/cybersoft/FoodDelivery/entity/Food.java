package com.cybersoft.FoodDelivery.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "food")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "image")
    private String image;

    @Column(name = "price")
    private int price;

//    Foreign key
//    private int idCategory;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

//    Foreign key
//    private int idRestaurant;

    @ManyToOne
    @JoinColumn(name = "id_restaurant")
    private Restaurant restaurant;

    @OneToOne(mappedBy = "food", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private FoodDetail foodDetail;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "food_material",
            joinColumns =
                    { @JoinColumn(name = "id_food", referencedColumnName = "id") },
            inverseJoinColumns =
                    { @JoinColumn(name = "id_material", referencedColumnName = "id") })
    private Material material;

    @JsonIgnore
    @OneToMany(mappedBy = "food")
    private Set<FoodAddOn> foodAddOns;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "food_order",
            joinColumns =
                    { @JoinColumn(name = "id_food", referencedColumnName = "id") },
            inverseJoinColumns =
                    { @JoinColumn(name = "id_order", referencedColumnName = "id") })
    private TOrder tOrder;

    @JsonIgnore
    @OneToMany(mappedBy = "food")
    private Set<FoodReview> foodReviews;
}
