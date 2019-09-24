package cn.day18.test1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        File file =new File("d:\\Test2.txt");
        try {
            fos =new FileOutputStream(file,true);
            int i=5;
            while (i>0){
                fos.write("I Love Java".getBytes());
                fos.write("\r\n".getBytes());
                i--;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.flush();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
