import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Finish(Name(), Output(Convert(TimeScan())));

    }


    public static String TimeScan(){
        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH");
        return now.format(formatter);

    }


    public static int Convert(String str){
        return Integer.parseInt(str);
    }

    public static String Output(int hour){
        String result = switch (hour) {
            case 6, 7, 8, 9, 10, 11 -> "Доброе утро, ";
            case 12, 13, 14, 15, 16, 17 -> "Добрый день, ";
            case 18, 19, 20, 21, 22, 23 -> "Добрый вечер, ";
            case 0, 1, 2, 3, 4, 5 -> "Доброй ночи, ";
            default -> "";
            //if (hour >= 6 && hour < 12)
            //    result = "Доброе утро, ";
            //if (hour >= 12 && hour < 18)
            //    result = "Добрый день, ";
            //if (hour >= 18 && hour < 25)
            //    result = "Добрый вечер, ";
            //if (hour < 6)
            //    result = "Доброй ночи, ";
        };
        return result;

    }

    public static String Name(){
        System.out.println("Введите ваше имя :");
        Scanner sc = new Scanner(System.in);
        return sc.next();

    }

    public static void Finish(String name, String hour){
        System.out.print(hour);
        System.out.println(name + "!");
    }


}