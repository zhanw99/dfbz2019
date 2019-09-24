package cn.day09.Test3;

public class Test3 {
    public static void main(String[] args) {
        OlePhone olePhone = new OlePhone();
        olePhone.call();
        olePhone.sendMessage();
        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.sendMessage();
        newPhone.playGame();
    }
}
