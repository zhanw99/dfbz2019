package cn.day24;

public class Test1 {
    //实现12A34B56C.........5354Z；
    public static void main(String[] args) {
        int num=1;
        char aa='A';
        for (int i = 1; i <=52 ; i++) {

            if(num%2==0){
                System.out.print(i+""+aa);
                System.out.println();
                aa++;
            }else {
                System.out.print(i);
            }
            num++;
        }
    }
}
