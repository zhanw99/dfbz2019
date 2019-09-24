package cn.day13.Test2;

import java.util.HashSet;
import java.util.Iterator;

public class Test10 {
    public static void main(String[] args) {
        Student student1 = new Student("张三",85,"男");
        Student student2 = new Student("暴漫",75,"男");
        Student student3 = new Student("正头",65,"男");
        Student student4 = new Student("传单",25,"男");
        HashSet hashSet = new HashSet();
        int sum=0;
        int max=0;
        int min=100;
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student4);
        Iterator<Student> it = hashSet.iterator();
        while (it.hasNext()){
            Student student = it.next();
            sum+=student.getAge();
            if(student.getAge()>max){
                max=student.getAge();
            }else if(student.getAge()<min){
                min=student.getAge();
            }

            System.out.println(student);
        }
        System.out.println("总分为："+sum+"，平均分为："+(sum/(hashSet.size()))+",最高分为："+max+",最低分为："+min);
    }
}
