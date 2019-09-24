package cn.day17.test1;

import java.io.File;

public class Test6 {
    public static void main(String[] args) {
        String path = "D:\\Test2.txt";
        File file = new File(path);
        //获取文件名称
        System.out.println(file.getName());
        //获取文件大小
        System.out.println(file.length());
        //文件的绝对路径和父路径等信息
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getPath());

    }
}
