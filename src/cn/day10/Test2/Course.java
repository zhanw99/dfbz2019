package cn.day10.Test2;

import java.util.ArrayList;

/**
 * 课程
 */
public class Course {
    private String courseName;
    private Teacher teacher;
    private Student student;


    public Course(String courseName, Teacher teacher, Student student, ArrayList<Student> arrayList) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.student = student;
    }

    public Course() {
    }

    public  void show(){
        System.out.println("课程名称:"+courseName);
        System.out.println("授课老师:"+teacher.getName());

    }

    public Course(String courseName, Teacher teacher, Student student) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.student = student;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
