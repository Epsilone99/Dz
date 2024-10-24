package OOP1;

import java.io.Serial;
import java.io.Serializable;
import java.util.*;

public class Tree implements Serializable, Iterable<Person>{
    static Children child1;
    static Parentsmom mom;
    static Parents dad;
    static HashSet<Person> fam;
    @Serial
    private static final long serialVersionUID = 1L;

    protected static HashSet<Person> Tre() {
       mom = new Parentsmom("Женский", 22, "Сара", "13.07.2001", "");
       dad = new Parents("Mужской", 25, "Джон", "14.12.1999", "");
       child1 = new Children("Mужской", 2, "Дин", "03.09.2023", dad.getName(), mom.getName());
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
                    "4 - Вывести всю полную информацию о людях. \n 5 - Сортировать по имени. \n 6 - Сортировать по возрасту. \n 7 - Закончить программу.");
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
                    case 5 : sortByName(Tre());
                    sc.nextLine();
                    break;
                    case 6 : sortByAge(Tre());
                    sc.nextLine();
                    break;
                    case 7 : cont = false;
                }
        }
    }
    protected static void sortByAge (HashSet<Person> people){
        ArrayList<Person> arr = new ArrayList<>(people);
        Collections.sort(arr, Comparator.comparingInt(Person::getAge));
        for (Person p : arr){
            System.out.println(p);
        }
    }
    protected static void sortByName (HashSet<Person> people){
        ArrayList<Person> arr = new ArrayList<>(people);
        Collections.sort(arr, Comparator.comparing(Person::getName));
        for (Person p : arr){
            System.out.println(p);
        }
    }

    @Override
    public Iterator<Person> iterator() {
        return new Iterator<Person>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Person next() {
                return null;
            }
        };
    }
}
