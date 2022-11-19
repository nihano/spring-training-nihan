package com.cydeo.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@MappedSuperclass //we do not want to create table from this class. This class only provides inheritance relationship to other entities.
public class Account {

    /*
    there is inheritance between Account and CreditAccount and DebitAccount
    Primary Key is coming from Account
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //id will be created by postgres
    private Long id;
    private String owner;
    private BigDecimal balance;
    private BigDecimal interestRate;
}
