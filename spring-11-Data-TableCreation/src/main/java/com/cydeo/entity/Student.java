package com.cydeo.entity;

import com.cydeo.enums.Gender;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collections;

@Entity  //to create table in the DB without writing SQL code
@Table(name = "students") //to change the default table name
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //id will be created by postgres
    private Long id;

    @Column(name = "studentFirstName") //to change the column name
    private String firstName;
    @Column(name = "studentLastName")
    private String lastName;
    private String email;

    @Column(columnDefinition = "DATE")
    private LocalDate birthDate;
    @Column(columnDefinition = "TIME")
    private LocalTime birthTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime birthDateTime;

    @Enumerated(EnumType.STRING)
//    @Enumerated(EnumType.ORDINAL) this is numbers (0,1)
    private Gender gender; //if we do not add any definition it will assign integer value in DB

    @Transient //sometimes in the class we do not want to show fields in the table. We do not want to create column from city here.
    private String city;
}
