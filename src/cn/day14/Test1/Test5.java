package cn.day14.Test1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test5 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("邓超","孙俪");
        map.put("李晨","范冰冰");
        map.put("刘德华","柳岩");
        map.put("黄晓明","baby");
        map.put("谢霆锋","张柏芝");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entrie: entries) {
            System.out.println(entrie.getKey()+"--"+entrie.getValue());
        }
    }
}
