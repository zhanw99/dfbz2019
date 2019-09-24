package cn.day22.test;

public class Student {
    private String name;
    private int id;
    private  int age;
    private  String sex;

    private Student(String name, int id, int age, String sex) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.sex = sex;
    }

    private Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    private Student(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Student() {
        System.out.println("sutdent");
    }
}
