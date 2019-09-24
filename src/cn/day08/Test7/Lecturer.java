package cn.day08.Test7;

/**
 * 讲师
 */
public class Lecturer extends Teacher {
    @Override
    void work() {
        System.out.println("工号为："+getId()+"的师傅"+getName()+"在讲课");
    }

    public Lecturer(int id, String name) {
        super(id, name);
    }

    public Lecturer() {
    }

}
