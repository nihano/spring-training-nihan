package com.cydeo.entity;

import com.cydeo.enums.UserRole;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "account_details")
public class Account extends BaseEntity{

    private String name;
    private String address;
    private String country;
    private String state;
    private String city;
    private Integer age;
    private String postalCode;
    @Enumerated(EnumType.STRING)
    private UserRole role;
    @OneToOne(mappedBy = "account")// we do not want 2 foreign key, there is no FK in AccountDetails table
    private User user;

}
