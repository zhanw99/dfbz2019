package cn.day08.Test5;

abstract public class Poultry {
    int age;
    String color;
    String chif;
    abstract void Having();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getChif() {
        return chif;
    }

    public void setChif(String chif) {
        this.chif = chif;
    }

    public Poultry() {
    }
}
