package cn.day09.Test5;

public class SportStudent extends Student implements Sport {
    @Override
    public void playBasketball() {
        System.out.println("年龄为"+getAge()+getName()+"的学生在打篮球");
    }
}
