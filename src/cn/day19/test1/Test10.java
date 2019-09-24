package cn.day19.test1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test10 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw=null;
        List<String> list = new ArrayList();
        try {
            br = new BufferedReader(new FileReader("d:\\1\\b.txt"));
            bw = new BufferedWriter(new FileWriter("d:\\1\\c.txt"));
            while (true) {
                String s = br.readLine();
                if (s != null) {
                    list.add(s);
                } else {
                    Collections.reverse(list);
                    break;
                }
            }
            for (String s1 : list) {
                System.out.println(s1);
                bw.write(s1);
                bw.newLine();
                bw.flush();
            }

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bw.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
