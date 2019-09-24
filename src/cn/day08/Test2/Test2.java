package cn.day08.Test2;

public class Test2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("旺财");
        dog.eat();
        dog.lookHome();
        System.out.println("-------------");
        Cat cat = new Cat();
        cat.setName("波斯猫");
        cat.eat();
        cat.catchMouse();
    }
}
