package cn.day17.test1;

import java.io.File;

public class Test7 {
    public static void main(String[] args) {
        String path = "D:\\Test2.txt";
        File file = new File(path);
        //判断是否为文件夹（目录）
        boolean directory = file.isDirectory();
        if(directory){
            System.out.println("是文件夹");
        }else {
            System.out.println("不是文件夹");
        }
        //判断是否为文件
        boolean file1 = file.isFile();
        if(file1){
            System.out.println("是文件");
        }else {
            System.out.println("不是文件");
        }

    }
}
