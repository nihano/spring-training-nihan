package com.cydeo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity//to create table in the DB without writing SQL code
@NoArgsConstructor //when we work with Entity we need NoArgConstructor
@Data
//@AllArgsConstructor -> id will be provided by postgres, so we do not add @AllArgsConstructor
public class Car {

    //we need something unique as Primary Key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
}

