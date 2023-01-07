package com.cydeo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {

    @JsonIgnore //to not show in the JSON when create and POST, otherwise Jackson will convert this as null because we did not add id in the JSON body because it's generated automatically in entity and saved in the DB
    private Long id;
    private String name;
    private String category;
    private int rating;
    private String description;

}
