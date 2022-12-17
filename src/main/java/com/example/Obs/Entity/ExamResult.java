package com.example.Obs.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Exam_Result")
public class ExamResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "student_id")
    private int studentId;
    @Column(name = "course_id")
    private int courseId;
    @Column(name = "score")
    private int score;
    @Column(name="average")
    private int average;


    public ExamResult() {
    }

    public ExamResult(int id, int studentId, int courseId, int score, int average) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.score = score;
        this.average = average;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void averageExam(){
        average=(score / courseId );
        averageExam();
    }

    public void completedCourse(){
        if(score==3){
            System.out.println("You have completed the course");
        }
    }
}
