package cn.day03;

public class Test9 {
    public static void main(String[] args) {
        for (int i = 7;i>=1;i--){
            for (int j = 1;j<=7;j++) {
                if(i==j||i+j==8){
                    System.out.print("0");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
