package cn.day14_2.test2;

import java.util.Random;

public class Test6 {

    public static void main(String[] args) {
        Str str = new Str();
        Thread t1 = new Thread(str);
        t1.start();
    }
}

class Str implements Runnable{
        int num =0;
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            int j  =(int) (Math.random()*1000 + 100) ;
            num +=j;
        }

        System.out.println(num);
    }
}