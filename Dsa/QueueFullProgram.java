import java.util.Scanner;

class QueueFullProgram {

    int N = 5;
    int[] Q = new int[N];
    int F = -1;
    int R = -1;

    // Check if FULL
    boolean isFull() {
        return R == N - 1;
    }

    // Check if EMPTY
    boolean isEmpty() {
        return F == -1;
    }

    // Enqueue
    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow");
        } else {
            if (F == -1) {
                F = 0;
            }
            R++;
            Q[R] = data;
            System.out.println(data + " inserted");
        }
    }

    // Dequeue
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
        } else {
            int y = Q[F];
            System.out.println("Deleted: " + y);

            if (F == R) {
                F = -1;
                R = -1;
            } else {
                F++;
            }
        }
    }

    // Display
    void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue: ");
            for (int i = F; i <= R; i++) {
                System.out.print(Q[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueFullProgram obj = new QueueFullProgram();

        int choice;

        do {
            System.out.println("\n1.Enqueue  2.Dequeue  3.Display  4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    obj.enqueue(val);
                    break;

                case 2:
                    obj.dequeue();
                    break;

                case 3:
                    obj.show();
                    break;

                case 4:
                    System.out.println("Exit...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}