package cn.day19.test1;

import java.io.*;

public class Tets5 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter os=new OutputStreamWriter(new FileOutputStream("d:\\1\\a.txt",true),"utf-8");
        os.write("李四");
        os.flush();
        os.close();
    }
}
