package cn.day01.test;

public class Test2 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Thread t1 = new Thread(test1,"1号技师");
        Thread t2 = new Thread(test1,"2号技师");
        Thread t3 = new Thread(test1,"3号技师");
        t1.start();
        t2.start();
        t3.start();
    }
}
