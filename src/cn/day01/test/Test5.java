package cn.day01.test;

import cn.day13.Test2.Student;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Properties;
import java.util.Set;

public class Test5 {
    public static void main(String[] args) {
        try {
            Properties pro = new Properties();
            // 从文件中加载内容到集合中            
            // 创建属性集合
            pro.load(Test5.class.getResourceAsStream("/student.properties"));
            //从集合中获得类名
            String className = pro.getProperty("class");
            // 通过反射获得Class对象            
            Class c = Class.forName(className);
            // 快速创建对象            
            Object obj = c.newInstance();
            // 遍历集合            
            Set<String> names = pro.stringPropertyNames();
            for (String name : names) {
                // 判断name是否class                
                if (name.equals("class")) continue;
                // 获得值                
                String value = pro.getProperty(name);
                // 根据成员变量名获得对应的Field对象
                Field f = c.getDeclaredField(name);
                // 暴力反射
                f.setAccessible(true);
                // 获得成员变量的类型
                Class typeClass = f.getType();
                //  // 判断成员变量的数据类型是否是int类型
                if (typeClass == int.class) {
                    f.setInt(obj, Integer.parseInt(value));
                } else {
                    // 给f对象赋值
                    f.set(obj, value);
                }
            }
            student student1 = (student) obj;
            System.out.println(student1.getName());
            System.out.println(student1.getAge());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}
