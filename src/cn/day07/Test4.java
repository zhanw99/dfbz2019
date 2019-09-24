package cn.day07;

public class Test4 {
    public static void main(String[] args) {
        String str = "HelloWorld";
        for(int i =0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
        System.out.println("将str字符串转换为小写："+str.toLowerCase());
        System.out.println("将str字符串转换为大写："+str.toUpperCase());
        String str2= str.replace('o', '6');
        System.out.println("将str字符串中的字符‘o’替换成‘6’:"+str2);
        String str3 = str.replace("ll","LL");
        System.out.println("将str字符串中的字符串ll替换成LL："+str3);
    }
}
