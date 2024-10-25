package start;//import java.util.Scanner;
//
//public class start.Dz2 {
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

import java.util.Scanner;


//public class start.Dz2 {
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
//
//public class start.Dz2 {
//    public static void main(String[] args) {
//        String text = "line1                     \n              line2\n       \nline3";
//        String newStr = text.replaceAll("(?m)^\\s*$[\r\n]+", "");
//        String[] lines = newStr.split("\n");
//        for (String line : lines) {
//            if (line != null)
//                System.out.println(line.trim());
//        }
//
//    }
//}
// ------------------------------Создание файла--------------------------------
//public class start.Dz2 {
//    public static void main(String[] args) throws IOException {
//        FileWriter fw = new FileWriter("out.txt");
//        fw.write("Hello World");  //Добавление строки
//        fw.flush();            //"Принудительная" запись
//        fw.close();          //Закрываем процесс
//    }
//}

//-------------------------------Запись в файл--------------------------------

//public class start.Dz2 {
//    public static void main(String[] args) throws IOException{
//        print(file("."), "out2.txt");
//    }
//    public static String[] file (String path){
//        File file = new File(path);
//        if (file.isFile()) return new String[0];
//        File[] files = file.listFiles();
//        String[] names = new String[files.length];
//        for (int i = 0; i < files.length; i++) {
//            names[i] = files[i].getName();
//        }
//        return names;
//
//    }
//    public static void print(String[] nam, String in){
//        FileWriter fw = null;
//        try {
//            fw = new FileWriter(in);
//            for (String s : nam) {
//                fw.write(s + "\n");
////            System.out.println(nam[i]);
//                fw.write(" ");
//            }
//            fw.flush();
//        } catch (IOException e) {
//            throw new RuntimeException("Извините, запись не удалась");
//        } finally {
//            try {
//                fw.close();
//            } catch (IOException e) {
//                throw new RuntimeException("Извивните, завершение записи не удалось");
//            }
//        }
//        System.out.println("Запись успешна!");
//    }
//}
//
//public class start.Dz2 {
//    public static void main(String[] args) {
//        result(arr());
//    }
//    public static int[] arr(){
//        System.out.println("Введите количество элементов массива: ");
//        Scanner sc = new Scanner(System.in);
//        int cou = sc.nextShort();
//        int[] arr = new int[cou];
//        Random ran = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = ran.nextInt(100);
//            System.out.print("[" + arr[i] + "]");
//        }
//        return arr;
//    }
//    public static void result(int[] arr){
//        try {
//            int min = arr[0];
//            int max = 0;
//            for (int j : arr) {
//                if (j < min)
//                    min = j;
//                if (j > max)
//                    max = j;
//            }
//            if (Deystvie()) {
//                throw new IOException("Some kind of mistake");
//            }
//            System.out.println();
//            System.out.println("Минимальное число : " + min + "\n" + "Максимальное число : " + max);
//        }catch (IOException e){
//            LOG.log(Level.INFO, e.getLocalizedMessage());
//            e.printStackTrace();
//        }
//    }
//    private static final Logger LOG = Log.log(start.Dz2.class.getName());
//    private static boolean Deystvie(){
//        int x = 1;
//        int y = 0;
//        double z = Math.random();
//        System.out.println(z);
//        System.out.print(x * y * z);
//        return x * y * z > 4;
//    }
//}
//
//public class start.Dz2 {
//    public static void main(String[] args) {
//        try {
//            System.out.println(Deystvie());
//            if (Deystvie() == false) {
//                throw new IOException("wtf");
//            }
//        } catch (Exception e) {
//            LOG.log(Level.INFO, e.getLocalizedMessage());
//            e.printStackTrace();
//        }
//    }
//    private static final Logger LOG = Log.log(start.Dz2.class.getName());
//    private static boolean Deystvie(){
//        int x = 1;
//        int y = 1;
//        double z = Math.random();
//        System.out.println(z);
//        System.out.print(x * y * z);
//        return x * y * z > 4;
//    }
//
//}


public class Dz2 {
    public static void main(String [] args) {
        // Создаём экземпляр класса start.StringCompression
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
    }}