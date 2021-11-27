/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ania
 */
public class Container {
    
    private String name;
    private int amount;
    
    public Container() {
    }


    public String getName() {
        return name;
    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public int getAmount() {
        return amount;
    }
//
//    public void setAmount(int amount) {
//        this.amount = amount;
//    }
    
    
    public int contains () {
        return this.amount;
    }
    
    public void add(int amount) {
        if((amount > 100) || (this.amount + amount > 100)) {
            this.amount = 100;
        } else if (amount < 0) {
            this.amount = this.getAmount();
        } else {
        this.amount = this.getAmount() + amount;
        }
    }
    
   
    public void remove(int amount) {
       
        if((this.getAmount() - amount) < 0) {
            this.amount = 0;
        } else {
        this.amount = this.getAmount() - amount;
        }
    }
    
    
    @Override
    public String toString() {
        return this.amount + "/100";
    }
    
    
}
