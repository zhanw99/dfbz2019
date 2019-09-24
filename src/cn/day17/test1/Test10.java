package cn.day17.test1;

public class Test10 {

    public static void main(String[] args) {
        int sum = getSum(5);
        System.out.println(sum);
    }

    public static int getSum(int n ){
        if (n<=1){
            return 1;
        }

        return n*getSum(n-1);
    }
}
