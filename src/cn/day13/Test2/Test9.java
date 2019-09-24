package cn.day13.Test2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Test9 {
    public static void main(String[] args) {
        ArrayList arr1 = new ArrayList();
        arr1.add("a");
        arr1.add("b");
        arr1.add("a");
        arr1.add("c");
        arr1.add("d");
        ArrayList arr2 = new ArrayList();
        arr2.add("e");
        arr2.add("f");
        arr2.add("a");
        arr2.add("d");
        arr2.add("g");

        HashSet hashSet = new HashSet();
        hashSet.addAll(arr1);
        hashSet.addAll(arr2);

        Iterator it = hashSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
