package cn.day18.test2;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        byte[] buf =new byte[1024];
        int len;
        for (int i = 1; i <=6 ; i++) {
            String  s = "d:\\d1\\"+i+".txt";
            File file =new File(s);
            try {
                fis =new FileInputStream(file);
                String  s2 = "d:\\d2\\"+i+".txt";
                File file1 = new File(s2);
                fos = new FileOutputStream(file1);
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
}
