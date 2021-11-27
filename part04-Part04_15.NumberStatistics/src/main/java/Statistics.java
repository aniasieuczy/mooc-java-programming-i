
public class Statistics {
    
    private int count;
    private int sum;
    
    public Statistics () {
        this.count = 0;   
    }
    
    public void addNumber (int number) {
        sum = number + sum;
        count++; 
    }
    
    public int getCount () {
        return count;
    }
    
    public int sum () {
        return sum;
    }
          
    public double average () {
        double average;
        if(this.count == 0) {
            average = 0;
        } else {
        average = (double) this.sum/count;
    }        
        return average;
    }   
}
