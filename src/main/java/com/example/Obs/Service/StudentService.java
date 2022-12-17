package com.example.Obs.Service;

import com.example.Obs.Entity.Student;
import java.util.List;

public interface StudentService {

    List<Student>  findAllStudent();
    Student saveStudent(Student student);


}
