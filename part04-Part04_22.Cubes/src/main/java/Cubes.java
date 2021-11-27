
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("end")) {         
                break;
            }
 
            String [] parts = input.split(" ");

            for(int i = 0; i< parts.length; i++) {
                int number = Integer.valueOf(parts[i]);
                System.out.println(number * number * number);
            }
        }
    }
}
