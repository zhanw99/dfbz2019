package cn.day12.Test1.Test10;

import java.util.ArrayList;
import java.util.Iterator;

public class Test10 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("c");
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("b");
        arrayList.add("b");
        arrayList.add("a");
        int a = frequency(arrayList, "c");
        System.out.println(a);


    }
    public static int frequency(ArrayList arr,String key){
        int count=0;
        Iterator it = arr.iterator();
        while (it.hasNext()){
            Object next = it.next();
            boolean equals = next.equals(key);
            if (equals){
                count++;
            }

        }
        return count;
    }
}
