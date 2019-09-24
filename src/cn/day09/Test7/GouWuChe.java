package cn.day09.Test7;

import java.util.ArrayList;

/**
 * 购物车
 */

public class GouWuChe {
    /**
     * 用于保存购物车的商品
     */
    private ArrayList<Goods> arrayList=new ArrayList<>() ;
    void addGoods(Goods goods){
        arrayList.add(goods);
        System.out.println("加入\t"+goods.getName()+"\t成功");
    }
    void showGoods( ){
        System.out.println("==========打印商品=========");
        System.out.println("您所选购的商品为：");
     for (int i =0;i<arrayList.size();i++){
         System.out.println(arrayList.get(i).getId()+","+arrayList.get(i).getName()+","+arrayList.get(i).getPrice());
     }
    }

    /**
     * 打折电子产品
     */
    void  total(){
        System.out.println("-------------------");
        /**
         * 总价
         */
        double nums =0;
        /**
         * 打折后价格
         */
        double num=0;
        for (int i =0;i<arrayList.size();i++){
            Goods goods=arrayList.get(i);
            nums+=goods.getPrice();
            if(goods instanceof  EGood){
                goods.setPrice(goods.getPrice()*0.88);
            }
            num+=goods.getPrice();

        }
        System.out.println("原价为："+nums+"元");
        System.out.println("折后价为："+num+"元");
    }

}
