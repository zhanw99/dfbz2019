package cn.day01.test;

public class Test1 implements Runnable {
    int num = 1;

    @Override
    public void run() {

        while (true) {
            synchronized (this) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (num == 101) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "正在卖第" + num + "张车票,剩余"+(100-num));
                num++;
            }
        }
    }
}
