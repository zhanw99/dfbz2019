package cn.day17.test1;

import java.io.File;

public class Test5 {
    public static void main(String[] args) {
        String  path = "D:\\Test2.txt";
        File file = new File(path);
        //删除，必须是空文件夹
        boolean delete = file.delete();
        System.out.println(delete);
    }
}
