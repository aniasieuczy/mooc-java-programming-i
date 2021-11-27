
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
       
        while(true) {
            String input = scanner.nextLine();
                sum = sum + 1;

            if(input.equals("end")) {
                System.out.println(sum-1);
                break;
            }
        }
    }
}
