package com.kovanlabs.intern.week.task.oopscollection.topicspractice.oops;

class Student{
    String studentName ,studentRollNo ;int examMarks;
    Student(String studentName, String studentRollNo, int examMarks){
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
        this.examMarks = examMarks;
    }
    public String toString(){
        return "\nStudents Name : "+studentName+"\nRoll No : "+studentRollNo+"\nExam Marks : "+examMarks;
    }
}

public class ClassesandObjects {
    public static void main(String[] args) {
        System.out.println(new Student("Abilesh","22BCS002",100).toString());
    }
}
