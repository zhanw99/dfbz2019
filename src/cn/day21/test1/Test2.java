package cn.day21.test1;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Class<? extends ArrayList> clazz = list.getClass();
        try {
            ArrayList arrayList = clazz.newInstance();
            arrayList.add("java天下第一");
            System.out.println(arrayList.get(0));
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
