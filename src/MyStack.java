import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class MyStack {

    private final LinkedList<String> stack = new LinkedList<>();
    public void push(String str){
        stack.add(str);
    }
    public String  pop(){
        return stack.removeFirst();
    }
    public String peek(){
        return stack.peekFirst();
    }
    public LinkedList<String> getElements(){
        return new LinkedList<>(stack);
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < stack.size(); i++) {
            builder.append(stack.get(i)).append(", ");
        }

        builder.delete(builder.length() - 2, builder.length());
        return String.format("[%s]", builder); //return builder.toString()
    }


}
