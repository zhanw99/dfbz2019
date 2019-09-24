package cn.day08.Test7;

/**
 * 采购专员
 */
public class Buyer extends AdminStaff {
    public Buyer(int id, String name) {
        super(id, name);
    }

    public Buyer() {
    }

    @Override
    void work() {
        System.out.println("工号为："+getId()+"的采购专员"+getName()+"在采购音响设备");
    }
}
