package cn.day08.Test6;

public class Manager extends Staff {
    @Override
    void work() {
        System.out.println("工号为："+getId()+",姓名为："+getName()+"工资为："+getPrice()+"的"+getName()+"在工作，管理其他人");
    }

    @Override
    void dinner() {
        System.out.println("工号为："+getId()+",姓名为："+getName()+"工资为："+getPrice()+"的"+getName()+"在吃鱼");
    }
}
