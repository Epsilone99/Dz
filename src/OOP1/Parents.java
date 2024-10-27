package OOP1;


public class Parents extends Person implements TypeOfObj{
    protected String fatherOf;

    public Parents(String sex, int age, String name, String birthDay, String fatherOf) {
        super(sex, age, name, birthDay);
        this.fatherOf = fatherOf;
    }

    public void setFather(String father) {
        this.fatherOf = father;
    }


    public String getFather() {
        return fatherOf;
    }


    public String toString() {
        return "(Родитель) " +
                "Имя : " + name + ";" +
                " Пол : " + sex + ";" +
                " Возраст : " + age + "год(а);" +
                " Дата рождения : " + birthDay + "; " +
                "Отец : " + fatherOf ;
    }
}
