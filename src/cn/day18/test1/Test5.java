package cn.day18.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) {
        File file =new File("d:\\Test2.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            byte[] buf= new byte[1];
            while (fis.read(buf)!=-1){
                System.out.println(new String(buf));
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
