package cn.day11.Test3_2;

public class Test3 {
    public static void main(String[] args) {
        String str = "001-5";
        String[] split = str.split("-");
        System.out.println(split[0]);
        System.out.println(split[1]);
        String str2= split[1];
        Integer integer= Integer.parseInt(str2);
        System.out.println(integer);

    }
}
