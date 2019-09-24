package cn.day07;

import java.util.ArrayList;

public class Test9 {
    public static void main(String[] args) {
        ArrayList arrs = new ArrayList();
        arrs.add("bac");
        arrs.add("dadfa");
        arrs.add("dddaaa");
        arrs.add("你好啊");
        arrs.add("我来啦你干嘛呢");
        arrs.add("别跑啊");
        System.out.println("源ArrayList："+arrs.size());
        System.out.println("源ArrayList："+arrs.toString());
        Object arr = null;
        for (int i= 0;i<arrs.size();i++){
            arr= arrs.get(i);
            System.out.println(arr.toString().length());
            if(arr.toString().length()>4){
                arrs.remove(i);
                i--;
            }
        }
        System.out.println("删除后ArrayList："+arrs.toString());


    }
}
