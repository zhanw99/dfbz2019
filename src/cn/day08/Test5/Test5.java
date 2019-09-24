package cn.day08.Test5;

public class Test5 {
    public static void main(String[] args) {
        Cock cock = new Cock();
        cock.setAge(2);
        cock.setColor("红色");
        cock.setChif("啄米");
        cock.Having();
        cock.daying();

        Duck duck = new Duck();
        duck.setAge(1);
        duck.setColor("黑色");
        duck.setChif("吃饭");
        duck.Having();
        duck.daying();
    }
}
