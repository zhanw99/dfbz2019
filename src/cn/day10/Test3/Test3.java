package cn.day10.Test3;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<User> arrayList =new ArrayList<>();
        for (int i=0;i<50;i++){
            arrayList.add(new User(i+1));
        }
        System.out.println("未分组：");
        System.out.println(arrayList);


        Receptionist receptionist1 = new Receptionist();
        System.out.println("已分组：");
        receptionist1.setFilter(new Filter() {
            @Override
            public void filterUser(User user) {
                for (int i=0;i<50;i++){
                    System.out.println("-------------"+arrayList.get(i).toString());
                    if (arrayList.get(i).getId()>=10&&arrayList.get(i).getId()<=19){

                        arrayList.get(i).setTy("v1");
                    }else if(arrayList.get(i).getId()>=20&&arrayList.get(i).getId()<=29){
                        arrayList.get(i).setTy("v2");
                    }else {
                        arrayList.get(i).setTy("A");
                    }
                }
            }
        });
        System.out.println(arrayList);



    }
}
