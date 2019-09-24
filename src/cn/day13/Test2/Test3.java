package cn.day13.Test2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Test3 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        HashSet hashSet = new HashSet();
        String[] strs ={"12345","67891","12347809933","98765432102","67891","12347809933"};
        for (int i =0;i<strs.length;i++){
            hashSet.add(strs[i]);
        }
        linkedList.addAll(hashSet);
        Iterator it = linkedList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
