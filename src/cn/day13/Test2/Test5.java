package cn.day13.Test2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Test5 {
    public static void main(String[] args) {
        String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i=0;i<arr.length;i++){
            hashSet.add(arr[i]);
        }
        arrayList.addAll(hashSet);
        Iterator it = arrayList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
