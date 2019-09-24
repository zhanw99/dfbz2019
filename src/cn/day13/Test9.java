package cn.day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test9 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(7);
        list.add(8);
        list.add(2);
        list.add(0);
        list.add(5);
        Collections.sort(list);
        for (Object o : list){
            System.out.println(o);
        }
        System.out.println("================");
        Collections.shuffle(list);
        for (Object o : list){
            System.out.println(o);
        }
        System.out.println("================");

        Collections.reverse(list);
        for (Object o : list){
            System.out.println(o);
        }
    }
}
