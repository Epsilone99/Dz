import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

////Задание 1. Удаление отрицательных значений из массива
////        Реализуйте метод, который принимает на вход целочисленный массив и
////удаляет все отрицательные числа. Метод должен вернуть массив, содержащий
////только неотрицательные числа.
////        Пример:
////        [-1, 2, -3, 4, -5, 6]
////Результат:
////        [2, 4, 6]
//public class Dz3 {
//    public static void main(String[] args) {
//       plusnum(generateArr(capacity()));
//    }
//    public static ArrayList<Integer> generateArr(int cap){
//        ArrayList<Integer> numbers = new ArrayList<>(cap);
//        Random rnd = new Random();
//        for (int i = 0; i < cap; i++) {
//            numbers.add(i, rnd.nextInt(-50, 50));
//        }
//        System.out.println(numbers);
//        return numbers;
//    }
//    public static ArrayList<Integer> plusnum(ArrayList<Integer> num){
//        for (int i = 0; i < num.size(); i++) {
//            if (num.get(i) < 0){
//                num.remove(i);
//                --i;
//            }
//        }
//        System.out.println(num);
//        return num;
//    }
//    public static int capacity(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите размер массива: ");
//        return sc.nextInt();
//    }
//}

//        Задача 2. Уникальные числа
//        Напишите метод, который принимает целочисленный массив и возвращает
//        новый массив, содержащий только уникальные элементы из исходного
//        массива.
//                Пример:
//        [1, 2, 2, 3, 4, 4, 5]
//        Результат:
//        [1, 2, 3, 4, 5
//public class Dz3 {
//    public static void main(String[] args) {
//        notEqual(generateArr(capacity()));
//    }
//    public static int capacity() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите размер массива: ");
//        return sc.nextInt();
//    }
//    public static ArrayList<Integer> generateArr(int cap){
//        ArrayList<Integer> generateArr = new ArrayList<>(cap);
//        Random rnd = new Random();
//        for (int i = 0; i < cap; i++) {
//            generateArr.add(i, rnd.nextInt(2, 7));
//        }
//        System.out.println(generateArr);
//        return generateArr;
//    }
//    public static void notEqual(ArrayList<Integer> gen){
//        ArrayList<Integer> res = new ArrayList<>();
//        res.add(gen.getFirst());
//        for (int i = 1; i < gen.size(); i++) {
//            if (!res.contains(gen.get(i))) {
//                res.add(gen.get(i));
//            }
//        }
//        System.out.println(res);
//    }
//}

//Задача 3. Длина слов
//        Реализуйте метод, который принимает на вход массив строк и возвращает
//        новый массив, содержащий только строки, длина которых больше 3 символов.
//        Пример:
//        ["cat", "elephant", "dog", "giraffe"]
//Результат:
//        ["elephant", "giraffe"]
//public class Dz3 {
//    public static void main(String[] args) {
//        System.out.println(res(gen(capacity())));
//    }
//    public static String[] gen(int cap){
//        String[] gen = new String[cap];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < cap; i++) {
//            System.out.println("Введите слово : ");
//            gen[i] = sc.next();
//        }
//        return gen;
//    }
//    public static int capacity() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите размер массива: ");
//        return sc.nextInt();
//    }
//    public static ArrayList<String> res(String[] gen){
//        ArrayList<String> res = new ArrayList<>(Arrays.asList(gen));
//        for (int i = 0; i < res.size(); i++) {
//            String slovo = res.get(i);
//            if (slovo.length() <= 3) {
//                res.remove(i);
//                i--;
//            }
//        }
//        return res;
//    }
//}

//Задача 4*. Среднее значение массива
//        Напишите метод, который принимает массив целых чисел и возвращает
//среднее значение элементов массива, округленное до ближайшего целого
//числа.
//        Пример:
//        [4, 2, 7, 5, 1]
//Результат:
//        4
//public class Dz3 {
//    public static void main(String[] args) {
//        System.out.println(srZnach(generateArr(capacity())));
//    }
//        public static int capacity() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите размер массива: ");
//        return sc.nextInt();
//    }
//    public static ArrayList<Integer> generateArr(int cap){
//        ArrayList<Integer> generateArr = new ArrayList<>(cap);
//        Random rnd = new Random();
//        for (int i = 0; i < cap; i++) {
//            generateArr.add(i, rnd.nextInt(1, 50));
//        }
//        System.out.println(generateArr);
//        return generateArr;
//    }
//    public static int srZnach(ArrayList<Integer> gen){
//        int sum = 0;
//        int count = 0;
//        for (int i = 0; i < gen.size(); i++) {
//            sum += gen.get(i);
//            count++;
//        }
//        return Math.round((float) sum / count);
//    }
//}
