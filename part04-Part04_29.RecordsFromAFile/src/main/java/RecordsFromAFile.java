
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Name of the file: ");
        String file = scanner.nextLine();
        
        ArrayList <String> data = new ArrayList<>();
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
        
            while(reader.hasNextLine()) {
            String line = reader.nextLine();
            
//            if(line.equals("")) {
//                break;
//            }
        
            String [] parts = line.split(",");
            String name = parts[0];
            int age = Integer.valueOf(parts[1]);
            
            data.add(line);
            
            
            String year;
            if(age == 1) {
                year = " year";
            } else {
                year = " years";
            }
            
            System.out.println( name + ", age: " + age + year);
        }   
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
