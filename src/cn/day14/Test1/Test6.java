package cn.day14.Test1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test6 {
    public static void main(String[] args) {
        Student s1 = new Student("张三",10);
        Student s2 = new Student("张四",10);
        Student s3 = new Student("张五",10);
        Student s4 = new Student("张六",10);
        Map<String,Student> map = new HashMap<>();
        map.put("广州",s1);
        map.put("茂名",s2);
        map.put("湛江",s3);
        map.put("清远",s4);
        Set<Map.Entry<String, Student>> entries = map.entrySet();
        for (Map.Entry<String,Student> entry:entries){
            System.out.println(entry.getKey()+"--"+entry.getValue().getName());
        }

        System.out.println("=======");
        Set<String> strings = map.keySet();
        Iterator<String> it = strings.iterator();
        while (it.hasNext()){
            String s= it.next();
            System.out.println(s+"--"+map.get(s).getName());
        }
    }
}
