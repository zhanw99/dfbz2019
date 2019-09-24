package cn.day08.Test4;

public class Student extends Person {
    private  int FenShu;

    public  void kaoShi(){
        System.out.println(getName()+",考试得了"+FenShu+"分");
    }

    public Student() {
    }

    public Student(String name, int age, int fenShu) {
        super(name, age);
        FenShu = fenShu;
    }

    public int getFenShu() {
        return FenShu;
    }

    public void setFenShu(int fenShu) {
        FenShu = fenShu;
    }
}
