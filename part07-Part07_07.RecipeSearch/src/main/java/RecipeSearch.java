
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Reader reader = new Reader(scanner);

        String input = reader.readFile();
     
        reader.getLines(input);
        reader.convertLinesToRecipesList(reader.getLines());

        while(true) {

            System.out.print("Enter command: ");
            String command = scanner.nextLine();
          

            if(command.equals("list")) {
                reader.printAllRecipes();
            } else if(command.equals("stop")) {
                break;
            } else if (command.equals("find name")) {
                reader.findName(reader.getAllRecipes());
            } else if (command.equals("find cooking time")) {
                reader.findCookingTime(reader.getAllRecipes());
            } else if(command.equals("find ingredient")) {
                reader.findIngredient(reader.getAllRecipes());
            }

            }

    }
}
