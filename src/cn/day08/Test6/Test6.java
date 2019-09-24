package cn.day08.Test6;

public class Test6 {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setId("m110");
        manager.setName("老王");
        manager.setPrice(10000);
        manager.work();
        manager.dinner();

        Cook cook = new Cook();
        cook.setId("c111");
        cook.setName("小王");
        cook.setPrice(6000);
        cook.work();
        cook.dinner();


    }
}
