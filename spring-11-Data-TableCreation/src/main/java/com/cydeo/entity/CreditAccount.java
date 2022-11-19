package com.cydeo.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class CreditAccount extends Account {
    //Note: Primary Key is in Account
    private BigDecimal creditLimit;
}
