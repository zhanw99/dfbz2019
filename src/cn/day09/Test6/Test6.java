package cn.day09.Test6;

public class Test6 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setName("张小强");
        m.setSalary(9000);
        Coder c= new Coder();
        c.setName("李小亮");
        c.setSalary(5000);
        Company company = new Company();
        company.setTotalMoney(1000000);
        company.paySalary(m);
        company.paySalary(c);
    }
}
