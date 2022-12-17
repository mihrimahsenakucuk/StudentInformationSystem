package com.example.Obs.Impl;

import com.example.Obs.Entity.Course;
import com.example.Obs.Entity.ExamResult;
import com.example.Obs.Repository.CourseRepository;
import com.example.Obs.Service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImplementation implements CourseService {

    private final CourseRepository courseRepository;

    public CourseServiceImplementation(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> findAllCourse() {
        return courseRepository.findAll();
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }
}
