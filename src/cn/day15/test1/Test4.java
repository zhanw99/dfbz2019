package cn.day15.test1;

public class Test4 {
    public static void main(String[] args) {
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                super.run();
                for (int i = 0; i < 500; i++) {
                    System.out.println("播放背景音乐i"+i);
                }
            }
        };


        Thread thread2 = new Thread() {
            @Override
            public void run() {
                super.run();
                for (int i = 0; i < 500; i++) {
                    System.out.println("显示页面"+i);
                }
            }
        };

        Thread thread3 = new Thread() {
            @Override
            public void run() {
                super.run();
                for (int i = 0; i < 500; i++) {
                    System.out.println("切歌"+i);
                }
            }
        };
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
