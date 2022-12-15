package com.cydeo.entity;

import com.cydeo.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table(name = "employees")
public class Employee extends BaseEntity {
    private String firstName;
    private String lastName;
    private String email;
    @Column(columnDefinition = "DATE")// this is not mandatory anymore so spring will recognize it as DATE
    private LocalDate hireDate;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Integer salary;
    @ManyToOne
    @JoinColumn(name = "department") //department is FK in employees table. Name changed because defaul would be department_id. it is department in data.sql
    private Department department;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;





}
