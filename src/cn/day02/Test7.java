package cn.day02;

public class Test7 {
    /*
1. 定义类 Test7
2. 定义 main方法
3. 定义add方法,打印两个变量的和
4. 定义sub方法,打印两个变量的差
5. 定义mul方法,打印两个变量的积
6. 定义div方法,打印两个变量的商
7. 定义remain方法,打印两个变量的余数
8. main方法中,依次调用add方法,sub方法,mul方法,div方法,remain方法
     */

    private static int x = 100;
    private static int y = 200;


    public static void add (){
        int add = x+y;
        System.out.println("x,y的和为:"+add);
    }
    public static void sub (){
        int sub = x-y;
        System.out.println("x,y的差为:"+sub);
    }
    public static void mul (){
        int mul = x*y;
        System.out.println("x,y的积为:"+mul);
    }
    public static void div (){
        int sub = x/y;
        System.out.println("x,y的商为:"+sub);
    }
    public static void remain (){
        int sub = x%y;
        System.out.println("x,y的余数为:"+sub);
    }

    public static void main(String[] args) {
        Test7.add();
        Test7.sub();
        Test7.mul();
        Test7.div();
        Test7.remain();
    }

}
