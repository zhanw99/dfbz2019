package cn.day09.Test1;

public interface A {
    void showA();
    default void showB(){
        System.out.println("BBBBB");
    };
}
class   B implements A{


    @Override
    public void showA() {
        System.out.println("AAAAA");
        showB();
    }

    public static void main(String[] args) {
        B  b=new B();
        b.showA();
    }
}
