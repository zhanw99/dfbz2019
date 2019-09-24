package cn.day13;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 4
 */
public class Test4 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("1");
        linkedList.addFirst("NO.1");
        linkedList.addLast("3");
        linkedList.add("4");
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        linkedList.removeFirst();
        linkedList.removeLast();

        Iterator it = linkedList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
