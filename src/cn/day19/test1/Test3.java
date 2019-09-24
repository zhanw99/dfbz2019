package cn.day19.test1;

import java.io.*;

public class Test3 {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos=null;
        try {
            bis= new BufferedInputStream(new FileInputStream("D:\\uTorrent.zip"));
            bos = new BufferedOutputStream(new FileOutputStream("D:\\uTorrent2.zip"));
            byte[] buf = new byte[1];
            int len;
            while((len=bis.read(buf))!=-1){
                bos.write(buf,0,len);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bos.flush();
                bos.close();
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
