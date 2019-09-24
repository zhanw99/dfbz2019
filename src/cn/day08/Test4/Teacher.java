package cn.day08.Test4;

public class Teacher extends Person {
    private String xuek;
    public void jiangKe(){
        System.out.println(getName()+"讲授"+xuek);
    }

    public Teacher() {
    }

    public Teacher(String name, int age, String xuek) {
        super(name, age);
        this.xuek = xuek;
    }

    public String getXuek() {
        return xuek;
    }

    public void setXuek(String xuek) {
        this.xuek = xuek;
    }
}
