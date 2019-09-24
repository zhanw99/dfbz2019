package cn.day09.Test7;

public class Test7 {
    public static void main(String[] args) {
        GouWuChe gouWuChe = new GouWuChe();
        Laptop laptop = new Laptop();
        laptop.setId("g10000");
        laptop.setName("手机");
        laptop.setPrice(10000);
        Phone phone =new Phone();
        phone.setId("g10002");
        phone.setName("手机");
        phone.setPrice(5000);
        Fruit fruit = new Fruit();
        fruit.setId("g20000");
        fruit.setName("苹果");
        fruit.setPrice(50);
        gouWuChe.addGoods(laptop);
        gouWuChe.addGoods(phone);
        gouWuChe.addGoods(fruit);


        gouWuChe.showGoods();
        gouWuChe.total();
    }
}
