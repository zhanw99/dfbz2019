package cn.day11.Test2;

public class Test2 {
    public static void main(String[] args) {
        String str = "";
        long start= System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            str+=i;
        }
        long end =System.currentTimeMillis();
        System.out.println("String共消耗："+(end-start));
        StringBuilder sb = new StringBuilder(" ");
        start= System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            sb.append(i);
        }
         end =System.currentTimeMillis();
        System.out.println("StringBuilder共消耗："+(end-start));
    }
}
