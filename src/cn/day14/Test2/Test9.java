package cn.day14.Test2;

import java.util.*;

public class Test9 {
    public static void main(String[] args) {
        Map<String,String> map= new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (map.size()<5){
            String next = scanner.next();
            String[] split = next.split(",");
            map.put(split[0],split[1]);
        }
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String,String> entry:entries){
            System.out.println(entry.getKey()+"--"+entry.getValue());
        }

        System.out.println("======================");

        map.remove("c++");
        map.put("java","38.5");
        Set<String> strings = map.keySet();
        Iterator<String> it = strings.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next+"----"+map.get(next));
        }
    }
}
