package cn.day17.test1;

import java.io.File;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {
        String path = "d:\\bbb.txt";
        File file = new File(path);
        try {
            //创建目录
            boolean newFile = file.mkdir();
            System.out.println(newFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
