package cn.day20.test1;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test5 {

    @Test
    public void say1() {
        System.out.println("客户端上线。。。。");
        OutputStream os = null;
        Socket client = null;
        try {
            client = new Socket("localhost", 8888);
            os = client.getOutputStream();
            os.write("大家好我是客户端".getBytes());
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.flush();
                os.close();
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
