package cn.day09.Test6;

/**
 * 公司
 */
public class Company implements Money{
    private float TotalMoney;

    public float getTotalMoney() {
        return TotalMoney;
    }

    public void setTotalMoney(float totalMoney) {
        TotalMoney = totalMoney;
    }

    @Override
    public void paySalary(Employee employee) {
        System.out.println( "给"+employee.getName()+"发工资"+employee.getSalary()+"公司剩余："+(TotalMoney-=employee.getSalary()));

    }
}
