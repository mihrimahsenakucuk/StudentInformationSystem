package com.example.Obs.Impl;

import com.example.Obs.Entity.ExamResult;
import com.example.Obs.Repository.ExamResultRepository;
import com.example.Obs.Service.ExamResultService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamResultServiceImplementation implements ExamResultService {

    private final ExamResultRepository examResultRepository;

    public ExamResultServiceImplementation(ExamResultRepository examResultRepository) {
        this.examResultRepository = examResultRepository;
    }

    @Override
    public List<ExamResult> findAllExamResult() {
        return examResultRepository.findAll();
    }

    @Override
    public ExamResult saveExamResult(ExamResult examResult) {
        return examResultRepository.save(examResult);
    }
}
