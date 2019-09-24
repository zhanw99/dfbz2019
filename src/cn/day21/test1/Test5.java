package cn.day21.test1;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test5 {
    @Test
    public void say(){
        Class<A> clazz = A.class;
        try {
            Method showString = clazz.getDeclaredMethod("showString");
            A a = clazz.newInstance();
            showString.setAccessible(true);
            showString.invoke(a,null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
