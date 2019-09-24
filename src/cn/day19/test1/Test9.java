package cn.day19.test1;


import java.io.*;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        OutputStreamWriter bf=null;
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();

        try {
             bf = new OutputStreamWriter(new FileOutputStream("d:\\1\\a.txt", true), "GBK");
            bf.write(next);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bf.flush();
                bf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
