package start;//Методы:
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
import java.util.HashMap;

public class Backet {

    public static final HashMap<String, Integer> basket = new HashMap<>();

    public static void addProduct(String prod, int count) {
        if (basket.containsKey(prod))
            basket.replace(prod, basket.get(prod) + count);
        else {
            basket.put(prod, count);
        }
    }

    public static void removeProduct(String del){
        basket.remove(del);
    }
    public static void updateBasket(String prod, int count){
        if (basket.containsKey(prod))
            basket.put(prod, count);
    }
    public static int checkProduct(String prod){
        return basket.getOrDefault(prod, 0);
    }
    public static void showBasket(){
        System.out.println(basket);
    }
}
