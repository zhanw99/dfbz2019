package cn.day19.test1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test8 {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("d:\\1\\a.txt"));
            Student student1 = (Student) ois.readObject();
            ois.close();
            System.out.println(student1.getName());
            System.out.println(student1.getAge());
            System.out.println(student1.getSex());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
