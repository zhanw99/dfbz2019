package cn.day14.Test3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("及时雨","宋江");
        map.put("玉麒麟","卢俊义");
        map.put("智多星","吴用");
        map.put("入云龙","公孙胜");
        map.put("豹子头","林冲");
        map.remove("玉麒麟");
        map.put("智多星",null);
        map.put("呼保义","松江");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String,String> entry: entries) {
            System.out.println(entry.getKey()+"---"+entry.getValue());

        }

    }
}
