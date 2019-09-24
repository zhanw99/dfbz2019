package cn.day13.Test20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        Student student1 = new Student("张三",18);
        Student student2 = new Student("李四",17);
        Student student3 = new Student("王五",18);
        Student student4 = new Student("赵六",17);
        List<Student> list1 = new ArrayList();
        list1.add(student1);
        list1.add(student2);

        List<Student> list2 = new ArrayList();
        list2.add(student3);
        list2.add(student4);

        Cla cla1 = new Cla();
        cla1.setStudent(list1);
        Cla cla2 = new Cla();
        cla2.setStudent(list2);

        List<Cla> list3 = new ArrayList();
        list3.add(cla1);
        list3.add(cla2);
        Subject  subject = new Subject();
        subject.setCla(list3);


        Iterator<Cla> it = list3.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for (Cla cla: list3) {
            System.out.println(cla);
        }




    }
}
