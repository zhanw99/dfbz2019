package cn.day19.test1;

import java.io.*;

public class Test12 {

    public static void main(String[] args) {
        file ();
    }

    public static void file () {
        BufferedInputStream fis = null;
        BufferedOutputStream fos = null;

        InputStreamReader isr = null;
        try {
            fis = new BufferedInputStream(new FileInputStream("d:\\1\\a.txt"));
            fos = new BufferedOutputStream(new FileOutputStream("d:\\1\\c.txt"));
            isr = new InputStreamReader(new FileInputStream("d:\\1\\c.txt"),"gbk");
            byte[] buf = new byte[1024];
            int len;
            while((len=fis.read(buf))!=-1){
                fos.write(buf,0,len);
                fos.flush();
            }

            char[] chars= new char[1024];
            while (isr.read(chars)!=-1){
                System.out.println(new String(chars));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {

                fos.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
