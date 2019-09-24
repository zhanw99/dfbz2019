package cn.day21.test1;

import org.junit.*;

public class Test1 {
    @Test
    public void say(){
        System.out.println("Test");
    }
    @Before
    public  void say1(){
        System.out.println("Before");
    }
    @After
    public void say2(){
        System.out.println("After");
    }
    @BeforeClass
    public static void say3(){
        System.out.println("BeforeClass");
    }
    @AfterClass
    public static void say4(){
        System.out.println("AfterClass");
    }
}
