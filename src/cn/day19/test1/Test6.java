package cn.day19.test1;

import java.io.*;

public class Test6 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter os=new OutputStreamWriter(new FileOutputStream("d:\\1\\a.txt",true),"utf-8");
        os.write("李四");
        InputStreamReader is=new InputStreamReader(new  FileInputStream("d:\\1\\a.txt"),"gbk");
        int len;
        while ((len=is.read())!=-1){
            System.out.println((char)len);
        }

        is.close();
        os.flush();
        os.close();
    }
}
