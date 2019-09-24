package cn.day14_2.test1;

public class Tetst7 {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("张三",1);
        s1.getScore();
        Student s2 = new Student("李四",0);
        s2.getScore();
    }
}
class Student{
    private String name;
    private int score;
    public Student() {
    }
    public Student(String name, int score) throws Exception {
        this.name = name;
        this.score = score;
        if (score<=0){
            throw new Exception("异常");
        }else {
            System.out.println("你的成绩为："+score);
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }

}

