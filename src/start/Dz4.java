package start;

import java.util.*;

////Дан LinkedList с несколькими элементами. В методе
////removeOddLengthStrings класса LLTasks реализуйте удаление строк, длина
////которых нечетная. Используйте LinkedList и стандартные методы.
//public class start.Dz4 {
//    public static void main(String[] args) {
//        System.out.println(upd_list(gen_list()));
//    }
//    public static LinkedList<String> gen_list(){
//        LinkedList<String> list = new LinkedList<>();
//        list.add("elephant");
//        list.add("cat");
//        list.add("dog");
//        list.add("lion");
//        list.add("zebra");
//        return list;
//    }
//    public static LinkedList<String> upd_list(LinkedList<String> genlist){
//        LinkedList<String> new_list = new LinkedList<>();
//        for (int i = 0; i < genlist.size(); i++) {
//            if(genlist.get(i).length() % 2 != 0) {
//                genlist.remove(i);
//                i--;
//            }
//        }
//        return genlist;
//    }
//}

//Задача 2. Реализация стека
//        Реализуйте start.MyStack с использованием LinkedList с методами:
//● push(String element) - добавляет элемент на вершину стека
//● pop() - возвращает элемент с вершины и удаляет его
//● peek() - возвращает элемент с вершины, не удаляя
//● getElements() - возвращает все элементы стека

//public class start.Dz4 {
//    public static void main(String[] args) {
//        start.MyStack ms = new start.MyStack();
//        ms.push("lol");
//        ms.push("kek");
//        ms.push("cheburek");
//        ms.push("myyy");
//        ms.push("hruuu");
//        ms.push("tyap-lyap");
//        System.out.println(ms.peek());
//        System.out.println(ms.getElements());
//        ms.pop();
//        System.out.println(ms);
//    }
//
//}

//Реализуйте метод countOccurrences в классе ListUtils, который
//        принимает LinkedList<String> и строку, и возвращает количество
//        вхождений строки в список.

//public class start.Dz4 {
//    public static void main(String[] args) {
//        sb(list(), "cat");
//    }
//    public static LinkedList<String> list() {
//        LinkedList<String> spisok = new LinkedList<>();
//        spisok.add("cat");
//        spisok.add("dog");
//        spisok.add("lion");
//        spisok.add("wolf");
//        spisok.add("cat");
//        spisok.add("dog");
//        spisok.add("wolf");
//        return spisok;
//    }
//    public static void sb(LinkedList<String> spis, String str){
//        LinkedList ls = new LinkedList<>();
//        int count = 0;
//        for (int i = 0; i < spis.size(); i++) {
//            if (spis.contains(str))
//                count++;
//        }
//        System.out.println("Слово " + str + " встречается " + count + " раз(a)");
//    }
//}

//Реализуйте метод rotateDeque в классе DequeTasks, который принимает
//Deque<Integer> и число n. Метод должен повернуть очередь вправо на n
//позиций. Если n отрицательное, повернуть влево.

//public class start.Dz4 {
//    public static void main(String[] args) {
//        sortQ(Que());
//    }
//    public static Deque<Integer> Que(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите размер очереди : ");
//        int size = sc.nextInt();
//        Deque<Integer> que = new ArrayDeque<>(size);
//        for (int i = 0; i < size; i++) {
//            System.out.println("Введите число : ");
//            int num = sc.nextInt();
//            que.addFirst(num);
//        }
//        System.out.println(que);
//        return que;
//    }
//    public static Deque<Integer> sortQ(Deque<Integer> quuu){
//        System.out.println("Введите величину сдвига элементов(если больше 0 то сдвиг вправо, если меньше то влево)");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if (n == 0 || quuu.size() == 0) return null;
//        n = n % quuu.size();
//        if (n > 0)
//            n = quuu.size() + n;
//        for (int i = 0; i < n; i++) {
//            quuu.addFirst(quuu.removeLast());
//        }
//        if (n < 0)
//            n = quuu.size() - n;
//        for (int i = 0; i < n; i++) {
//            quuu.addLast(quuu.removeFirst());
//        }
//        System.out.println(quuu);
//        return quuu;
//    }
//}

//Реализуйте метод removeAllOccurrences в классе DequeTasks, который
//принимает Deque<String> и строку value. Метод должен удалить все
//вхождения строки value из очереди
public class Dz4 {
    public static void main(String[] args) {
        Qmod(Qnew(), "cat");
    }


    public static Deque<String> Qnew(){
        Deque<String> deq = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер очереди : ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            Scanner sct = new Scanner(System.in);
            System.out.println("Введите слово с учетом регистра : ");
            deq.add(sct.next());
        }
        System.out.println(deq);
        return deq;
    }
    public static Deque<String> Qmod(Deque<String> quee, String slovo){
        quee.removeIf(element -> element.equals(slovo));
        System.out.println(quee);
        return quee;
    }
}