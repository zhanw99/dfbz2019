package cn.day15.test1;
//卖票
public class Test8 {
    public static void main(String[] args) {
        The t1 = new The();

        Thread thread1 = new Thread(t1, "张三");
        Thread thread2 = new Thread(t1, "李四");
        Thread thread3 = new Thread(t1, "王五");

        thread1.start();
        thread2.start();
        thread3.start();
    }

}

class The implements Runnable {
    //票
    int count = 50;
    //第几张
    int count2 = 50;
    Object o = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (o) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (count <= 0) {
                    break;
                } else {

                    System.out.println(Thread.currentThread().getName() + "抢到第" + (51 - count2) + "张票，还剩" + (--count) + "张票");
                    count2--;
                }
            }
        }

    }
}
