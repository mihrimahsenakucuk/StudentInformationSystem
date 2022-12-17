package com.example.Obs.Service;

import com.example.Obs.Entity.Course;
import com.example.Obs.Entity.ExamResult;


import java.util.List;

public interface CourseService {

    List<Course> findAllCourse();
    Course saveCourse(Course course);
}
