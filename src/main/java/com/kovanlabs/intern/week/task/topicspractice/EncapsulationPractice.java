package com.kovanlabs.intern.week.task.topicspractice;

class Student{
    private String studentName;
    private int userId , subjectMarks;
    public Student( int userId, String studentName, int subjectMarks){
        if(subjectMarks > 0 && subjectMarks < 100){
            this.userId = userId;
            this.studentName = studentName;
            this.subjectMarks = subjectMarks;
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getSubjectMarks() {
        return subjectMarks;
    }

    public void setSubjectMarks(int subjectMarks) {
        this.subjectMarks = subjectMarks;
    }
    public String toString(){
        if(subjectMarks > 0 && subjectMarks < 100){
            return  userId + " | " + studentName + " | " + subjectMarks ;
        }
        else{
            return "Invalid input";
        }

    }
}

public class EncapsulationPractice {
    public static void main(String[] args) {
        Student student = new Student(1,"Kovan",-1);
        System.out.println(student.toString());
    }
}
