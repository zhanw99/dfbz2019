package cn.day21.test1;

public class Student {
    private String name;
    private int age;


    private  void show(){
        System.out.println("java天下第一");
    }


    private Student(String name, int age) {
        System.out.println("两个参数构造器");
        this.name = name;
        this.age = age;
    }
    private Student(String name) {
        System.out.println("一个参数构造器");
        this.name = name;
    }

    private Student() {
        System.out.println("无参");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
