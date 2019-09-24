package cn.day14_2.test1;

public class Test6 {
    public static void main(String[] args)throws Exception {
//        testThrows();
        testTryCatch();
    }
    public static char charAt(String str,int index) throws Exception {
        if (str == null){
            throw new Exception("字符串不能为null");
        }else if (str==""){
            throw new Exception("字符串不能为空");
        }else if (index<0||index>str.length()){
            throw new Exception("索引越界");
        }else {
            return str.charAt(index);
        }
    }
    public static void testThrows() throws Exception {
        charAt("URBBRGROUgei",3);
    }
    public static void testTryCatch(){
        try {
            charAt(null,3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
