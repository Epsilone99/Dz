import java.util.Deque;
import java.util.LinkedList;

public class BrowsHistory {
        public static final Deque<String> history = new LinkedList<>();

    public static void visitSites(String site){
        history.addFirst(site);
    }
    public static String back(int steps){
        if (steps >= history.size())
            return null;
        return history.stream().skip(steps).findFirst().orElse(null);
    }
    public static Deque<String> getHistory(){
        return history;
    }
}
