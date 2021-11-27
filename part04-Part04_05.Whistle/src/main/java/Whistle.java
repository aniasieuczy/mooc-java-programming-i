/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ania
 */
public class Whistle {
    
    private String animalSound;
    
    public Whistle(String whistleSound) {
        this.animalSound = whistleSound;
    }
    
    public void sound() {
        System.out.println(animalSound);   
    }

    
    @Override
    public String toString() {
        return this.animalSound;
    }
   
    
}
