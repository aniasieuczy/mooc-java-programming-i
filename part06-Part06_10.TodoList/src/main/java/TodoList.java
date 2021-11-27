
import java.util.ArrayList;
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
public class TodoList {

private final ArrayList <String> things;

    public TodoList() {
        this.things = new ArrayList <> ();
    }
    

    public void add(String task){
        this.things.add(task);
    }
    
    public void print() {
        int index = 0;
        while(index < things.size()) {
            System.out.println((index + 1) + ": " +things.get(index));
            index = index + 1;  
        }
    }
    
    public void remove(int number) {
        things.remove(number - 1); 
   }


    
}
