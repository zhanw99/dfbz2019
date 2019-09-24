package cn.day04_1;

public class Test1 {
    public static void pribtEven(int n){
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Test1.pribtEven(20);
    }
}
