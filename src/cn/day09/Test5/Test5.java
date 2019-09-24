package cn.day09.Test5;

public class Test5 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("马云");
        t1.setAge(45);
        SportTeacher t2 = new SportTeacher();
        t2.setName("小ikun");
        t2.setAge(35);

        Student s1 = new Student();
        s1.setName("小王");
        s1.setAge(20);
        SportStudent s2 = new SportStudent();
        s2.setName("大ikun");
        s2.setAge(21);

        goToSport(t2);
        goToSport(s2);


    }
    public static void goToSport(Sport sport){
        sport.playBasketball();
    }
}
