import java.util.concurrent.*;
import java.util.List;
import java.util.Arrays;

public class ConcurrencyManager {

    // Simulates an API or network fetch task
    static class FetchTask implements Callable<String> {
        private final String dataSource;

        public FetchTask(String dataSource) {
            this.dataSource = dataSource;
        }

        @Override
        public String call() throws Exception {
            // Simulate variable latency
            Thread.sleep((long) (Math.random() * 1000));
            return "Data from " + dataSource + " processed by " + Thread.currentThread().getName();
        }
    }

    public static void main(String[] args) {
        // Create a thread pool with fixed capacity
        ExecutorService executor = Executors.newFixedThreadPool(3);
        
        List<FetchTask> tasks = Arrays.asList(
            new FetchTask("Database_A"),
            new FetchTask("Cloud_Bucket"),
            new FetchTask("External_API")
        );

        try {
            System.out.println("Spawning concurrent processes...");
            // Execute all tasks concurrently
            List<Future<String>> results = executor.invokeAll(tasks);

            // Harvest the results as they finish
            for (Future<String> result : results) {
                System.out.println("Result received: " + result.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Thread execution interrupted: " + e.getMessage());
        } finally {
            // Crucial: Always shut down the thread pool to avoid resource leaks
            executor.shutdown();
        }
    }
}
