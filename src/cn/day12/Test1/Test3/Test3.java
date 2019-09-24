package cn.day12.Test1.Test3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<String> list=new ArrayList();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");
        Iterator it = list.iterator();
        while (it.hasNext()){
            Object next = it.next();
            System.out.println(next);
        }
    }
}
