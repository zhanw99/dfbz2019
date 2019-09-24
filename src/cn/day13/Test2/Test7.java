package cn.day13.Test2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        HashSet<Object> set = new HashSet<>();
        for (int i=0;i<s.length();i++){
            char b = s.charAt(i);
            set.add(b);
        }
        Iterator<Object> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }




    }
}
