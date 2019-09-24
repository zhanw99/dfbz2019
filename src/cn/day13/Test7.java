package cn.day13;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 7
 */
public class Test7 {
    public static void main(String[] args) {
        Person person1 = new Person("zhansan",18);
        Person person11 = new Person("zhansan",18);
        Person person2 = new Person("lisi",18);
        Person person22 = new Person("lisi",18);
        HashSet hashSet = new HashSet();
        hashSet.add(person1);
        hashSet.add(person11);
        hashSet.add(person2);
        hashSet.add(person22);
        Iterator it = hashSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
