
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
public class UserInterface {
    
   private TodoList toDoList;
   private Scanner scanner;

   
    public UserInterface(TodoList toDoList, Scanner scanner) {
        this.toDoList = toDoList;
        this.scanner = scanner;
    }

    public void setToDoList(TodoList toDoList) {
        this.toDoList = toDoList;
    }

    public TodoList getToDoList() {
        return toDoList;
    }  
    
   public void start() {
       
       while(true) {
           System.out.print("Command: ");
           String command = scanner.nextLine();
           
           if(command.equals("add")) {
               System.out.print("To add: ");
               String task = scanner.nextLine();
               toDoList.add(task);
           }
           
           if(command.equals("list")) {
           toDoList.print();
           }
           
           if(command.equals("remove")) {
               System.out.print("Which one is removed?");
               int number = Integer.valueOf(scanner.nextLine());
               toDoList.remove(number);
           }
           
          if(command.endsWith("stop")) {
              break;
          }
       }
       
   }  
}
