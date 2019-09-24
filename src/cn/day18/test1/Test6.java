package cn.day18.test1;

import java.io.*;

public class Test6 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos=null;
        File file=new File("d:\\a.jpg");
        File file2=new File("d:\\b.jpg");
        byte[] buf= new byte[1024];
        int len;
        try {
            fis = new FileInputStream(file);
            fos = new FileOutputStream(file2);
            while ((len=fis.read(buf))!=-1){
                fos.write(buf,0,len);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.flush();
                fos.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
