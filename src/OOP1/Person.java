package OOP1;

import java.io.Serializable;

public abstract class Person implements Serializable {
    protected String sex;
    protected int age;
    protected String name;
    protected String birthDay;

    public Person(String sex, int age, String name, String birthDay) {
        this.sex = sex;
        this.age = age;
        this.name = name;
        this.birthDay = birthDay;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getBirthDay() {
        return birthDay;
    }
}
