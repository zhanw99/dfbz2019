package cn.day13.Test2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet hashSet = new HashSet();
        int sum =0;
        while (true){
            int i = scanner.nextInt();
            if(i==-1){
                break;
            }else {
                hashSet.add(i);
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()){
            sum+=(int) it.next();
        }
        System.out.println("和为："+sum+",平均值为："+(sum/(hashSet.size())));
    }
}
