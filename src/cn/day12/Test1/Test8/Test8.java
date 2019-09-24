package cn.day12.Test1.Test8;

import java.util.ArrayList;
import java.util.Iterator;

public class Test8 {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        Student student1 = new Student("张三",20,100);
        Student student2= new Student("李四",23,80);
        Student student3 = new Student("王五",21,60);
        Student student4 = new Student("赵六",22,50);
        Student student5 = new Student("小明",13,0);
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);
        Iterator<Student> it = arrayList.iterator();
        int max=0;
        int min=0;
        int Total=0;
        while (it.hasNext()){
            Student next = it.next();
            Total += next.getResult();
            if (next.getResult()<=100){
                max=100;
            }else if(next.getResult()==0){
                min =0;
            }
        }
        System.out.println("总分:"+Total+",平均分："+Total/(arrayList.size())+",最高分："+max+",最低分："+min);
    }
}
