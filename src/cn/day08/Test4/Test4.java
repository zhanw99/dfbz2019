package cn.day08.Test4;

public class Test4 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("王小平老师");
        teacher.setXuek("java课");
        teacher.jiangKe();
        Student student = new Student();
        student.setName("李小乐");
        student.setFenShu(90);
        student.kaoShi();
    }
}
