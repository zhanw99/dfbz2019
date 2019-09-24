package cn.day12.Test1.Test9;

import java.util.ArrayList;
import java.util.Iterator;

public class Test9 {
    public static void main(String[] args) {
        People people1 = new People("张三",18,1.80f);
        People people2 = new People("章鱼哥",30,0.80f);
        People people3 = new People("派大星",32,1.00f);
        People people4 = new People("章鱼哥",40,0.90f);
        People people5 = new People("蟹老板",50,1.00f);
        ArrayList<People> arrayList = new ArrayList<>();
        arrayList.add(people1);
        arrayList.add(people2);
        arrayList.add(people3);
        arrayList.add(people4);
        arrayList.add(people5);
        float max = 1.8f;
        float min = 0.80f;
        Iterator<People> it = arrayList.iterator();
        while (it.hasNext()){
            People next = it.next();
            if(next.getHeight()==max){
                System.out.print("最高的人是："+next.getName()+",身高："+next.getHeight()+"。\t");
            }else if(next.getHeight()==min){
                System.out.print("最矮的人是："+next.getName()+",身高："+next.getHeight());
            }
        }
    }
}
