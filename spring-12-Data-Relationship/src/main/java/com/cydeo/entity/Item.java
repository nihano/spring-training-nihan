package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemName;
    private String code;

    @ManyToMany(mappedBy = "itemList")
    private List<Cart> carts;

    public Item(String itemName, String code) {
        this.itemName = itemName;
        this.code = code;
    }
}
