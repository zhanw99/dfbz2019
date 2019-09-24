package cn.day20.test1;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test4 {

    @Test
    public void say1() {
        System.out.println("客户端上线。。。。");
        OutputStream os = null;
        Socket client = null;
        try {
            client = new Socket("localhost", 8888);
            os = client.getOutputStream();
            os.write("大家好".getBytes());
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

    @Test
    public void say2() {
        System.out.println("服务器启动。。。。");
        InputStream is = null;
        Socket accept = null;
        try {
            ServerSocket socket = new ServerSocket(8888);
            accept = socket.accept();
            is = accept.getInputStream();
            byte[] buf = new byte[1024];
            int len = is.read(buf);
            System.out.println(new String(buf, 0, len));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
