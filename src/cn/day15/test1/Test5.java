package cn.day15.test1;

public class Test5 extends Thread{
    public static void main(String[] args)  {
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    System.out.println("1");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    System.out.println("2");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread3 = new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    System.out.println("3");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread4 = new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    System.out.println("4");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread5 = new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    System.out.println("5");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread6 = new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    System.out.println("6");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread7 = new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    System.out.println("7");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread8 = new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    System.out.println("8");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread9 = new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    System.out.println("9");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread10 = new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    System.out.println("10");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();

    }
}
