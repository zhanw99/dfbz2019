package cn.day13.Test20;

import java.util.HashSet;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        String s = "";
        for (int i=0;hashSet.size()<6;i++){
            int number = 1 + (int)(Math.random()*20);
            s = "红色球："+number;
            hashSet.add(s);
        }
        int number = 1+(int)(Math.random()*16);

        s="蓝色球："+number;
        hashSet.add(s);
        Iterator it = hashSet.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+"    ");
        }




    }
}
