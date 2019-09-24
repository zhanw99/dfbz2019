package cn.day18.test1;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        String str = "C:\\Users\\FTKJ\\Desktop\\1.txt";
        File file = new File(str);
        FileInputStream fis = null;
        FileOutputStream fos = null;
        byte[] bytes = "123".getBytes();
        //输入流
        int b;
        //必须定义数组
        // 定义字节数组，作为装字节数据的容器           
        byte[] c = new byte[1024];
        //创建文件
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(file.exists());
        }

        try {
            //输入数字
            fos = new FileOutputStream(file);
            fis = new FileInputStream(file);
            //输入数据
            fos.write(bytes);
            //读取数据
            while ( fis.read(c) != -1) {
                System.out.println(new String(c));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                fos.flush();
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
