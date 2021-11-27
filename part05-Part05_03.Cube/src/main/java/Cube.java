/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ania
 */
public class Cube {
    
    private int edgeLength;
   
    
    public Cube (int edge) {
        this.edgeLength = edge;
    }
    
    public int volume () {
        int volume = this.edgeLength * this.edgeLength * this.edgeLength;
        return volume;
    }
    
    public int getVolume () {
        return volume();
    }
    
    @Override
    public String toString () {
        return "The length of the edge is " + edgeLength + " and the volume " + getVolume();
    }
    
}
