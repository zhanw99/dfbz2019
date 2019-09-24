package cn.day08.Test7;

/**
 * 助教
 */
public class Tutor extends Teacher {
    @Override
    void work() {
        System.out.println("工号为："+getId()+"的助教"+getName()+"在帮助学生解决问题");
    }

    public Tutor(int id, String name) {
        super(id, name);
    }

    public Tutor() {
    }
}
