package Dz6;

import java.time.LocalDateTime;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        filterLaptops(smth(), choice());

    }

    protected static Set<Product> smth() {
        Product aorus = new Laptops("AORUS", "16X9KG", LocalDateTime.of(2024, 2, 10, 10, 0), 16, 1000, "RTX 4060", "Windows");
        Product lenovo = new Laptops("Lenovo", "Legion", LocalDateTime.of(2023, 8, 5, 16, 0), 32, 500, "RTX 4050", "Windows");
        Product msi = new Laptops("MSI", "Katana", LocalDateTime.of(2023, 11, 25, 9, 0), 16, 500, "RTX 4050", "Linux :) ");
        Product iPhone = new Phones("iPhone", "16Pro", LocalDateTime.of(2024, 1, 11, 16, 0), 8, 256, false, "iOS");
        Product techno = new Phones("Techno", "Camon20Pro5G", LocalDateTime.of(2023, 6, 25, 11, 0), 8, 512, true, "HiOs");
        Product xiaomi = new Phones("Xiaomi", "11", LocalDateTime.of(2023, 9, 1, 13, 0), 6, 512, true, "Android");
        Set<Product> note = new HashSet<>();
        note.add(aorus);
        note.add(lenovo);
        note.add(msi);
        Set<Product> phones = new HashSet<>();
        phones.add(iPhone);
        phones.add(techno);
        phones.add(xiaomi);
        Scanner sc = new Scanner(System.in);
        System.out.println("Вы ищете ноутбук(1) или телефон(2)?");
        int res = sc.nextInt();
        Set<Product> result = new HashSet<>();
        if (res == 1)
            result = note;
        if (res == 2)
            result = phones;
        return result;
    }

    protected static HashMap<String, Object> choice() {
        boolean contin = true;
        Scanner numberOfChoice = new Scanner(System.in);
        HashMap<Integer, String> input = new HashMap<>();
        HashMap<String, Object> filter = new HashMap<>();
        input.put(1, "RAM");
        input.put(2, "HDD");
        input.put(3, "OS");
        System.out.println("Подберите себе критерии для выбора из предложенных ниже: ");
        while (contin) {
            for (Map.Entry<Integer, String> entry : input.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
                int num = numberOfChoice.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("Введите желаемый минимальный объем оперативной памяти в ГБ: ");
                        filter.put("RAM", numberOfChoice.nextInt());
                        break;
                    case 2:
                        System.out.println("Введите желаемый минимальный объем накопителя в ГБ: ");
                        filter.put("HDD", numberOfChoice.nextInt());
                        break;
                    case 3:
                        System.out.println("Введите желаемую операционную систему: ");
                        filter.put("OS", numberOfChoice.next());
                        numberOfChoice.nextLine();
                        break;
                    default:
                        System.out.println("Некорректный ввод");

                }
            }
            System.out.println("Хотите добавить еще один критерий?");
            String answer = numberOfChoice.nextLine();
            contin = answer.equalsIgnoreCase("да");
        }
        System.out.println(filter);
        return filter;
    }

    private static void filterLaptops(Set<Product> laptops, Map<String, Object> filters) {
        for (Product prod : laptops) {
            boolean matches = true;

            if (filters.containsKey("RAM") && prod.getRam() < (int) filters.get("RAM")) {
                matches = false;
            }
            if (filters.containsKey("HDD") && prod.getDiskCap() < (int) filters.get("HDD")) {
                matches = false;
            }
            if (filters.containsKey("OS") && !prod.getOs().equalsIgnoreCase((String)filters.get("OS"))) {
                matches = false;
            }

            if (matches) {
                System.out.println(prod);
            }
        }
    }

}
//prod.contains(filt.get("RAM")) &&
//        prod.contains(filt.get("HDD")) &&
//        prod.contains(filt.get("OS")) &&
