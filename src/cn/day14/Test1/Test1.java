package cn.day14.Test1;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,"张三");
        map.put(2,"张三四");
        map.put(3,"张三五");
        map.put(2,"李四");
        map.remove(3);
        Set set =new HashSet();
        set.add(map);
        for (Object s:set) {
            System.out.println(s);
        }
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        Set set1 = map.keySet();
        for (Object o:
             set1) {
            System.out.println(o);
        }

    }
}
