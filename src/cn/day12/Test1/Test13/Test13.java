package cn.day12.Test1.Test13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test13 {
    public static void main(String[] args) {
        ArrayList cardBox = new ArrayList();
        ArrayList<String> color = new ArrayList();
        ArrayList<String> number = new ArrayList();
        //存花色
        color.add("♠");
        color.add("♥");
        color.add("♣");
        color.add("♦");
        //存数字 2~10  36张
        for(int i=2;i<=10;i++){
            number.add(i+"");
        }
        number.add("A");
        number.add("J");
        number.add("Q");
        number.add("K");
        for (String color2:color) {
            for(String number2:number){
                String s =number2+color2;
                cardBox.add(s);
            }
        }
        cardBox.add("JOKER");
        cardBox.add("joker");

        System.out.println(cardBox.size());
        //洗牌
        Collections.shuffle(cardBox);

        List list1 = new ArrayList();
        List list2 = new ArrayList();
        List list3 = new ArrayList();
        List list4 = new ArrayList();

        for (int i=0;i<cardBox.size()-3;i+=3){
            list1.add(cardBox.get(i));
            list2.add(cardBox.get(i+1));
            list3.add(cardBox.get(i+2));
        }
        list4.add(cardBox.get(51));
        list4.add(cardBox.get(52));
        list4.add(cardBox.get(53));
        System.out.println(cardBox.size());
        System.out.println("派大星:"+list1);
        System.out.println("章鱼哥:"+list2);
        System.out.println("蟹老板:"+list3);
        System.out.println("底牌:"+list4);
        Collections.sort(list1);
        Collections.sort(list2);
        Collections.sort(list3);
        Collections.sort(list4);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);

    }

}
