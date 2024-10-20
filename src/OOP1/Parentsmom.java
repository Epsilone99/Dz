package OOP1;

public class Parentsmom extends Person{
    protected String motherOf;

    public Parentsmom(String sex, int age, String name, String birthDay, String motherOf) {
        super(sex, age, name, birthDay);
        this.motherOf = motherOf;
    }

    public String getMotherOf() {
        return motherOf;
    }

    public void setMotherOf(String motherOf) {
        this.motherOf = motherOf;
    }

    @Override
    public String toString() {
        return "(Родитель) " +
                "Имя : " + name + ";" +
                " Пол : " + sex + ";" +
                " Возраст : " + age + "год(а);" +
                " Дата рождения : " + birthDay + "; " +
                "Мать : " + motherOf ;
    }
}
