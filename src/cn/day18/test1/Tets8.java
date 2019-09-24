package cn.day18.test1;

import java.io.*;
import java.util.Scanner;

public class Tets8 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("d:\\student.txt");
        FileWriter fw = null;
        while (true) {
            String next = scanner.next();
            if (!next.equals("886")) {
                try {
                    fw = new FileWriter(file, true);
                    fw.write(next+"\r\n");

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    fw.flush();
                }
            } else {

                return;
            }
            try {
                fw.flush();
                fw.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }



    }
}
