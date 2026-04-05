class StackPushExample {

    //in arrarys
    

    int max = 5;
    int[] s = new int[max];
    int top = -1;

    // Push operation
    void push(int data) {
        if (top == max - 1) {
            System.out.println("Stack Overflow");
        } else {
            top = top + 1;
            s[top] = data;
            System.out.println(data + " pushed into stack");
        }
    }

    // Display stack
    void show() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(s[i]);
            }
        }
    }

    public static void main(String[] args) {
        StackPushExample obj = new StackPushExample();

        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.push(60); // This will show overflow

        obj.show();
    }
}