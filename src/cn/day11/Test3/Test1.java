package cn.day11.Test3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1  {
    public static void main(String[] args) throws Exception {
        String str = "2016-12-18";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(str);//将字符串解析为Date对象
        String string = parse.toLocaleString();
        System.out.println(string);
    }
}
