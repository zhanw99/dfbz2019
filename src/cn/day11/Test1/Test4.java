package cn.day11.Test1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test4 {
    public static void main(String[] args)throws Exception {
        String str = "1992-10-20";
        SimpleDateFormat df = new SimpleDateFormat("yyy-MM-dd");
        Date parse = df.parse(str);
        System.out.println(df.format(parse));
    }
}
