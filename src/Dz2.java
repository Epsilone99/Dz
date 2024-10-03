//import java.util.Scanner;
//
//public class Dz2 {
//    public static void main(String[] args) {
//        System.out.println(fullurl(url()));
//    }
//    public static String url() {
//        System.out.println("Добавьте параметры к URL-запросу: \nhttps://example.com/search?");
//        System.out.println("Введите параметр :");
//        Scanner sc = new Scanner(System.in);
//        String param = sc.next();
//        System.out.println("Введите ключ :");
//        String key = sc.next();
//        String arg = "";
//        if (param != null && key != null) {
//            arg = param + "=" + key;
//        }
//        return arg;
//    }
//    public static String fullurl(String str1){
//        String site = "https://example.com/search?";
//        StringBuilder sb = new StringBuilder();
//        sb.append(site);
//        sb.append(str1 + "&");
//        return sb.toString();
//
//    }
//}

import java.util.StringJoiner;


//public class Dz2 {
//    public static void main(String[] args) {
//        String[] headers = {"Name", "Age", "City"};
//        String[][] data = {
//                {"John", "30", "New York"},
//                {"Alice", "25", "Los Angeles"},
//                {"Bob", "35", "Chicago"}
//        };
//        for (int i = 0; i < headers.length; i++) {
//            System.out.print(headers[i]+ " ");
//        }
//        System.out.println();
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data.length; j++) {
//                System.out.print(String.join(",", data[i][j] + " "));
//            }
//            System.out.println();
//        }
//    }
//}

public class Dz2 {
    public static void main(String[] args) {
        String text = "line1                     \n              line2\n       \nline3";
        String newStr = text.replaceAll("(?m)^\\s*$[\r\n]+", "");
        String[] lines = newStr.split("\n");
        for (String line : lines) {
            if (line != null)
                System.out.println(line.trim());
        }

    }
}
