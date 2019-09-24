package cn.day16.test1;

public class Test5 extends Thread{
    public static void main(String[] args) {
        Test5 test5 = new Test5();
        test5.run(5);
        Thread t =new Thread(test5);
        t.start();
    }

    public void run(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(i);
        }
    }
}
