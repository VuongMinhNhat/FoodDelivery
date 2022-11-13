package com.cybersoft.FoodDelivery.entity;

import javax.persistence.*;

@Entity(name = "t_order")
public class TOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//    Foreign key
//    private int idUser;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @Column(name = "estimate_ship")
    private String estimateShip;

    @Column(name = "deliver_address")
    private String deliverAddress;

    @OneToOne(mappedBy = "tOrder")
    private Food food;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "order_status",
            joinColumns =
                    { @JoinColumn(name = "id_order", referencedColumnName = "id") },
            inverseJoinColumns =
                    { @JoinColumn(name = "id_status", referencedColumnName = "id") })
    private Status status;

}
