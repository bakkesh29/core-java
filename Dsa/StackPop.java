class StackPop {

    //in arrrrays 

    int max = 5;
    int[] s = {10, 20, 30, 40, 50}; // already filled stack
    int top = 4; // last index


    // Pop operation
    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int x = s[top];   // x = s[top]
            top = top - 1;    // top = top - 1
            return x;         // return x
        }
    }

    // Display stack
    void show() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(s[i]);
            }
        }
    }

    public static void main(String[] args) {
        StackPop obj = new StackPop();

        System.out.println("Popped element: " + obj.pop());
        System.out.println("Popped element: " + obj.pop());

        System.out.println("Remaining stack:");
        obj.show();
    }
}