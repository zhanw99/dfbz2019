package cn.day11.Test1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test5 {
    public static void main(String[] args)throws Exception {
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DAY_OF_MONTH,500);
        Date time = instance.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(simpleDateFormat.format(time));
    }
}
