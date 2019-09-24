package cn.day13;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 10
 *
 */
public class Test10 {
    public static void main(String[] args) {
        ArrayList add = add("1", "2", "3", "4", "5");
        Iterator it = add.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
    public static   ArrayList add(String... str){
        String[] strs  = str;
        ArrayList arrayList = new ArrayList();
        for(int i=0;i<strs.length;i++){
            arrayList.add(strs[i]);
        }
        return arrayList;
    }
}
