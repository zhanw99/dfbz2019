package cn.day09.Test4;

public class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("猫吃吃鱼");
    }
    void catchMouse(){
        System.out.println("努力抓老鼠");
    }
}
