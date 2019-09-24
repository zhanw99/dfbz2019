package cn.day07;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个QQ号");
        String str   = scanner.next();


        checkQQ(str);

    }

    public static void checkQQ (String qq){
        int ch = 0;
        if(qq.length()>=5&&qq.length()<=12){
            String str= qq.substring(0,1);
            if(!str.equals("0")){
                //48---57
                for(int i=0;i<qq.length();i++){
                    ch=qq.charAt(i);
                }
                if (ch>=0&&ch<=9){
                    System.out.println("qq号输入正确");
                }else {
                    System.out.println("qq号输入错误");
                }
            }else {
                System.out.println("qq号输入错误");
            }
        }else {
            System.out.println("qq号输入错误");
        }
    }
}
