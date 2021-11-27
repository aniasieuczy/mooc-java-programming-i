
public class HealthStation {
    
    private int count;

    public int weigh(Person person) {
        int weigh = person.getWeight();
        
        if(weigh == 0) {
        return -1;
        }
        count ++;
        return weigh;
    }
    
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
  
    public int weighings() {
        return count;
    }


    
}
