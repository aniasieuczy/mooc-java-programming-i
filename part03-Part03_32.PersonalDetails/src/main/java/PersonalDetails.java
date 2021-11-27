
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        String name = "n";
        int length = 0;
        double average = 0;

        while(true) {
            String input = scanner.nextLine();

            if(input.equals("")) {
                average = (double)sum / count;
                System.out.println("Longest name: " + name );
                System.out.println("Average of the birth years: " + average);
                break;
            }

            String [] pieces = input.split(",");
            int birthYear = Integer.valueOf(pieces[1]);
            sum = birthYear + sum;
            count ++;

            if(pieces[0].length() > length) {
                length = pieces[0].length();
                name = pieces[0];
            }
        }
    }
}

