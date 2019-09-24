package cn.day01.test;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        String format = df.format(new Date());
        try {
             fis= new FileInputStream(new File("d:\\a.txt"));
            fos = new FileOutputStream(new File("d:\\"+format+".txt"));
             byte[] buf=new byte[1024];
             int len;
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
