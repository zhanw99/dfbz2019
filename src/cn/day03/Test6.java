package cn.day03;

public class Test6 {
    public static void main(String[] args) {
        //分别代表百位，十位，个位
        int a,b,c;
        for(int i=100;i<1000;i++) {
            a=i/100; //分解百位数
            b=i%100/10; //分解十位数
            c=i%10; //分解个位数
            if((a*a*a+b*b*b+c*c*c)==i) {
                System.out.println(i);
            }
        }
    }
}
