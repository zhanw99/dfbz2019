package cn.day11.Test3_2;

public class Commodity {
    private String id;
    private String name;
    private double price;
    private String Company;
    private double money;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money*price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCompany() {
        return Company;
    }

    public Commodity(String id, String name, double price, String company, double money) {
        this.id = id;
        this.name = name;
        this.price = price;
        Company = company;
        this.money = money;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public Commodity(String id, String name, double price, String company) {
        this.id = id;
        this.name = name;
        this.price = price;
        Company = company;
    }

    public Commodity() {
    }
}
