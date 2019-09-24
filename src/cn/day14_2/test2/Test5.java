package cn.day14_2.test2;

public class Test5 {
    public static void main(String[] args) throws Exception {
        new DebitCard("8888888", 100).getMoney();
    }
}

class DebitCard {
    //账号
    private String accountNumber;
    //密码
    private double money;

    public DebitCard(String accountNumber, double money) throws Exception {
        this.accountNumber = accountNumber;
        this.money = money;
        if (money < 0) {
            throw new Exception("余额不能为负数！");
        } else {
            System.out.println("您的账号为："+accountNumber+",余额为：" + money);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
