package cn.day18.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) {
        File file =new File("d:\\Test2.txt");
        FileInputStream fis =null;
        byte[] b = new byte[1024];
        try {
             fis=new FileInputStream(file);
             while (fis.read(b)!=-1){
                 System.out.println(new String(b));
             }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
