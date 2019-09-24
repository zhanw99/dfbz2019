package cn.day14.Test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test10 {
    public static void main(String[] args) {
        String[] str = {"黑龙江省","浙江省","江西省","广东省","福建省"};
        String[] str2 = {"哈尔滨","杭州","南昌","广州","福州"};
        Map map = new HashMap();

        for (int i=0;i<str.length;i++){
                map.put(str[i], str2[i]);
        }
        Set set = map.keySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            Object next = it.next();
            System.out.println(next+"---"+map.get(next));
        }
    }
}
