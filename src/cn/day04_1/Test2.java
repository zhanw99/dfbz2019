package cn.day04_1;

public class Test2 {
    public static int getSum(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum +=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int a= getSum(100);
        System.out.println(a);
    }
}
