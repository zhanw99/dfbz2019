package cn.day08.Test7;

public class Test7 {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer(666,"傅红雪");
        lecturer.work();
        Tutor tutor = new Tutor(668,"顾杞");
        tutor.work();
        Maintainer maintainer = new Maintainer(686,"刨丁");
        maintainer.work();
        Buyer buyer = new Buyer(888,"渣渣辉");
        buyer.work();
    }
}
