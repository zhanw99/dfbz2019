package cn.day10.Test3;

public class User {
    private String ty;
    private int id;

    public User(int id) {
        this.id = id;
    }

    public String getTy() {
        return ty;
    }

    public void setTy(String ty) {
        this.ty = ty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User(String ty, int id) {
        this.ty = ty;
        this.id = id;
    }

    public User() {
    }

    @Override
    public String toString() {
        return id+"-"+ty;
    }
}
