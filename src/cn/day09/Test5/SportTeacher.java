package cn.day09.Test5;

public class SportTeacher extends Teacher implements Sport {

    @Override
    public void playBasketball() {
        System.out.println("年龄为"+getAge()+getName()+"的老师在打篮球");
    }
}
