package cn.day16.test1;

public class Test4 {

    public static void main(String[] args) {
        JiSuan jiSuan = new JiSuan(){
            @Override
            public void run() {
                Integer c = 1*2*3*4*5*6*7*8*9*10;
                System.out.println("线程1："+c);
            }
        };
        JiSuan jiSuan2 = new JiSuan(){
            @Override
            public void run() {
                Integer c = 1*2*3*4*5;
                System.out.println("线程2："+c);
            }
        };

        JiSuan jiSuan3 = new JiSuan(){
            @Override
            public void run() {
                Integer c = 1*2*3*4*5*7*8;
                System.out.println("线程3："+c);
            }
        };

        Thread t1 = new Thread(jiSuan);
        Thread t2 = new Thread(jiSuan2);
        Thread t3 = new Thread(jiSuan3);

        t1.start();
        t2.start();
        t3.start();

    }

}
class JiSuan implements Runnable{

    @Override
    public void run() {

    }
}
