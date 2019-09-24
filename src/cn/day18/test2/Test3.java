package cn.day18.test2;

import java.io.*;

public class Test3 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        byte[] buf = new byte[1024];
        int len;
        String str = "d:\\d1\\";
        File file1 = new File(str);
        File[] files = file1.listFiles();
        for (File f : files) {
            try {
                fis = new FileInputStream(f);
                String s2 = "d:\\d2\\"+f.getName();
                System.out.println(s2);
                File file2 = new File(s2);
                fos = new FileOutputStream(file2);
                while ((len = fis.read(buf)) != -1) {
                    fos.write(buf, 0, len);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
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
