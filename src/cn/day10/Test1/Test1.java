package cn.day10.Test1;

public class Test1 implements HandleAble{
    public static void main(String[] args) {
        String str = "45.23499";
        new  Test1().HandleString(str);

    }
    @Override
    public void HandleString(String str) {
        System.out.println("原数字："+str);

        String[] c= str.split("\\.");
        String s1 = c[0];
        String s2= c[1];
        System.out.println("取整后："+s1);

        String s3 = s2.substring(0,4);
        Integer s4 =Integer.parseInt(s3);
        char c4= s2.charAt(4);
        Integer integer = Integer.parseInt(String.valueOf(c4));
        if(integer>=5){
            s4+=1;
        }
        System.out.println("四舍五入后："+s1+"."+s4);
    }
}
