import java.util.LinkedList;
import java.util.Stack;

public class reverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("list before reversing");
        for (int x : list) {
            System.out.print(x + " ");
            stack.push(x);
        }

        list.clear();

        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }

        System.out.println();

        System.out.println("list before reversing");

        for (int n : list) {

            System.out.print(n + " ");
        }
    }

}
