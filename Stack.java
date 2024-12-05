public class Stack {
    int top = -1;
    private int MAX_SIZE = 10;
    int a[] = new int[MAX_SIZE];

    // Push method to add elements to the stack
    void push(int X) {
        if (top == MAX_SIZE - 1) {
            System.out.println("STACK OVERFLOW");
            System.exit(1);  // Exiting if stack overflows
        }
        a[++top] = X;
        System.out.println("Inserted element = " + X);
    }

    // Pop method to remove and return the top element from the stack
    int pop() {
        if (top == -1) {
            System.out.println("STACK EMPTY");
            System.exit(1);  // Exiting if stack is empty
        }
        return a[top--];
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);

        System.out.println("Popped element is: " + s.pop());
        System.out.println("Popped element is: " + s.pop());

        System.out.println("Remaining stack elements:");

        for (int i = 0; i <= s.top; i++) {
            System.out.println(s.a[i]);
        }
    }
}
