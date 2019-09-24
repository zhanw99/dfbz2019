package cn.day09.Test4;

public class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("狗吃骨头");
    }
    void lookHome(){
        System.out.println("老老实实看家");
    }
}
