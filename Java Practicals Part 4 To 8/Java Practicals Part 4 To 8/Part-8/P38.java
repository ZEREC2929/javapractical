import java.util.ArrayList;
import java.util.Scanner;

class P38 {
    private ArrayList<Object> stackList;

    public P38() {
        stackList = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public int getSize() {
        return stackList.size();
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackList.get(getSize() - 1);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackList.remove(getSize() - 1);
    }

    public void push(Object o) {
        stackList.add(o);
    }

    public static void main(String[] args) {
        P38 stack = new P38();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers to push onto the stack (type 'exit' to stop):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                int value = Integer.parseInt(input);
                stack.push(value);
                System.out.println("Pushed: " + value);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number or 'exit' to stop.");
            }
        }

        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.getSize());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack size after pop: " + stack.getSize());
        System.out.println("Is stack empty? " + stack.isEmpty());

        scanner.close();
    }
}
