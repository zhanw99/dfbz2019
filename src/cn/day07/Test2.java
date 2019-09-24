package cn.day07;

public class Test2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = "hello";


        System.out.println("str1和str2内容是否相等："+str1==str2);
        System.out.println("str1和str3内容是否相等："+str1==str3);
        System.out.println("忽略大小写比较str1和str3内容是否相等："+str1.substring(0,2).equalsIgnoreCase("he"));
        System.out.println("str1字符串是否以He前缀开头:"+str1.startsWith("He"));
        System.out.println(" 测试str1字符串是否以\"abc\"前缀开头并打印:"+str1.startsWith("abc"));
        System.out.println(" 测试str1字符串是否以\"o\"后缀结尾并打印:"+str1.endsWith("o"));
        System.out.println(" 测试str1字符串是否以\"l\"后缀结尾并打印:"+str1.endsWith("I"));



        System.out.println();

    }
}
