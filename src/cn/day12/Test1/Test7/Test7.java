package cn.day12.Test1.Test7;

public class Test7 {
    public static void main(String[] args) {
        new imple01().show("haha");
        new imple02<Integer>().show(123);

    }


}
class imple01 implements Inter<String>{

    @Override
    public void show(String s) {
        System.out.println(s);
    }
}

class imple02<E> implements Inter{

    @Override
    public void show(Object o) {
        System.out.println(o);
    }
}
