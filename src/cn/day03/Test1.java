package cn.day03;

public class Test1 {
    public static void main(String[] args) {
        int score = 0;
        if(score>100&&score>0){
            System.out.println("成绩有误");
            return;
        }else if (score>=90&&score<=100){
            System.out.println("优秀");
            return;
        }else if(score>=80&&score<90){
            System.out.println("好");
            return;
        }else  if(score>=70&&score<80){
            System.out.println("良");
            return;
        }else if(score>=60&&score<70){
            System.out.println("及格");
            return;
        }else if (score<60&&score<=0){
            System.out.println("不及格");
            return;
        }
    }
}
