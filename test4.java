class StackOperations {

    int[] stack;
    int top;
    int capacity;

    StackOperations(int size) {
        stack = new int[size];
        this.top = -1;
        this.capacity = size;
    }

    boolean isFull() {

        return top == capacity - 1;

    }

    boolean isEmpty() {

        return top == -1;
    }

    void push(int value) {
        if (isFull()) {
            System.out.println(" Stack is full");
        } else {
            stack[++top] = value;
        }

    }

    // --------------------------------------------------------------------------------

    int pop() {

        int data = 0;
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            data = stack[top--];

        }
        return data;
    }

    void display() {

        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + "\t");
        }

    }

}

public class test4 {

    public static void main(String[] args) {
        StackOperations s = new StackOperations(6);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        s.display();

        s.pop();
        System.out.println();
        s.display();
    }

}
