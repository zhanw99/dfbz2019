package cn.day14.Test3;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        list.add("♠");
        list.add("♥");
        list.add("♣");
        list.add("♦");
        List list1 = new ArrayList<>();
        list1.add("joker");
        list1.add("JOKER");
        list1.add("A");
        for (int i = 3; i <=11 ; i++) {
            list1.add(i-1);
        }
        list1.add("J");
        list1.add("Q");
        list1.add("K");
        list2.add("JOKER");
        list2.add("joker");

        list2.add("♥A");
        list2.add("♣A");
        list2.add("♠A");
        list2.add("♦A");

        list2.add("♥2");
        list2.add("♣2");
        list2.add("♠2");
        list2.add("♦2");
        for (int i =4 ; i <15 ; i++) {
            list2.add(list.get(0)+""+list1.get(i));
            list2.add(list.get(1)+""+list1.get(i));
            list2.add(list.get(2)+""+list1.get(i));
            list2.add(list.get(3)+""+list1.get(i));
        }

        //查看洗牌后
//        for (int i = 0; i < list2.size(); i++) {
//            System.out.println(list2.get(i));
//        }

        List<String>  l1 = new ArrayList<>();
        List<String>  l2 = new ArrayList<>();
        List<String>  l3 = new ArrayList<>();
        List<String>  l4 = new ArrayList<>();

        for (int i = 0; i <list2.size() ; i++) {
           list3.add(list2.get(i));
        }
        Collections.shuffle(list2);

        //底牌
        l4.add(list2.get(51));
        l4.add(list2.get(52));
        l4.add(list2.get(53));

        for (int i = 0; i <list2.size()-3 ; i++) {
            if (i%3==0){
                l1.add(list2.get(i));
            }else if(i%3==2){
                l2.add(list2.get(i));
            }else {
                l3.add(list2.get(i));
            }
        }

//        for (int i = 0; i < list2.size(); i++) {
//            System.out.println(list2.get(i));
//        }
//        System.out.println(list2.size());
//        Map<Integer,String> pokerMap = new HashMap<>();
//        pokerMap.put(1,list2.get(0));





        System.out.print("玩家1:");
        for (String s:l1) {
            System.out.print(s + "   ");
        }
        System.out.println();
        System.out.print("玩家2:");
        for (String s:l2) {
            System.out.print(s + "   ");
        }
        System.out.println();
        System.out.print("玩家3:");
        for (String s:l3) {
            System.out.print(s + "   ");
        }
        System.out.println();
        System.out.print("底牌：");
        for (String s:l4) {
            System.out.print(s + "   ");
        }
        System.out.println();
        int[] js = new int[3];
        for (int i = 0; i < l4.size(); i++) {
            int j = list3.indexOf(l4.get(i));
            System.out.println(list3.get(j));

        }




    }
}
