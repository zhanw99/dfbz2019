package cn.day19.test1;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        try {
            BufferedOutputStream bos= new BufferedOutputStream(new FileOutputStream("d:\\1\\a.txt",true));
            byte[] bytes = "我是大哥大".getBytes();
            bos.write(bytes);
            bos.flush();
            bos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
