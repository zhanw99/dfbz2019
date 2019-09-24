package cn.day12.Test1.Test12;

import java.util.ArrayList;
import java.util.Iterator;

public class Test12 {
    public static void main(String[] args) {
        ArrayList<People> arrayList = new ArrayList();
        People people1 = new People("卫庄",18,160f);
        People people2 = new People("李斯",19,170f);
        People people3 = new People("盖聂",20,180f);
        People people4 = new People("鬼谷",21,190f);
        People people5 = new People("白凤",22,200f);


        arrayList.add(people1);
        arrayList.add(people2);
        arrayList.add(people3);
        arrayList.add(people4);
        arrayList.add(people5);

        Iterator<People> it = arrayList.iterator();
        int i=0;
        while (it.hasNext()){
            People next = it.next();
            next.setAge(next.getAge()+2);
            System.out.println("姓名："+next.getName()+"，年龄："+next.getAge()+"身高："+next.getHeight());
        }


    }
}
