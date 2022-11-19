package com.cydeo.entity;

import org.springframework.context.annotation.Primary;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //to create table in the DB without writing SQL code
public class Employee {
    //we need something unique as Primary Key
    @Id //to make the field Primary Key
    private int id;
    private String name;

}
