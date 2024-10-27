package OOP1;
import java.io.Serial;
import java.io.Serializable;
import java.util.*;

public class Tree implements Serializable, Iterable<Person>{
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
        for (Person p : tre) {
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
        for (Person p : tre) {
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
        for (Person p : ha){
            System.out.print(p.getName() + " ");
        }
        System.out.println();
    }
    private static void sonCheck(ArrayList<Person> tre){
            System.out.println("Введите имя человека у которого хотите посмотреть список детей : ");
            String name = uI();
            boolean found = false;
            for (Person p : tre) {
                if (p.getName().equals(name)) {
                    found = true;
                    if (p instanceof Parents) {
                        System.out.println(name + " является отцом " + ((Parents) p).getFather());
                    } else if (p instanceof Parentsmom) {
                        System.out.println(name + " является матерью " + ((Parentsmom) p).getMotherOf());
                    } else if (p instanceof Children) {
                        System.out.println(name + " сам еще является ребенком!");
                    }
                    break;
                }
            }
            if(!found)
                System.out.println(name + "не найден в генеалогическом древе! Некорректный ввод.");

    }

    protected static ArrayList<Person> addHuman(ArrayList<Person> family) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите роль человека (Отец(1), Мать(2), Ребенок(3)):");
        int choice = sc.nextInt();
        sc.nextLine();

        Person newPerson;

        if (choice == 1) {
            System.out.println("Введите пол: ");
            String sex = uI();
            System.out.println("Введите возраст: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("Введите имя: ");
            String name = uI();
            System.out.println("Введите дату рождения: ");
            String birth = uI();
            System.out.println("Введите имя ребенка : ");
            String chilDname = uI();

            newPerson = new Parents(sex, age, name, birth, chilDname);
        } else if (choice == 2) {
            System.out.println("Введите пол: ");
            String sex = uI();
            System.out.println("Введите возраст: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("Введите имя: ");
            String name = uI();
            System.out.println("Введите дату рождения: ");
            String birth = uI();
            System.out.println("Введите имя ребенка : ");
            String chilDnameM = uI();

            newPerson = new Parentsmom(sex, age, name, birth, chilDnameM);
        } else if (choice == 3) {
            System.out.println("Введите пол: ");
            String sex = uI();
            System.out.println("Введите возраст: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("Введите имя: ");
            String name = uI();
            System.out.println("Введите дату рождения: ");
            String birth = uI();

            System.out.println("Введите имя отца: ");
            String childO = uI(); // Имя отца
            System.out.println("Введите имя матери: ");
            String motherName = uI();

            newPerson = new Children(sex, age, name, birth, childO, motherName);
        } else {
            System.err.println("Некорректный выбор!");
            return family;
        }
        family.add(newPerson);
        return family;
    }

    protected static void scenario(ArrayList<Person> per){
        Scanner sc = new Scanner(System.in);
//        ArrayList<Person> family = per;
        dam(Tre());
        boolean cont = true;
        while (cont){
            System.out.println("Выберите действия : \n 1 - Просмотреть детей у выбранного человека. \n 2 - Просмотреть наличие матери у человека. \n 3 - Просмотреть наличие отца у человека. \n " +
                    "4 - Вывести всю полную информацию о людях. \n 5 - Сортировать по имени. \n 6 - Сортировать по возрасту. \n 7 - Добавить человека. \n 8 - Закончить программу.");
                switch (sc.nextInt()){
                    case 1 : sonCheck(per);
                    sc.nextLine();
                    break;
                    case 2 : childMotherCheck(per);
                    sc.nextLine();
                    break;
                    case 3 : childFatherCheck(per);
                    sc.nextLine();
                    break;
                    case 4 : printAll(per);
                    sc.nextLine();
                    break;
                    case 5 : sortByName(per);
                    sc.nextLine();
                    break;
                    case 6 : sortByAge(per);
                    sc.nextLine();
                    break;
                    case 7 : addHuman(per);
                    sc.nextLine();
                    break;
                    case 8 : cont = false;
                }
        }
    }
    protected static void sortByAge (ArrayList<Person> people){
        Collections.sort(people, Comparator.comparingInt(Person::getAge));
        for (Person p : people){
            System.out.println(p);
        }
    }
    protected static void sortByName (ArrayList<Person> people){
        Collections.sort(people, Comparator.comparing(Person::getName));
        for (Person p : people){
            System.out.println(p);
        }
    }


    @Override
    public Iterator<Person> iterator() {
        return new Iterator<Person>() {
            int index;
            @Override
            public boolean hasNext() {
                return index < Tre().size();
            }

            @Override
            public Person next() {
                return Tre().get(index++);
            }
        };
    }
}
