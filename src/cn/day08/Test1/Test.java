package cn.day08.Test1;

public class Test {
    public static void main(String[] args) {
        Coder coder = new Coder();
        coder.setName("马化腾");
        coder.eat();
        coder.sleep();
        coder.coding();
        System.out.println("=========");
        Teacher teacher = new Teacher();
        teacher.setName("马云");
        teacher.eat();;
        teacher.sleep();;
        teacher.coding();
    }
}
