package cn.day15.test1;

/**
 * 吃包子
 */
public class Test6 {
    public static void main(String[] args) {
        BaoZi baoZi = new BaoZi();
        new Consumer(baoZi).start();
        new Producer(baoZi).start();
    }
}

class BaoZi {
    //1=吃包子，0做包子
    boolean flag = false;
    public boolean isFlag() {
        return flag;
    }
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    public void  trry(int str){
        try {
            Thread.sleep(str);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/////////////////////////////////////////////////////////////
//消费者
class Consumer extends Thread {
    private BaoZi baoZi;
    public Consumer(BaoZi baoZi) {
        this.baoZi = baoZi;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (baoZi) {
                if (baoZi.flag == true) {
                    baoZi.notify();
                    System.out.println("吃包子");
                    baoZi.trry(1000);
                    baoZi.setFlag(false);

                    System.out.println("吃完包子了，没有包子了");
                    baoZi.trry(1000);
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}

///////////////////////////////////////////////
//生产者
class Producer extends Thread {
    private BaoZi baoZi;

    public Producer(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (baoZi) {
                if (baoZi.flag == false) {
                    baoZi.notify();
                    System.out.println("做包子");
                    baoZi.trry(1000);
                    baoZi.setFlag(true);
                    System.out.println("包子做好了");
                    baoZi.trry(1000);
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

