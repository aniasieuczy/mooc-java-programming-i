
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ania
 */
public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
    
    public void start() {
        
        while(true) {
        System.out.print("Command: ");
        String command = scanner.nextLine();
       
        if(command.equals("add")) {
            System.out.print("Word: ");
            String word = scanner.nextLine();
            System.out.print("Translation: ");
            String translation = scanner.nextLine();
            simpleDictionary.add(word, translation);
            continue;
        } 
        if(command.equals("search")) {
            
                System.out.print("To be translated: ");
                String searchedWord = scanner.nextLine();
                
                if(this.simpleDictionary.contains(searchedWord)) {
                    System.out.println("Translation: " + this.simpleDictionary.translate(searchedWord));
                } else {
                    System.out.println("Word " + searchedWord + " was not found."); 
                }
                continue; 
            }
         
        if(command.equals("end")) {
            System.out.println("Bye bye!");
            break;
        }
            System.out.println("Unknown command");
        
        }
        
        
    }
}
