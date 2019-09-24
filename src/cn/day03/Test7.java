package cn.day03;

public class Test7 {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=60;i++){
            i++;
            System.out.print(i+"\t");
            if(i%5==0){
                System.out.println();
            }

        }
    }
}
