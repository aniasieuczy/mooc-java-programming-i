import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.print("Name: ");
        String tvProgram = scanner.nextLine();  
        if(tvProgram.isEmpty()) {
            break;
        }
            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(tvProgram, duration));
        }
        
        for(TelevisionProgram name: programs) {
         System.out.println(name);   
        }
        
        
        System.out.println("Program's maximum duration? ");
        int max = Integer.valueOf(scanner.nextLine());
        
        for(TelevisionProgram tvProgram: programs) {
            if(tvProgram.getDuration() <= max) {
                System.out.println(tvProgram);
            }
            
        }
    }
}
