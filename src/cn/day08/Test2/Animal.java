package cn.day08.Test2;

public class Animal {
    private String name;
    private String y;
    private double price;

    public  void eat(){
        System.out.println(name+"在吃饭");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Animal(String name, String y, double price) {
        this.name = name;
        this.y = y;
        this.price = price;
    }

    public Animal() {
    }
}
