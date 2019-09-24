package cn.day15.test1;


/**
 * 1. 有一辆班车除司机外只能承载80个人，假设前中后三个车门都能上车，
 * 如果坐满则不能再上车。请用线程模 拟上车过程并且在控制台打印出是从哪个车门上车
 * 以及剩下的座位数。 比如:（前门上车---还剩N个座...
 */
public class Test7 {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Thread t1 = new Thread(a, "A");
        Thread t2 = new Thread(a, "B");
        Thread t3 = new Thread(a, "C");
        t1.start();
        t2.start();
        t3.start();
    }

}

class Cat {
    private int count = 80;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Cat(int count) {
        this.count = count;
    }

    public Cat() {
    }
}

class A implements Runnable {
    int i = 80;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i <= 0) {
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + "门上来1个还剩:" + i + "个座位");
                    i--;
                }
            }
        }
    }
}

class B implements Runnable {
    private Cat cat = new Cat();

    @Override
    public void run() {
        synchronized (cat) {
            while (cat.getCount() <= 0) {
                System.out.println("A门上来1个还剩:" + cat.getCount() + "个座位");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int i = cat.getCount() - 1;
                cat.setCount(i);
            }
        }
    }
}

