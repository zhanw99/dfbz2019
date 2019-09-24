package cn.day09.Test4;

public class Test4 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        Animal cat = new Cat();
        cat.eat();

        if(cat instanceof Cat){
            Cat c = (Cat) cat;
            c.catchMouse();
        }

        if (dog instanceof Dog){
            Dog d = (Dog) dog;
            d.lookHome();
        }
    }
}
