
interface StackADT {

    void push(int item) throws Exception;

    int pop() throws Exception;

    int peek() throws Exception;

    boolean isEmpty();

    boolean isFull();
}

class ArrayStack implements StackADT {

    private int[] stack;
    private int top;

    public ArrayStack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int item) throws Exception {
        if (isFull()) {
            throw new Exception("Stack Overflow");
        }
        stack[++top] = item;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack Underflow");
        }
        return stack[top--];
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }
}

public class StackInterface {

    public static void main(String[] args) {
        ArrayStack stk = new ArrayStack(10);
        try {
            stk.push(10);
            stk.push(20);
            stk.push(30);
            System.out.println("Top value" + stk.peek());
            System.out.println("Popped : " + stk.pop());
            System.out.println("Popped : " + stk.pop());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
