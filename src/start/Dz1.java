package start;/*import java.util.Scanner;
//Напишите метод factorial, который принимает число n и возвращает его
//факториал. Если число n < 0, метод должен вернуть -1.

public class start.Dz1 {
    public static void main(String[] args) {
    System.out.println(Fact(Number()));
    }

    public static int Number(){
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int Fact(int num) {
        if (num < 0)
            return 0;
        else if (num == 0)
            return 1;
        else {
            int sum = 1;
            for (int i = 1; i <= num; i++) {
                sum *= num;
            }
            return sum;
        }
    }
}
*/

/*
//Напишите метод printEvenNums, который выведет на экран все четные числа
//в промежутке от 1 до 100, каждое на новой строке.
public class start.Dz1 {
    public static void main(String[] args) {
    PrintEvenNums();
    }
    public static void PrintEvenNums(){
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}
*/

/*
//Напишите метод sumDigits, который принимает целое число n и возвращает
//сумму его цифр.

import java.util.Scanner;

public class start.Dz1 {
    public static void main(String[] args) {
        System.out.println(sumDigits(Number()));
    }

    public static int Number(){
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int sumDigits(int num){
        int sum = 0;
        for (int i = num; i > 0; i /= 10) {
            sum = sum + i % 10;
        }
        return sum;
    }
}
*/

//Реализуйте две функции:
//        1. Функция findMaxOfTwo должна принимать два числа и возвращать
//максимальное из них, используя только знак сравнения.
//        2. Функция findMaxOfThree должна принимать три числа и находить
//максимальное из них, используя первую функцию.

import java.util.Scanner;

public class Dz1 {
    public static void main(String[] args) {
        Question();
    }

    public static int Number() {
        System.out.println("Введите число: ");
        Scanner sc1 = new Scanner(System.in);
        return sc1.nextInt();

    }

    public static int findMaxOfTwo(int one, int two){
        int max = 0;
        if (one > two)
            max = one;
        if (two > max)
            max = two;
        return max;
    }

    public static int findMaxOfThree(int one, int two, int three){
        int odin = findMaxOfTwo(one, two);
        return findMaxOfTwo(odin, three);

    }
    public static void Question(){
        System.out.println("Нужно найти максимальное из двух чисел(1) или трех чисел(2)? Введите ответ: ");
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        if (ans == 1)
            System.out.println("Максимальное число : " + findMaxOfTwo(Number(), Number()));
        if (ans == 2)
            System.out.println("Максимальное число : " + findMaxOfThree(Number(), Number(), Number()));
        if (ans != 1 && ans != 2)
            System.out.println("Нет такой опции, некорректный ввод");
    }

}