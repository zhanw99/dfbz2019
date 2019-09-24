package cn.day18.test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        String str= "d:\\test2.txt";
        File  file = new File(str);
        if (!file.exists()){
            try {
                file.createNewFile();
                System.out.println(file.exists());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileOutputStream fos =null;
        int len =0;
        try {
             fos=new FileOutputStream(file,true);
            byte[] b = "kjsahdkjsahkjdhsakjhdkjsah".getBytes();
            len=b.length;
            fos.write(b,0,len);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
