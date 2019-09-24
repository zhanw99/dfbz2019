package cn.day13;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 3
 */
public class Test3 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("10");
        linkedList.add(1,"100");
        linkedList.set(0,"20");
        linkedList.get(0);

        System.out.println(linkedList.size());
        linkedList.remove(0);
        linkedList.clear();
        System.out.println(linkedList.size());


    }
}
