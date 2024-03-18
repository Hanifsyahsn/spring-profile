package com.simple.simplespringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1L, "Learn Spring", "1"),
                new Course(2L, "Learn Spring", "2"),
                new Course(3L, "Learn Spring", "3")
        );
    }

}
