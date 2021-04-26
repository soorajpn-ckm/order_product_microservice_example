package com.sooraj.order.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "order_table")
@Getter
@Setter
@ToString
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Long totel;
    @OneToMany(cascade = CascadeType.ALL , mappedBy = "order")
    private Set<Product> products  = new HashSet<>();

}
