package cn.day08.Test7;

/**
 * 维护专员
 */
public class Maintainer extends AdminStaff{

    @Override
    void work() {
        System.out.println("工号为："+getId()+"的维护专员"+getName()+"在解决不能共享屏幕问题");
    }

    public Maintainer(int id, String name) {
        super(id, name);
    }

    public Maintainer() {
    }
}
