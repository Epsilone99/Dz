package start;//Задание 1. Студенческий справочник
//Реализуйте программу для работы с простым справочником студентов.
//Программа должна иметь следующие функции:
//        ● addStudent(String name, Integer grade): Добавляет или
//обновляет запись о студенте с именем name и оценкой grade. Если
//студент уже существует, обновляет его оценку.
//        ● findStudent(String name): Находит оценки студента по его имени.
//Если студент существует, возвращает список его оценок. Если нет —
//пустой список.
//        ● getAllStudents(): Возвращает весь справочник студентов в виде
//HashMap, где ключи — имена студентов, а значения — списки их оценок.
//        ● removeStudent(String name): Удаляет запись о студенте по имени
//из справочника. Если запись не существует, ничего не происходит.

//public class start.Dz5 {
//    public static void main(String[] args) {
//        HashMap<String, Integer> students = new HashMap<>();
//        start.Students st = new start.Students();
//        st.addStudents(students);
//        st.addStudents(students);
//        st.addStudents(students);
//        st.getAllStudents(students);
//
//        st.removeStudent(students, "kir");
//        st.deleteStudent(students, "dan");
//        st.getAllStudents(students);
//    }
//}

//Реализуйте программу для хранения и анализа историй посещений веб-сайтов.
//Используйте Deque для хранения истории.
//● visitSite(String site): Добавляет сайт в историю посещений.
//● back(int steps): Возвращает название сайта, который был посещен
//        steps назад, или null, если таких шагов нет.
//● getHistory(): Возвращает список сайтов в истории посещений, от
//последнего посещенного к первом
//public class start.Dz5 {
//    public static void main(String[] args) {
//        start.BrowsHistory hist = new start.BrowsHistory();
//        hist.visitSites("github");
//        hist.visitSites("youtube");
//        hist.visitSites("asmr_original");
//        hist.visitSites("twitch");
//        hist.visitSites("league_of_legends");
//
//        System.out.println(hist.getHistory());
//        System.out.println(hist.back(2));
//    }
//}

//Создайте программу для учета продуктов в корзине. Программа должна
//        позволять добавлять, удалять, обновлять количество продуктов, а также
//проверять наличие продуктов в корзине. Используйте HashMap для хранения
//продуктов и их количества.
//Методы:
//        ● addProduct(String product, Integer quantity): Добавляет
//продукт с указанным количеством в корзину. Если продукт уже есть,
//увеличивает его количество.
//        ● removeProduct(String product): Удаляет продукт из корзины. Если
//        продукт отсутствует, ничего не делает.
//        ● updateQuantity(String product, Integer quantity): Обновляет
//количество продукта в корзине. Если продукта нет, ничего не делает.
//        ● checkProduct(String product): Проверяет, есть ли продукт в
//корзине и возвращает его количество. Если продукта нет, возвращает 0.
//        ● showBasket(): Выводит все продукты и их количество в корзине.

//public class start.Dz5 {
//    public static void main(String[] args) {
//        start.Backet bk = new start.Backet();
//        bk.addProduct("apple", 2);
//        bk.addProduct("orange", 4);
//        bk.addProduct("pineapple", 9);
//        bk.addProduct("carrot", 1);
//        bk.addProduct("apple", 4);
//        bk.showBasket();
//        bk.removeProduct("carrot");
//        bk.showBasket();
//        bk.updateBasket("apple", 4);
//        bk.showBasket();
//        System.out.println(bk.checkProduct("orange"));
//
//    }
//}

//Задача 4. Сортировка слиянием
//        Напишите программу, которая реализует сортировку слиянием. Программа
//должна содержать два основных метода: merge для объединения двух
//отсортированных массивов в один отсортированный, и mergeSort для
//сортировки массива с использованием сортировки слиянием.

public class Dz5 {
    public static void main(String[] args) {
        int [] arr = {10, 21, 3 ,90, 1, 67, 57, 23, 54, 0, 7};
        mergeSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n == 1) return;
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = 0; i < n - mid; i++) {
                r[i] = arr[i + mid];
        }
        mergeSort(l);
        mergeSort(r);
        merge(arr, l, r);
    }

    private static void merge(int[] arr, int[] l, int[] r) {
        int left = l.length;
        int right = r.length;
        int i = 0;
        int j = 0;
        int idx = 0;

        while (i < left && j < right)
            if (l[i] < r[j]) {
                arr[idx] = l[i];
                i++;
                idx++;
            } else {
                arr[idx] = r[j];
                j++;
                idx++;
            }
        for (int ll = i; ll < left; ll++)
            arr[idx++] = l[ll];
        for (int rr = j; rr < right; rr++)
            arr[idx++] = r[rr];
    }
}

