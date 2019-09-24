package cn.day11.Test3_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    Method method = new Method();
    ArrayList<Commodity> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Method method = new Method();
        Test2 test2 = new Test2();
        double d =0;
        method.arr();
        boolean bb =true;
        System.err.println("                  欢迎使用超市购物系统");
        System.out.println("请输入你要进行的操作：\n 1:购买商品 \t\t  2:结算打印小票  \t\t  3:退出系统");
        while (true){
            String next = scanner.next();
            if (next.equals("1")){
                System.out.println("-------------------------");
                System.out.println("商品列表");
                 System.out.println("商品id\t名称\t单价\t计算单位");
                for (int i=0;i<method.arr().size();i++){
                    System.out.println(method.arr().get(i).getId()+"\t\t"+method.arr().get(i).getName()+"\t"+method.arr().get(i).getPrice()+"\t"+method.arr().get(i).getCompany());
                }
                System.out.println("请输入您要购买的商品项(输入格式：商品id-购买数量)，输入end表示购买结束");
                while (bb){
                    next=scanner.next();
                    String[] split = next.split("-");
                    String s1 = split[0];
                    if(split.length<=1){
                        if(s1.equals("end")){
                            System.out.println("购买结束");
                            System.err.println("                  欢迎使用超市购物系统");
                            System.out.println("请输入你要进行的操作：\n 1:购买商品 \t\t  2:结算打印小票  \t\t  3:退出系统");
                            bb=false;
                            break;
                        }
                       System.out.println("您输入的购买姿势不对，请换个姿势再来一次");
                   }else{
                        if(s1.equals("001")){
                            int integer= Integer.parseInt(split[1]) ;
                            d = integer;
                            test2.price(0,integer);

                        }else if(s1.equals("002")){
                            int integer= Integer.parseInt(split[1]) ;
                            d = integer;
                            test2.price(1,integer);

                        }else if(s1.equals("003")){
                            int integer= Integer.parseInt(split[1]) ;
                            d = integer;
                            test2.price(2,integer);
                        }else if (s1.equals("004")){
                            int integer= Integer.parseInt(split[1]) ;
                            d = integer;
                            test2.price(3,integer);
                        }else {
                            System.out.println("您输入的商品id不存在，请重新输入！！！");
                        }

                   }




                }
            }else  if(next.equals("2")){
                System.out.println("--------------------------------");
                System.out.println("            欢迎光临");
                System.out.println("名称      售价      数量      金额");
                System.out.println("--------------------------------");
                int sl=0;
                double g=0;
                for (int i=0;i<test2.arrayList.size();i++){
                    sl= (int)(test2.arrayList.get(i).getMoney()/test2.arrayList.get(i).getPrice());
                    System.out.println(test2.arrayList.get(i).getName()+"\t"+test2.arrayList.get(i).getPrice()+"\t"+sl+"\t"+test2.arrayList.get(i).getMoney());
                    g+=test2.arrayList.get(i).getMoney();
                }
                System.out.println("商品");
                System.out.println("共计"+sl+"件");
                System.out.println("共："+g+"元");
                System.out.println("--------------------------------");
                System.out.println("请输入你要进行的操作：\n 1:购买商品 \t\t  2:结算打印小票  \t\t  3:退出系统");
            }else  if(next.equals("3")){
                System.out.println("感谢您使用超市购物系统，欢迎下次光临，拜拜！！！");
                System.out.println("------------------------------------------");
                break;

            }else  if(next.equals("3")){
                bb=false;
                System.out.println("感谢您是要超市购物系统，欢迎下次光临，拜拜");
                System.out.println("------------------------------------------");
                break;
            } else{
                System.out.println("输入有误，请重新输入.");
            }
        }
    }
    public ArrayList price(int i, double d){
        double a = d;

        Commodity commodity = method.arr().get(i);
        commodity.setMoney(d);
        arrayList.add(commodity);
        return arrayList;
    }

}
