
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        String name = "name";

        while(true) {
            String input = scanner.nextLine();

            if(input.equals("")) {
                System.out.println("Name of the oldest: " + name);
                break;
            }

            String [] parts = input.split(",");
            if(Integer.valueOf(parts[1]) > max) {
                max = Integer.valueOf(parts[1]);
                name = parts[0];
            }
        }
    }
}
