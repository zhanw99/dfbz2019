package cn.day20.test1;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class DemoClient6 implements  Runnable {
        BufferedOutputStream bos = null;
        Socket client = null;
        Scanner scanner = new Scanner(System.in);
        private int port;

    public DemoClient6(int port) {
        this.port = port;
    }

    @Override
    public void run() {
        try {
            client = new Socket("localhost", port);
            bos = new BufferedOutputStream(client.getOutputStream());
            while (true) {
                String s = scanner.nextLine();
                if ("exit".equals(s)) {
                    break;
                }
                bos.write(s.getBytes());
                bos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bos.close();
                client.close();
                System.out.println("client关闭");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
