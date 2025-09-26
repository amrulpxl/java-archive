import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class StackQueue {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println("stack peek: " + stack.peek());
        System.out.println("stack pop: " + stack.pop());
        System.out.println("stack size: " + stack.size());
        
        while (!stack.empty()) {
            System.out.println("popping: " + stack.pop());
        }
        
        Queue<String> queue = new LinkedList<>();
        
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        
        System.out.println("\nqueue peek: " + queue.peek());
        System.out.println("queue poll: " + queue.poll());
        System.out.println("queue size: " + queue.size());
        
        while (!queue.isEmpty()) {
            System.out.println("polling: " + queue.poll());
        }
    }
}
