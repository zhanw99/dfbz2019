package cn.day17.test1;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        File file1 =new File("D:\\workspace\\dfbz2019\\src\\cn\\day02\\Test2.java");
        File file2 =new File("Test2.java");
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file2.getAbsoluteFile());



    }
}
