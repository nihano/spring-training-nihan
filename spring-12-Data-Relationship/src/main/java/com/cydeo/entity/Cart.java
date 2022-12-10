package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(name = "cart_item_rel",//to change the joined table name. we put rel end of join table to understand it is join table
    joinColumns = @JoinColumn(name ="c_id"), //changed carts_id name
    inverseJoinColumns = @JoinColumn(name = "i_id")) //changed foreign key name items_id

    private List<Item> itemList;

}
