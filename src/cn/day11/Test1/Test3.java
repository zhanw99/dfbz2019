package cn.day11.Test1;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.format(date);
        System.out.println(dateFormat.format(date));
    }
}
