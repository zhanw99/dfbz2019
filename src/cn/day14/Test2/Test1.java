package cn.day14.Test2;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> map = new HashMap<>();

        while (map.size()<5){
            String next = scanner.next();
            String[] split = next.split("，");
            map.put(split[0],split[1]);
        }
        Set<String> strings = map.keySet();
        Iterator<String> it = strings.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next+"=="+map.get(next));
        }
    }
}
