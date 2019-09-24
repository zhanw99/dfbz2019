package cn.day18.test2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileOutputStream fos = null;
        File file = new File("d:\\student.txt");
        System.out.println("输入学生信息，输入格式为：学号-学生名字，输入end退出");
        while (true) {
            String next1 = scanner.next();
            if (!next1.equals("end")) {
                byte[] bytes = next1.getBytes();
                try {
                    fos = new FileOutputStream(file,true);
                    fos.write(bytes);
                    fos.write("\r\n".getBytes());
                    System.out.println("输入成功");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                return;
            }
            fos.flush();
            fos.close();
        }


    }
}
