package cn.day11.Test2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args)throws Exception {
        long l = System.currentTimeMillis();
        String string = "1998-06-28 ";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd");
        Date parse = simpleDateFormat.parse(string);
        long l2 = l-parse.getTime();
        System.out.println("总共活了"+(l2/1000/60/60/24)+"天");
    }
}
