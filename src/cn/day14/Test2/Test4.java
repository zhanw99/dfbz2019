package cn.day14.Test2;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character,Integer> map = new HashMap();
        String s = scanner.nextLine();

        char[] chars = s.toCharArray();
        for(char a:chars){
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }else{
                map.put(a,1);
            }
        }

        Set<Character> characters = map.keySet();
        Iterator<Character> it = characters.iterator();
        while (it.hasNext()){
            Character next = it.next();
            System.out.println(next +"=="+map.get(next));
        }

//        System.out.println(s);
//        for (int i=0;i<s.length();i++){
//            char c = s.charAt(i);
//            System.out.println(c);
//            if (map.get(c)!=null){
//                map.put(c,map.get(c)+1);
//            }else if (map.get(c)==null){
//                map.put(c,1);
//            }
//        }
//        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
//        for(Map.Entry<Character,Integer> entry:entries){
//            System.out.println(entry.getKey()+"====="+entry.getValue());
//        }
    }
}
