package cn.day22.test;

import java.lang.reflect.Constructor;

public class Test1 {

    public static void main(String[] args)throws Exception {
        Class<Student> clazz = Student.class;
        Constructor<Student> constructor = clazz.getDeclaredConstructor(String.class, String.class);
        //暴力反射
        constructor.setAccessible(true);
        Student student = constructor.newInstance("张三", "男");
        System.out.println(student);

    }
}
