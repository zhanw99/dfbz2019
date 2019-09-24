package cn.day08.Test5;

public class Cock extends Poultry {
    @Override
    void Having() {
        System.out.println(getAge()+"岁的"+getColor()+"的公鸡在"+getChif());
    }
    void daying(){
        System.out.println(getAge()+"岁的"+getColor()+"的公鸡在打鸣");
    }
}
