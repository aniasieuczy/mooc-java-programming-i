
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sum = 0;
        int count = 0;
        
        while (true){
            double number = Double.valueOf(scanner.nextLine());
        
            if(number > 0) {
                sum = sum + number;
                count = count + 1;
            
            } else if ((number == 0) & (sum <= 0)) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (number == 0) {
                double average = sum / count;
                System.out.println(average);
                break;
            }
            
            if ((number == 0) && (count == 1)) {
                System.out.println("Cannot calculate the average");
                break;
            }
        }
    }  
}
