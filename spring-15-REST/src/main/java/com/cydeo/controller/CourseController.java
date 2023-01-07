package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;
import com.cydeo.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //(@Controller + @ResponseBody)
@RequestMapping("/courses/api/v1")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
//    @ResponseBody we do not need @RestController (@Controller + @ResponseBody)
    public List<CourseDTO> getAllCourses(){
        return courseService.getCourses();//we are not returning view anymore
    }

    @GetMapping({"{id}"})
    public CourseDTO getCourseById(@PathVariable("id") long courseId){
        return courseService.getCourseById(courseId);
    }

    @GetMapping("category/{name}") //localhost:8080/courses/category/Spring in postman with GET and send request to get JSON
    public List<CourseDTO> getCourseByCategory(@PathVariable("name") String category){
        return courseService.getCoursesByCategory(category);
    }

    @PostMapping
    public CourseDTO createCourse(@RequestBody CourseDTO course){ //to capture the JSON body
        return courseService.createCourse(course);
    }
    /*
     JSON body POST Example = we used @JasonIgnore to not display id=null in response
    {
    "name": "Spring REST",
    "category": "Spring",
    "rating": 4,
    "description": "Spring Boot gives all the power of the Spring Framework without all of the complexities"
    }
     */

    @PutMapping("{id}")
    public void updateCourse(@PathVariable("id") long courseId, @RequestBody CourseDTO course){
        courseService.updateCourse(courseId, course);
    }

    @DeleteMapping("{id}")
    public void deleteCourseById(@PathVariable("id") long courseId){
        courseService.deleteCourseById(courseId);
    }




}
