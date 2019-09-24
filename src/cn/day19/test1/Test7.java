package cn.day19.test1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test7 {
    public static void main(String[] args) {
        Student student1 = new Student("张三", 123, 1);
        ObjectOutputStream oos=null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("d:\\1\\a.txt"));
            oos.writeObject(student1);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
