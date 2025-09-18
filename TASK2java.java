import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Запись массива данных типа список на Java
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        System.out.println(myList); // => [1, 2, 3]

        // Создание структуры данных типа стек на Java с использованием Stack
        Stack<String> stack = new Stack<>();
        stack.push("anna");
        stack.push("elena");
        stack.push("katya");
        System.out.println(stack); // => [anna, elena, katya]

        // Извлечение элементов из стека (LIFO)
        System.out.println(stack.pop()); // => katya
        System.out.println(stack.pop()); // => elena
        System.out.println(stack);       // => [anna]
    }
}