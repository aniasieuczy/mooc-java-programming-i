
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;


public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Which file should have its contents printed? ");
        String userChoice = reader.nextLine();
        String fileName = userChoice;
        
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {

        while(scanner.hasNextLine()) {
            String row = scanner.nextLine();
            System.out.println(row); 
            }
        
        } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }
      

    }
}
