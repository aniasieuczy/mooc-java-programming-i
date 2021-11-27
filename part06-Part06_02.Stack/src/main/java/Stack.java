
import java.sql.Array;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ania
 */
public class Stack {
    
    private ArrayList <String> stack;
    
    public Stack () {
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        if(this.stack.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public void add (String value) {
        this.stack.add(value);
    }
    
    public ArrayList <String> values () {
        for(String name: stack) {
            System.out.println(name);
        }
        return stack;    
    }
    
    public String take () {
        int i = stack.size() -1;
        String lastvalue = this.stack.get(i);
        
        if(i  >= 0) {
            this.stack.remove(i);
          
        }
    return lastvalue;
    }

//        int i = stack.size() -1;
//        String lastvalue = this.stack.get(i);
//        if(i >= 0) {
//            this.stack.remove(i);
//        }
//    return lastvalue;
//    }
    
//    public String toString () {     
//        for(int i= 0; i< stack.size(); i++) {
//            System.out.println(stack.get(i));
//            i++;
//           return stack.get(i); 
//        }  
//    }
    
}
