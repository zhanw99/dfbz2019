package cn.day02;

import java.util.Random;

public class Test6 {
    /*
1. 定义类 Test6
2. 定义 main方法
3. 定义printString方法
4. printString方法中,定义int类型变量num,赋为任意整数值.
5. printString方法中,定义String 类型变量str,通过三元运算符判断num为偶数,将"偶数"赋值给str,否则
将"奇数"赋值给str
6. printString方法中,输出拼接效果
     */
    public  static void printString(){
        Random r = new Random();

        int num = r.nextInt(100);

        String str= num%2==0?"偶数":"奇数";
        System.out.println("num:"+num+"是"+str);
    }

    public static void main(String[] args) {
        Test6.printString();
    }


}
