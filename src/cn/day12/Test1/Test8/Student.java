package cn.day12.Test1.Test8;

public class Student {
    private String name;
    private int age;
    private int result;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public Student(String name, int age, int result) {
        this.name = name;
        this.age = age;
        this.result = result;
    }
}
