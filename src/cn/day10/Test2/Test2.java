package cn.day10.Test2;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        Course course = new Course();
        course.setCourseName("java");
        Student student1 = new Student("小红",true);
        Student student2 = new Student("小亮",true);
        Student student3 = new Student("小明",false);
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);

        Teacher teacher = new Teacher("张老师");
        course.setTeacher(teacher);
        course.show();
        teacher.setArrayList(arrayList);
        teacher.call(arrayList);






    }
}
