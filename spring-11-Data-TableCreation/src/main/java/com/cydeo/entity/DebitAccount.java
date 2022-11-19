package com.cydeo.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class DebitAccount extends Account {

    //Note: Primary Key is in Account
    private BigDecimal overDraftFee;
}
