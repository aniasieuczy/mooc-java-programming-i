
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here
        Cube my = new Cube (4);
        System.out.println(my.volume());
        System.out.println(my);
        
        System.out.println();
        
               
        Cube c = new Cube(7);
        System.out.println(c.toString());
        
        
    }
}
