package cn.day13.Test2;

import java.util.HashSet;
import java.util.Iterator;

public class Test4 {

    public static void main(String[] args) {
        Student student1 =new Student("张三",18,"男");
        Student student2 =new Student("张三",18,"男");
        Student student3 =new Student("李四",19,"男");
        Student student4 =new Student("李四",19,"男");
        Student student5 =new Student("王五",20,"女");
        Student student6 =new Student("王五",20,"女");
        Student student7 =new Student("尔康",18,"男");
        Student student8 =new Student("小燕子",18,"男");
        Student student9 =new Student("皇阿玛",18,"男");
        Student student0 =new Student("张全蛋",18,"男");

        HashSet<Student> set = new HashSet();
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);
        set.add(student5);
        set.add(student6);
        set.add(student7);
        set.add(student8);
        set.add(student9);
        set.add(student0);

        Iterator<Student> it = set.iterator();
        while (it.hasNext()){
            Student student = it.next();
            System.out.println(student);
        }
        System.out.println("==================");
        for (Object o:set) {
            System.out.println(o);
        }

    }
}
