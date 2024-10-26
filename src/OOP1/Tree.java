package OOP1;
import java.io.Serial;
import java.io.Serializable;
import java.util.*;

public class Tree<T extends Person> implements Serializable, Iterable<T>{
    static Children child1;
    static Parentsmom mom;
    static Parents dad;
    @Serial
    private static final long serialVersionUID = 1L;

    protected static ArrayList<Person> Tre() {
        mom = new Parentsmom("Женский", 22, "Сара", "13.07.2001", "");
        dad = new Parents("Mужской", 25, "Джон", "14.12.1999", "");
        child1 = new Children("Mужской", 2, "Дин", "03.09.2023", dad.getName(), mom.getName());
       mom.setMotherOf(child1.getName());
       dad.setFather(child1.getName());
       ArrayList<Person>fam = new ArrayList<>();
        fam.add(child1);
        fam.add(mom);
        fam.add(dad);
        return fam;
    }
    private static String uI(){
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    private static void printAll(ArrayList<Person> per){
        for (Person p : per)
            System.out.println(p);
    }
    private static void childFatherCheck(ArrayList<Person> tre){
        System.out.println("Введите имя человека у которого хотите проверить наличие отца : ");
        String name = uI();
        boolean found = false;
        for (Person p : Tre()) {
            if (p instanceof Children) {
                Children child = (Children) p;
                if (child.getName().equals(name)) {
                    System.err.println("Отец " + child.getName() + ": " + child.childO);
                    found = true;
                    break;
                }
            }
        }
        if (!found) System.err.println(name + " не является чьим либо ребенком!");
    }

    private static void childMotherCheck(ArrayList<Person> tre){
        System.out.println("Введите имя человека у которого хотите проверить наличие матери : ");
        String name = uI();
        boolean found = false;
        for (Person p : Tre()) {
            if (p instanceof Children) {
                Children child = (Children) p;
                if (child.getName().equals(name)) {
                    System.err.println("Мать " + child.getName() + ": " + child.childOf);
                    found = true;
                    break;
                }
            }
        }
        if (!found) System.err.println(name + " не является чьим либо ребенком!");
    }
    private static void dam(ArrayList<Person> ha){
        System.out.print("Люди : " );
        for (Person p : Tre()){
            System.out.print(p.getName() + " ");
        }
        System.out.println();
    }
    private static void sonCheck(ArrayList<Person> tre){
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
    protected static void scenario(ArrayList<Person> per){
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
    protected static void sortByAge (ArrayList<Person> people){
        ArrayList<Person> arr = new ArrayList<>(people);
        Collections.sort(arr, Comparator.comparingInt(Person::getAge));
        for (Person p : arr){
            System.out.println(p);
        }
    }
    protected static void sortByName (ArrayList<Person> people){
        ArrayList<Person> arr = new ArrayList<>(people);
        Collections.sort(arr, Comparator.comparing(Person::getName));
        for (Person p : arr){
            System.out.println(p);
        }
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index;
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public T next() {
                return null;
            }
        };
    }
}
