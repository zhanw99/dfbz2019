package cn.day14.Test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test7 {
    public static void main(String[] args) {
        String[] str = "if you wantto change your fate i think you must come to the dark horse to learnjava".split(" ");
        Map<String,Integer> map = new HashMap<>();
        for (int i=0;i<str.length;i++){
            String s = str[i];
            if (map.get(s)==null){
                map.put(s,1);
            }else {
                map.put(s,map.get(s)+1);
            }
        }
        Set<String> strings = map.keySet();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next+"----"+map.get(next));

        }
    }
}
