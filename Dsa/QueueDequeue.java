class QueueDequeue{

    //q = queue
    //n = size ,
    //f= front
    //r = rear
    

    int N = 5;
    int[] Q = {10, 20, 30, 40, 50};
    int F = 0;  // Front
    int R = 4;  // Rear

    // Dequeue operation
    int dequeue() {
        if (F == -1) {
            System.out.println("Queue Underflow");
            return -1;
        } else {
            int y = Q[F];   // y = Q[F]

            if (F == R) {
                F = -1;
                R = -1;
            } else {
                F++;        // F = F + 1
            }

            return y;
        }
    }

    // Display queue
    void show() {
        if (F == -1) {
            System.out.println("Queue is empty");
        } else {
            for (int i = F; i <= R; i++) {
                System.out.print(Q[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueDequeue obj = new QueueDequeue();

        System.out.println("Deleted: " + obj.dequeue());
        System.out.println("Deleted: " + obj.dequeue());

        System.out.print("Remaining Queue: ");
        obj.show();
    }
}