package cn.day08.Test6;

abstract class Staff {
    private  String id;
    private  String name;
    private  double price;

    abstract void work();
    abstract void dinner();


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

    public Staff(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Staff() {
    }
}
