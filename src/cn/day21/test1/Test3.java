package cn.day21.test1;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test3 {
    @Test
    public void say1() {
        Class clazz = Student.class;
        try {
            Constructor con = clazz.getDeclaredConstructor(String.class);
            con.setAccessible(true);
            Object o = con.newInstance("张三");
            System.out.println(o.toString());

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    @Before
    public void say2() {
        Class<?> clazz = null;
        try {
            clazz = Class.forName("cn.day21.test1.Student");
            Constructor<?> co = clazz.getDeclaredConstructor(String.class);
            co.setAccessible(true);
            Object o = co.newInstance("张三");
            System.out.println(o.toString());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
