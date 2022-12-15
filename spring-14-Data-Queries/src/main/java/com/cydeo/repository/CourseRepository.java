package com.cydeo.repository;

import com.cydeo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course, Long> {

    //Find all courses by category select * from courses where category = ...
    //select =  find/read/get in derived queries
    List<Course> findByCategory(String category);

    //Find all courses by category and order the entities by name
    List<Course> findByCategoryOrderByName(String category);

    //Checks if a course with the supplied name exists. Return true if exists, or false
    boolean existsCourseByName(String name);

    //Return the count of courses for the given category
    int countByCategory(String category);

    //finds all the courses that start with the given course name string
    List<Course> findByNameStartsWith(String str);

    //Find all courses by category and returns a stream
    Stream<Course> streamAllByCategory(String category);





}

