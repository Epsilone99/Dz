package OOP1;


public class Children extends Person{
    protected String childO;
    protected String childOf;

    protected Children(String sex, int age, String name, String birthDay, String childO, String childOf) {
        super(sex, age, name, birthDay);
        this.childO = childO;
        this.childOf = childOf;
    }

    public String getChildO() {
        return childO;
    }

    public void setChildO(String childO) {
        this.childO = childO;
    }

    public String getChildOf() {
        return childOf;
    }

    public void setChildOf(String childOf) {
        this.childOf = childOf;
    }

    @Override
    public String toString() {
        return "(Ребенок) " +
                "Имя : " + name + ";" +
                " Пол : " + sex + ";" +
                " Возраст : " + age + "год(а);" +
                " Дата рождения : " + birthDay + ";" +
                " Имя отца : " + childO + ";" +
                " Имя матери : " + childOf + ";";
    }
}
