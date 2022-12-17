package com.example.Obs.Controller;

import com.example.Obs.Entity.ExamResult;
import com.example.Obs.Entity.Student;
import com.example.Obs.Repository.ExamResultRepository;
import com.example.Obs.Service.ExamResultService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ExamResult")
public class ExamResultController {

    private final ExamResultService examResultService;

    public ExamResultController(ExamResultService examResultService) {
        this.examResultService = examResultService;
    }

    @GetMapping
    public List<ExamResult> findAllExamResult(){
        return examResultService.findAllExamResult();
    }

    @PostMapping
    public ExamResult saveExamResult(@RequestBody ExamResult examResult){
        return examResultService.saveExamResult((examResult));
    }


    //ortalama hesabı yap
    //bir dersten 3 almışsa tamamlamış sayılsın



}
