package cn.day12.Test1.Test11;

public class Test11 {
    public static void main(String[] args) {
        String[] str = {"a","b"};
        swap(str,0,1);
        System.out.println(str[0]+" "+str[1]);

        Integer[] i ={1,2};
        swap(i,0,1);
        System.out.println(i[0]+" "+i[1]);
    }
    public static  <T> void swap(T[] a1,int i1,int i2) {
        T t1 = a1[i1];
        a1[i1]=a1[i2];
        a1[i2]=t1;
    }
}

