package cn.day14.Test2;

import java.util.*;

public class Test6 {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        List lists =new ArrayList<>();
        Map<Object,Integer> map = new HashMap<>();
        list.add("abc");
        list.add("bcd");
        list.add("cdf");
        char[] chars;
        for (int i=0;i<list.size();i++){
            String s = list.get(i);
             chars = s.toCharArray();
            for (int j=0;j<chars.length;j++){
                char aChar = chars[j];
                lists.add(aChar);
            }
        }
        for (int z=0;z<lists.size();z++){
            Object str = lists.get(z);
            System.out.println(str);
            if(map.get(str)==null){
                map.put(str,1);
            }else {
                map.put(str,map.get(str)+1);
            }
        }

        System.out.println("******");
        Set<Object> objects = map.keySet();
        Iterator<Object> iterator = objects.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            System.out.println(o+"--"+map.get(o));
        }
    }
}
