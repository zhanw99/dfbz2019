package cn.day12.Test1.Test6;

public class MyGenericClass<MVP> {
    private MVP mvp;

    public MVP getMvp() {
        return mvp;
    }

    public void setMvp(MVP mvp) {
        this.mvp = mvp;
    }

    public MyGenericClass() {
    }

    public MyGenericClass(MVP mvp) {
        this.mvp = mvp;
    }
}
