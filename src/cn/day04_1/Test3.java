package cn.day04_1;

public class Test3 {
    public static int getPerimeter(int leng, int width){
        int c = (leng + width) * 2;
        return  c;
    }
    public static int getArea(int leng, int width){
        int s = leng * width;
        return  s;
    }

    public static void main(String[] args) {
        int length = 20;
        int width = 8;
        int zc = getPerimeter(length,width);
        int area = getArea(length,width);
        System.out.println("长方形的周长："+zc+"\n"+"长方形的面积："+area);
    }
}
