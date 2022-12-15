package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
@NoArgsConstructor
@Data
public class Department {
    @Id
    private String department; // PK in departments table is department so it does not extend from BaseEntity
    private String division;
}
