package cn.day13.Test2;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 2
 */
public class Test2 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("张三");
        hashSet.add("李四");
        hashSet.add("王五");
        hashSet.add("二丫");
        hashSet.add("前六");
        hashSet.add("孙琦");
        hashSet.remove("二丫");
        hashSet.add("王小丫");
        Iterator it = hashSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
