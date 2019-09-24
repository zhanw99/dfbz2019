package cn.day14.Test1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"御弟哥哥");
        map.put(2,"唐三藏");
        map.put(3,"唐朝");
        map.put(4,"唐僧");
        Set<Integer> set = map.keySet();
        for (Integer integer:set){
            System.out.println(integer);
        }

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){

            System.out.println(it.next());
        }

    }
}
