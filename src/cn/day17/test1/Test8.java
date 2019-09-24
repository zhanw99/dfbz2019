package cn.day17.test1;

import java.io.File;

public class Test8 {
    public static void main(String[] args) {
        String path = "d:\\ccc\\bbb\\aaa";
        File file = new File(path);
        File[] files = file.listFiles();
        for (File f : files){
            System.out.println(f.getName());
        }
    }
}
