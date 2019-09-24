package cn.day08.Test3;

public class C extends B {
     int numc=30;

    @Override
    public void showA() {
        System.out.println("A类中的numa"+numa);
    }

    @Override
    public void showB() {
        System.out.println("B类中的numb"+numb);
    }

    public void  showC(){
        System.out.println("C类中的numc"+numc);
    }

}
