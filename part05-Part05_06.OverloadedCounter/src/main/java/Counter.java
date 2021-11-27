/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ania
 */
public class Counter {
    
    private int startValue;
    
    public Counter () {
        this(0);
    }
    
    public Counter (int value) {
        this.startValue = value;
    }
    
    public int value () {
        return this.startValue;
    }
    
    public void increase() {
        this.startValue = startValue + 1;
    }
   
    public void decrease () {
        this.startValue = startValue - 1;
    }
    
    public void increase(int increseBy) {
        if(increseBy > 0) {
           this.startValue = startValue + increseBy; 
        }
            
    }
    
    public void decrease (int decreseBy) {
        if(decreseBy > 0) {
         this.startValue = startValue - decreseBy;   
        }
        
    }
    
    @Override
    public String toString () {
        return "Counter is " + startValue;
    }
    
}
