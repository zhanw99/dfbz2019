package cn.day07;

public class Test8 {
    public static void main(String[] args) {
        String str = "javajﬁewjavajﬁowfjavagkljjava";
        getCount(str,"java");

    }

    public  static  void getCount(String str, String ch ){
        int count = 0;
        String ch2[] = str.split(ch);
        System.out.println(ch2.length);
    }

}
