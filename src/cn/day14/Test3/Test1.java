package cn.day14.Test3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Map<String,String> map1 = new HashMap<>();
        map1.put("001","李晨");
        map1.put("002","范冰冰");
        Map<String,String> map2 = new HashMap<>();
        map2.put("001","马云");
        map2.put("002","马化腾");

        Map<String,Map<String,String>> map3 = new HashMap<>();
        map3.put("java基础班",map1);
        map3.put("java就业班",map2);

        Set<String> strings = map3.keySet();
        Iterator<String> it = strings.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next+map3.get(next));
        }


    }
}
