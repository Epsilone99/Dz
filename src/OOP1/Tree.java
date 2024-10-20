package OOP1;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Tree implements Serializable{
    static Children child1;
    static Parentsmom mom;
    static Parents dad;
    static Set<Person> fam;
    @Serial
    private static final long serialVersionUID = 1L;

    protected static Set<Person> Tre() {
       mom = new Parentsmom("Женский", 22, "Сара", "13.07.2001", "");
       dad = new Parents("Mужской", 25, "Джон", "14.12.1999", "");
       child1 = new Children("Mужской", 2, "Дин", "03.09.2023", dad.getName(), mom.getName());
       child1.setChildOf(mom.getName());
       child1.setChildO(dad.getName());
       mom.setMotherOf(child1.getName());
       dad.setFather(child1.getName());
       fam = new HashSet<>();
        fam.add(child1);
        fam.add(mom);
        fam.add(dad);
        return fam;
    }
    private static String uI(){
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    private static void printAll(Set<Person> per){
        for (Person p : per)
            System.out.println(p);
    }
    private static void childFatherCheck(Set<Person> tre){
        System.out.println("Введите имя человека у которого хотите проверить наличие матери : ");
        String name = uI();
        if (name.equals(child1.getName())) {
            System.err.println("Отец "+ child1.getName() + ": " + child1.childO);
        }
        else System.err.println(name + " не является чьим либо ребенком!");
    }

    private static void childMotherCheck(Set<Person> tre){;
        System.out.println("Введите имя человека у которого хотите проверить наличие матери : ");
        String name = uI();
        if (name.equals(child1.getName())) {
        System.err.println("Мать "+ child1.getName() + ": " + child1.childOf);
        }
        else {
            System.err.println(name + " не является чьим либо ребенком!");
        }
    }
    private static void dam(Set<Person> ha){
        System.out.print("Люди : " );
        for (Person p : Tre()){
            System.out.print(p.getName() + " ");
        }
        System.out.println();
    }
    private static void sonCheck(Set<Person> tre){
            System.out.println("Введите имя человека у которого хотите посмотреть список детей : ");
            String name = uI();
            switch (name) {
                case "Джон":
                    System.err.println("Джон является отцом " + dad.getFather());
                    break;
                case "Сара":
                    System.err.println("Сара является матерью " + mom.getMotherOf());
                    break;
                case "Дин":
                    System.err.println("Дин не является отцом!");
                    break;
                default:
                    System.err.println("Некорректный ввод");

            }
    }
    protected static void scenario(Set<Person> per){
        Scanner sc = new Scanner(System.in);
        dam(Tre());
        boolean cont = true;
        while (cont){
            System.out.println("Выберите действия : \n 1 - Просмотреть детей у выбранного человека. \n 2 - Просмотреть наличие матери у человека. \n 3 - Просмотреть наличие отца у человека. \n " +
                    "4 - Вывести всю полную информацию о людях. \n 5 - Завершить программу");
                switch (sc.nextInt()){
                    case 1 : sonCheck(Tre());
                    sc.nextLine();
                    break;
                    case 2 : childMotherCheck(Tre());
                    sc.nextLine();
                    break;
                    case 3 : childFatherCheck(Tre());
                    sc.nextLine();
                    break;
                    case 4 : printAll(Tre());
                    sc.nextLine();
                    break;
                    case 5 : cont = false;
                }
        }
    }

}
