package cn.day14.Test2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("柳岩",2100);
        map.put("诸葛亮",1800);
        map.put("张亮",1700);
        map.put("灭绝师太",2600);
        map.put("东方不败",3800);

        map.put("柳岩",2400);

        Set<String> strings = map.keySet();
        for (Object o:
             strings) {
            System.out.println(o+"=="+map.get(o));
        }

    }
}
