
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int number = Integer.valueOf(scanner.nextLine());
        
        int secondNumber = Integer.valueOf(scanner.nextLine());
        
        int sum = number + secondNumber;
        double square = Math.sqrt(sum);
        
        System.out.println(square);

    }
}
