package cn.day13.Test2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        while (hashSet.size()<10){
            hashSet.add(1 + (int)(Math.random()*20));
        }

        Iterator it = hashSet.iterator();
        while (it.hasNext()){
            System.out.println( it.next());
        }

    }
}
