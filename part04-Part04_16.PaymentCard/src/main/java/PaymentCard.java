/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ania
 */
public class PaymentCard {
    
    private double balance;
    
    public PaymentCard (double openingBalance) {
        this.balance = openingBalance;
    }
    
    @Override
    public String toString () {
        return "The card has a balance of " + this.balance + " euros";
    }
    
    public void eatAffordably () {
        if((balance - 2.60) < 0) {
        balance = balance;    
        } else {
        balance = this.balance - 2.60;
        }
    }
    
    public void eatHeartily () {
        if((this.balance - 4.60) < 0) {
            balance = balance;
        } else {
        balance = this.balance - 4.60;   
        }  
    }
    
    public void addMoney (double amount) {
        if (amount < 0) {
            balance = balance;
        } else if ((balance + amount) > 150) {
        balance = 150;    
        } else {
        balance = balance + amount;    
    }
}
    
    
    

    
    
    
}
