import java.io.FileNotFoundException; //file path is wrong
import java.io.FileWriter;            //write data into a file
import java.io.IOException;           //input/output errors

// Main class
public class Main { 

    public static void main(String[] args) { //block starts here

        //location where to create
        String filePath = "/Users/bakkeshymr/Local Documents/Disk A/X-workz/core-java/Add_on/test.txt";

        // This is the text i want to store in file
        // \n means next line
        String textContent = "I like Benne Dosa!\nIt's really good!\nLets eat Benne Dosa!";

        // Try block:  write code that may cause error
        //Creates a FileWriter object
        try (FileWriter writer = new FileWriter(filePath)) {
            //This line writes text into the file
            writer.write(textContent);
            // This prints message if writing is successful
            System.out.println("File has been written");
        }

        //if file path is wrong
        catch (FileNotFoundException e) {
            System.out.println("File location not found");
        }

        // This runs if some other error happens while writing
        catch (IOException e) {
            System.out.println("Error while writing file");
        }
    }
}