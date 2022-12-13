package com.cydeo.entity;

import com.cydeo.enums.MovieState;
import com.cydeo.enums.MovieType;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
//@Table we did not change the name because data will come from dataSQL and name is movie there for the table it needs to match
public class Movie extends BaseEntity {

    private String name;
    @Column(columnDefinition = "DATE")
    private LocalDate releaseDate;
    private Integer duration;
    @Column(columnDefinition = "text") //we put text because for character there is a limit for text there is no
    private String summary;
    @Enumerated(EnumType.STRING)
    private MovieType type;
    @Enumerated(EnumType.STRING)
    private MovieState state;
    private BigDecimal price;

    //parent is Movie.
    // every movie can have many genre
    //every genre can belong to more than one genre
    @ManyToMany
    // we did not add Movie to Genre if we add it will create another table we need to drop it by using mappedBy or not add that field into Genre
    @JoinTable(name = "movie_genre_rel",
            joinColumns = @JoinColumn(name = "movie_id"),//movie tables primary key
            inverseJoinColumns = @JoinColumn(name = "genre_id"))//other table,s id
    private List<Genre> genreList;


}
