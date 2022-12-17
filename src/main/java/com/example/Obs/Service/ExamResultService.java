package com.example.Obs.Service;

import com.example.Obs.Entity.ExamResult;


import java.util.List;

public interface ExamResultService {

    List<ExamResult> findAllExamResult();
    ExamResult saveExamResult(ExamResult examResult);

}
