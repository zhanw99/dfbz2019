package cn.day08.Test5;

public class Duck extends Poultry {

    @Override
    void Having() {
        System.out.println(getAge()+"岁的"+getColor()+"的鸭子在"+getChif());
    }
    void daying(){
        System.out.println(getAge()+"岁的"+getColor()+"的鸭子在打鸣");
    }
}
