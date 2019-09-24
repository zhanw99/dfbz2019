package cn.day17.test1;

/**
 * 求1到n的和(n>=100 &&n<=200)
 */
public class Test9 {
    public static void main(String[] args) {
        int sum = sum(100);
        System.out.println(sum);
    }

    public static int sum(int i) {
        if (i == 1) {
            return 1;
        }
        return i+sum(i-1);
    }
}
