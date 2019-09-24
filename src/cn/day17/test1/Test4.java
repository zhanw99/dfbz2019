package cn.day17.test1;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        String path = "d:\\ccc\\bbb\\aaa";
        File file = new File(path);
        //创建多级目录
        boolean mkdirs = file.mkdirs();
        System.out.println(mkdirs);
    }
}
