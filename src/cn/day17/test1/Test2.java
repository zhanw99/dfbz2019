package cn.day17.test1;

import java.io.File;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        String  path = "D:\\Test2.txt";
        File file = new File(path);
        //判断文件或目录是否存在
        System.out.println(file.exists());
        try {
            //如果不存在，则创建
            //创建文件
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
