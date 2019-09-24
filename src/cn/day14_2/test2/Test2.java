package cn.day14_2.test2;

public class Test2 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setLifeValue(100);
        p.setLifeValue(-100);
    }
}
class NoLifeValueException extends RuntimeException{

    public NoLifeValueException(String message) {
        super(message);
        throw new RuntimeException(message);
    }
}

class Person{
    private String name;
    private int LifeValue;
    public Person() {
    }

    public Person(String name, int lifeValue) {
        this.name = name;
        LifeValue = lifeValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLifeValue() {
        return LifeValue;
    }

    public void setLifeValue(int LifeValue) {
        this.LifeValue = LifeValue;
        if (getLifeValue()<0){
            throw new NoLifeValueException("生命值不能为负数："+getLifeValue());
        }else {
            System.out.println("生命值为："+getLifeValue());
        }
    }
}

