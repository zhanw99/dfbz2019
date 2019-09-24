package cn.day04_1;

public class Test5 {
    public static void showColor(String color) {
        switch (color){
            case "red" :
                System.out.println("红色");
                break;
            case "blue" :
                System.out.println("蓝色");
                break;
            case "green" :
                System.out.println("绿色");
                break;
                default:
                    System.out.println("没有");
        }

    }

    public static void main(String[] args) {
        showColor("red");
    }
}
