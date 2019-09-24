package cn.day11.Test3_2;

import java.util.ArrayList;

public class Method {

    public Method() {
    }



    public ArrayList<Commodity> arr(){
        ArrayList<Commodity> arrayList = new ArrayList<>();
        Commodity commodity1 = new Commodity("001","少林核桃",15.5,"近");
        Commodity commodity2 = new Commodity("002","尚康饼干",14.5,"包");
        Commodity commodity3 = new Commodity("003","移动硬盘",345.0,"个");
        Commodity commodity4 = new Commodity("004","高清无码",199.0,"G");

        arrayList.add(commodity1);
        arrayList.add(commodity2);
        arrayList.add(commodity3);
        arrayList.add(commodity4);
        return arrayList;
    }
    public  void price(int i,double d){
        arr().get(i).setMoney(d);
        System.out.println(arr().get(i).getMoney());

    }

}
