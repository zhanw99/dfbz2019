package cn.day16.test1;

public class Test7 {
    public static void main(String[] args) {
        invokeCalc(130, 120, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a-b;
            }
        });

//        invokeCalc(130, 120, new Calculator(()->{
//            return 10;
//        }) );

    }
    private  static  void invokeCalc(int a,int b,Calculator calculator){
        int result = calculator.calc(a,b);
        System.out.println("结果是："+result);
    }
}
