import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Clipboard;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class MyNewApp {

    public static void main(String[] args) throws AWTException, InterruptedException {

        // Take input from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the msg : ");
        String msg = scanner.nextLine();

        System.out.println("How many times you want to send : ");
        int size = scanner.nextInt();

        // Copy message to clipboard
        StringSelection stringSelection = new StringSelection(msg);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        System.out.println("You have 3 seconds to click inside the WhatsApp text box...");
        Thread.sleep(5000);

        // Create Robot object
        Robot robot = new Robot();
        
        // IMPORTANT FIX: Adds a 50-millisecond delay between every physical key press.
        // This makes it act more like a human typing, stopping the "v" glitch.
        robot.setAutoDelay(50);

        // Loop to send message multiple times
        for (int i = 1; i <= size; i++) {

            // Press Command + V (paste message)
            robot.keyPress(KeyEvent.VK_META);
            robot.keyPress(KeyEvent.VK_V);

            // Release in reverse order (best practice)
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_META);

            // Press ENTER (send message)
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            // Wait 1 second before sending next message
            Thread.sleep(1000);
        }

        scanner.close();
        System.out.println("Finished sending " + size + " messages!");
    }
}