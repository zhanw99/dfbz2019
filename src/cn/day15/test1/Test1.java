package cn.day15.test1;

public class Test1 extends Thread {
    @Override
    public void run() {
        System.out.println("Test1.run");
    }

    public static void main(String[] args) {
        Thread t1 = new Test1();
        t1.start();

        Test2 test2 = new Test2();
        Thread thread = new Thread(test2);
        thread.start();
    }
}

class  Test2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Test2.run");
    }
}





