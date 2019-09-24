package cn.day14.Test2;

import java.util.*;

public class Test8 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        int count = 0;
        int max = 0;
        int min = 100;

       Scanner scanner = new Scanner(System.in);
        while (map.size()!=5){
            int v = (int) (Math.random() * 100)+1;
            String next = scanner.next();
            count+=v;
            map.put(next,v);
        }
        Set<String> strings = map.keySet();
        Iterator<String> it = strings.iterator();
        while (it.hasNext()){
            String next = it.next();
            if(max<map.get(next)){
                max=map.get(next);
            }
            if (min>map.get(next)){
                min=map.get(next);
            }
            System.out.println(next+"=="+map.get(next));
        }
        System.out.println("总分:"+count+",平均分："+count/(map.size())+",最高分为："+max+"，最低分为"+min);

    }
}
