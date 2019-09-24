package cn.day19.test1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test11 {
    public static void main(String[] args) {
        Student s1 = new Student("张三",123,321);
        Student s2 = new Student("李四",123,321);
        Student s3 = new Student("王五",123,321);
        List list = new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        ObjectOutputStream oos=null;
            try {

                oos = new ObjectOutputStream(new FileOutputStream("d:\\1\\c.txt"));
            for(int i=0;i<list.size();i++){
                oos.writeObject(list.get(i));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
                try {
                    oos.flush();
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    }
}
