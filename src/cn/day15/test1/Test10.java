package cn.day15.test1;

public class Test10 {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                int i= 1*2*3*4*5*6*7*8*9*10;
                System.out.println(i);
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                int i= 1*2*3*4*5;
                System.out.println(i);
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                int i= 1*2*3*4*5*6*7*8;
                System.out.println(i);
            }
        }.start();
    }
}
