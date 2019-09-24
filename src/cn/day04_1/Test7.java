package cn.day04_1;

public class Test7 {
    public static void round(float num){
        int count= (int)(num+0.5);
        System.out.println(num +"->" +count);
    }

    public static void main(String[] args) {
        round(10.5f);
    }
}
