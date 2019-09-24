package cn.day04_1;

public class Test4 {
    public static char getChar(int num){
        char ch = (char) num;
        if (ch>65||ch<91){//大写
            return ch;
        }else if(ch>97||ch<122){//小写
            return ch;
        }else if(ch>48||ch<57){//数字
            return ch;
        }else{
            return ' ';
        }
    }

    public static void main(String[] args) {
        char achar= getChar(98);
        System.out.println(achar);
    }
}
