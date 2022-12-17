package com.example.Obs.Controller;

import ch.qos.logback.core.model.Model;
import com.example.Obs.Entity.Student;
import com.example.Obs.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/controller")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/students")
    public List<Student> findAllStudent(){
        return studentService.findAllStudent();
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent((student));
    }


    @GetMapping("/")
    public String homePage(){
        return "homePage.html";
    }

    @GetMapping("/addStudent")
    public String addStudent(Model model, @ModelAttribute Student student){
        saveStudent(student);
        return "addStudent";
    }

    @GetMapping("listStudent")
    public String listStudent(Model model){
        return "listStudent";
    }




}
