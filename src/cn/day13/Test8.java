package cn.day13;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * 8
 */
public class Test8 {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("王昭君");
        linkedHashSet.add("王昭君");
        linkedHashSet.add("杨戬");
        linkedHashSet.add("鲁班");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("==================");
        for (Object o :linkedHashSet) {
            System.out.println(o);
        }
    }
}
