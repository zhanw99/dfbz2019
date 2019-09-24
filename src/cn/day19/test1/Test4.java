package cn.day19.test1;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = null;
        BufferedReader br = null;
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        bw = new BufferedWriter(new FileWriter("D:\\workspace\\dfbz2019\\src\\cn\\day19\\test1\\data.txt", true));
        br = new BufferedReader(new FileReader("D:\\workspace\\dfbz2019\\src\\cn\\day19\\test1\\data.txt"));
        bw.write(next);
        bw.newLine();
        bw.flush();
        System.err.println("请输入验证码");
        String next2 = scanner.next();
        while (true){
            String s = br.readLine();
            if (next2.equals(s)){
                System.out.println("输入正确");
                break;
            }
            if (s==null){
                System.out.println("验证码错误");
                bw.close();
                br.close();
                return;
            }
        }
    }
}
