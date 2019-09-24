package cn.day13.Test20;

import java.util.List;

public class Subject {
    private List<Cla> cla ;

    public List<Cla> getCla() {
        return cla;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "cla=" + cla +
                '}';
    }

    public void setCla(List<Cla> cla) {
        this.cla = cla;
    }

    public Subject(List<Cla> cla) {
        this.cla = cla;
    }

    public Subject() {
    }
}
