package cn.day20.test1;

public class TestClient {
    public static void main(String[] args) {
        //发送端
        DemoClient6 client6 = new DemoClient6(8888);
        new Thread(client6).start();
        //接收端
//        DemoSocket6 socket6 = new DemoSocket6(8889);
//        new Thread(socket6).start();;
    }
}
