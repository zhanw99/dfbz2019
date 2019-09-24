package cn.day18.test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) {
        File file =new File("d:\\Test2.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            byte[] buf= new byte[1];
            int i =0;
            while (fis.read(buf)!=-1){
                if(new String(buf)=="J"){
                   i++;
                }
            }
            System.out.println(i);
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
