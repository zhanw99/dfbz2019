package cn.day13.Test20;

import java.util.List;

public class Cla {
    private List<Student> student;

    @Override
    public String toString() {
        return "Cla{" +
                "student=" + student +
                '}';
    }

    public Cla() {
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public Cla(List<Student> student) {
        this.student = student;
    }
}
