package cn.day07;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = scanner.next();
         String  str2=str.replace("奥巴马","***");
        System.out.println(str2);
    }
}
