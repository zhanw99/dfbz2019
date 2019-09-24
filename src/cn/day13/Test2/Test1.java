package cn.day13.Test2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 1
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("a");
        arrayList.add("f");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("a");
        arrayList.add("d");
        HashSet hashSet = new HashSet();
        hashSet.addAll(arrayList);
        arrayList.clear();
        arrayList.addAll(hashSet);
        Iterator it = arrayList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
