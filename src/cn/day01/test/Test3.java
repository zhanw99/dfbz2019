package cn.day01.test;

public class Test3 {
    public static void main(String[] args) {
        int add = add(5);
        System.out.println(add);
    }
    public  static int add(int num){
        if (num<=1){
            return 1;
        }
        return num*add(num-1);
    }
}
