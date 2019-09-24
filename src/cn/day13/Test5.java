package cn.day13;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 5
 */
public class Test5 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("zhangsan");
        hashSet.add("lisi");
        hashSet.add("wangwu");
        hashSet.add("zhangsan");
        Iterator it = hashSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
