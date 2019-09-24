package cn.day14.Test3;

import java.util.*;

public class Test4_2 {
    public static void main(String[] args) {
        //创建map存储
        Map<Integer, String> pokerMap = new HashMap();
        List<String> colors = new ArrayList();
        List<String> numbers = new ArrayList();
        int count = 0;
        colors.add("♠");
        colors.add("♥");
        colors.add("♣");
        colors.add("♦");
        pokerMap.put(count++, "JOKER");
        pokerMap.put(count++, "joker");
        Collections.addAll(numbers, "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        for (String number : numbers) {
            for (String color : colors) {
                pokerMap.put(count++, color + number);
            }
        }

        Set<Integer> numberSet = pokerMap.keySet();
        //存放到list中，用于打乱
        List<Integer> numberList = new ArrayList();
        numberList.addAll(numberSet);
        Collections.shuffle(numberList);

        List<Integer> play1 = new ArrayList<>();
        List<Integer> play2 = new ArrayList<>();
        List<Integer> play3 = new ArrayList<>();
        List<Integer> dipai = new ArrayList<>();

        for (int i = 0; i < numberList.size()-3; i++) {
            //发牌的编号
            Integer no = numberList.get(i);

            if (i % 3 == 0) {
                play1.add(no);
            } else if (i % 3 == 1) {
                play2.add(no);
            } else {
                play3.add(no);
            }
        }
        //存底牌
        dipai.add(numberList.get(51));
        dipai.add(numberList.get(52));
        dipai.add(numberList.get(53));


        //排序
        Collections.sort(play1);
        Collections.sort(play2);
        Collections.sort(play3);
        Collections.sort(dipai);

        List<String> game1 = new ArrayList<>();
        List<String> game2 = new ArrayList<>();
        List<String> game3 = new ArrayList<>();
        List<String> poker = new ArrayList<>();

        for (Integer i : play1) {
            String integer = pokerMap.get(i);
            game1.add(integer);
        }
        for (Integer i : play2) {
            String integer = pokerMap.get(i);
            game2.add(integer);
        }
        for (Integer i : play3) {
            String integer = pokerMap.get(i);
            game3.add(integer);
        }
        for (Integer i : dipai) {
            String integer = pokerMap.get(i);
            poker.add(integer);
        }

        System.out.println(game1);
        System.out.println(game2);
        System.out.println(game3);
        System.out.println(poker);


    }
}
