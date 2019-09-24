package cn.day04_1;

public class Test6 {
    public static void printX() {
        for(int i =1;i<=10;i++){
            for (int j =1;j<=10;j++){
                if(i==j||j+i==11){
                    System.out.print("0");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printX();
    }
}
