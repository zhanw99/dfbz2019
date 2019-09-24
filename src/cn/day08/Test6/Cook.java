package cn.day08.Test6;

public class Cook extends Staff {
    @Override
    void work() {
        System.out.println("工号为："+getId()+",姓名为："+getName()+"工资为："+getPrice()+"的"+getName()+"在工作，炒菜");
    }

    @Override
    void dinner() {
        System.out.println("工号为："+getId()+",姓名为："+getName()+"工资为："+getPrice()+"的"+getName()+"在吃肉");
    }
}
