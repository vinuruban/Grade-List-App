package com.example.gradelist;

public class Word {

    private String subject;
    private double marks;
    private boolean status;
    private String grade;

    @Override
    public String toString() {
        return "Word{" +
                "subject='" + subject + '\'' +
                ", marks=" + marks +
                ", status=" + status +
                ", grade='" + grade + '\'' +
                '}';
    }

    public Word(String subject, double marks) {
        this.subject = subject;
        this.marks = marks;
        this.status = calculateStatus(marks);
        this.grade = calculateGrade(marks);
    }

    public String getSubject() {
        return subject;
    }

    public double getMarks() {
        return marks;
    }

    public boolean getStatus() {
        return status;
    }

    public String getGrade() {
        return grade;
    }

    private boolean calculateStatus(Double marks) {
        if (marks < 40) {
            return false;
        }
        else{
            return true;
        }
    }

    private String calculateGrade(Double marks) {
        if (marks >= 0 && marks < 39.5) {
            return "Fail";
        }
        else if (marks >= 39.5 && marks < 49.5){
            return "Third";
        }
        else if (marks >= 49.5 && marks < 59.5){
            return "2:2";
        }
        else if (marks >= 59.5 && marks < 69.5){
            return "2:1";
        }
        else if (marks >= 69.5 && marks <= 100){
            return "First";
        }
        else {
            return "Enter correct marks";
        }
    }

}
