package cn.day21.test1;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test4 {
    @Test
    public void say(){
        try {
            Class clazz = Class.forName("cn.day21.test1.Student");
            Constructor con = clazz.getDeclaredConstructor();
            //暴力反射,必须先反射构造器(因为构造器是私有的)，然后还要暴力反射方法
            con.setAccessible(true);
            Object o = con.newInstance();
            System.out.println(o.toString());

            Method method = clazz.getDeclaredMethod("show",null);
            //暴力反射
            method.setAccessible(true);
            method.invoke(o, null);




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
