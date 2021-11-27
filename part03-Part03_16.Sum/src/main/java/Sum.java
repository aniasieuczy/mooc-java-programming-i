
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
    ArrayList <Integer> numbers = new ArrayList<>();
       
    numbers.add(3);
    numbers.add(1);
    numbers.add(7);
    numbers.add(9);
    numbers.add(2);
    numbers.add(6);

    System.out.println(sum(numbers));
    }
    
    public static int sum(ArrayList <Integer> numbers) {
        int sum = 0;
        for(int i = 0; i <= numbers.size() - 1; i++) {
            sum = sum + numbers.get(i); 
        }
            return sum;
    }
}


        

