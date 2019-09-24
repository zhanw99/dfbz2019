package cn.day10.Test2;

import java.util.ArrayList;

public class Teacher {
    private  String name;
    private Student student;
    private ArrayList<Student> arrayList;

    public ArrayList<Student> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Student> arrayList) {
        this.arrayList = arrayList;
    }

    public Teacher(String name) {
        this.name = name;
    }

    public void  call(ArrayList<Student> arrayList){
        for (int i=0;i<arrayList.size();i++){
            boolean isattendance = arrayList.get(i).isAttendance();
            if(isattendance){
                System.out.println("上课:"+arrayList.get(i).getName());
            }else{
                System.out.println("迟到:"+arrayList.get(i).getName());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher(String name, Student student) {
        this.name = name;
        this.student = student;
    }

    public Teacher() {
    }
}
