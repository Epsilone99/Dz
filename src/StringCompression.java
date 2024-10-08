import java.util.Scanner;

public class StringCompression {
    public static void main(String [] args) {
        // Создаём экземпляр класса StringCompression
        StringCompression str = new StringCompression();
        String s1, s2;
        Scanner in = new Scanner(System.in);
        // Просим пользователя ввести строку (включая пробелы)
        System.out.println("Enter a string (you can include space as well)");
        s1 = in.nextLine();
        // Удаляем все пробелы из строки с помощью метода replaceAll
        s2 = s1.replaceAll("\\s", "");
        // Вызываем метод Compression для сжатия строки
        str.Compression(s2);
    }

    public static String Compression(String s) {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        // В цикле for подсчитываем все символы строки, кроме последнего
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1));
                sb.append(count);
                count = 1;
            }
        }
        // Считаем последний символ строки
        if (s.length() > 1) {
            // Сравниваем последние два символа строки
            if (s.charAt(s.length() - 1) == s.charAt(s.length() - 2)) {
                count++;
            } else {
                sb.append(s.charAt(s.length() - 2));
                sb.append(count);
                count = 1;
            }
            sb.append(s.charAt(s.length() - 1));
            sb.append(count);
        }
        // Конвертируем StringBuilder в строку
        s = sb.toString();
        // Выводим сжатую строку вместе с количеством повторяющихся символов
        System.out.println("The compressed string along with the counts of repeated characters is:" + "\n" + s);
        // Возвращаем сжатую строку
        return s;
    }
}
