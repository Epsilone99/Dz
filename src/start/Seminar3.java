//public class Seminar3 {
//    public static void main(String[] args) {
////        Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
//        String s1 = "hello";
//        String s2 = "hello";
//        String s3 = s1;
//        String s4 = "h" + "e" + "l" + "l" + "o";
//        String s5 = new String("hello");
//        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));
//        System.out.println(s1 == s5);
//        System.out.println(s1.equals(s5));
//    }
//}

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Random;
//
//public class Seminar3 {
//    public static void main(String[] args) {
//        Random rnd = new Random();
//        ArrayList<Integer> arr = new ArrayList<>(10);
//        for (int i = 0; i < 10; i++) {
//            arr.add(rnd.nextInt(0,100));
//        }
//        System.out.println(arr);
//        Collections.sort(arr);
//        System.out.println(arr);
//        Collections.sort(arr, Comparator.reverseOrder());
//        System.out.println(arr);
//    }
//}

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Seminar3 {
//    public static void main(String[] args) {
////        Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
////                Вывести название каждой планеты и количество его повторений в списке.
//        ArrayList<String> planets = new ArrayList<>();
//        String[] temp = {"Венера", "Земля", "Марс", "Венера", "Юпитер"};
//        planets.addAll(Arrays.asList(temp));
//        List<String> tempor = List.of("Венера", "Земля", "Марс", "Венера", "Юпитер");
//        StringBuilder sb = new StringBuilder();
//        ArrayList<String> result = new ArrayList<>();
//        for (int i = 0; i < planets.size(); i++) {
//            String planet = planets.get(i);
//            if (!result.contains(planet)) {
//
//                result.add(planet);
//                int count = 0;
//                for (int j = i; j < planets.size(); j++) {
//                    if (planets.get(j).equals(planet)) {
//                        count++;
//                    }
//                }
//                sb.append(planet).append(" : ").append(count).append("\n");
//            }
//
//
//        }
//        System.out.println(sb);
//        System.out.println(delete(sb));
//    }
//
//    public static StringBuilder delete(StringBuilder sb) {
//        String temp = sb.toString();
//        StringBuilder result = new StringBuilder();
//        String[] split = temp.split("\n");
//        for (String s : split) {
//            if (s.split(" : ")[1].equals("1")) result.append(s).append("\n");
//        }
//        return result;
//    }
//}

//import java.util .*;
//
////        Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
////                Вывести название каждой планеты и количество его повторений в списке. ЧЕРЕЗ МАПУ.
//public class Seminar3 {
//
//    public static void main(String[] args) {
//
//        System.out.println(getPlanetsWithCount(planets()));
//        System.out.println(getUniquePlanets(getPlanetsWithCount(planets())));
//    }
//
//    public static Map<String, Integer> getPlanetsWithCount(List<String> planets) {
//        Map<String, Integer> result = new HashMap<>();
//
//        Set<String> keys = result.keySet();
//
//        for (String planet : planets) {
//            int count = 0;
//            if (!keys.contains(planet)) {
//                result.put(planet, ++count);
//            } else {
//                Integer value = result.get(planet);
//                value += 1;
//                result.put(planet, value);
//            }
//        }
//        return result;
//    }
//
//    public static Map<String, Integer> getUniquePlanets(Map<String, Integer> planets) {
//        Map<String, Integer> result = new HashMap<>();
//        for (Map.Entry<String, Integer> entry : planets.entrySet()) {
//            if (entry.getValue() == 1) {
//                result.put(entry.getKey(), entry.getValue());
//            }
//        }
//        return result;
//    }
//    public static List<String> planets(){
//        ArrayList<String> planets = new ArrayList<>();
//        String[] temp = {"Earth", "Pluto", "Venus", "Mars", "Mars", "Jupiter", "Pluto","Pluto","Venus"};
//        planets.addAll(Arrays.asList(temp));
//        return planets;
//    }
//}

