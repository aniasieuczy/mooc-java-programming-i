
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ania
 */
public class Reader {
   Scanner scanner = new Scanner(System.in);
    private ArrayList<String> lines;
    private Recipes recipes;
    private ArrayList<Recipes> allRecipes;
    String input;
    String command;

    public Reader(Scanner scanner) {
        this.scanner = scanner;
        this.lines = new ArrayList<String>();
        this.allRecipes = new ArrayList<Recipes>();
//        this.ingredients = new ArrayList<String>();
    }

    public String readFile() {
        System.out.print("File to read: ");
        String input = scanner.nextLine();
        System.out.println("");
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        return input;
    }


    public void getLines(String input) {

        boolean flag = true;
        while (flag) {

                try (Scanner reader = new Scanner(Paths.get(input))) {
                    while (reader.hasNextLine()) {

                        String row = reader.nextLine();
                        lines.add(row);
                        //System.out.println(row);
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                flag = false;
            }
        }

    public void convertLinesToRecipesList(ArrayList<String> lines) {
        int i = 0;
        String name = "0";
        int time = 0;


        while (i < lines.size()) {

            name = lines.get(i);
            time = Integer.valueOf(lines.get(i + 1));
            ArrayList <String> ingredients = new ArrayList<>();


            int c = i + 2;
            while ((!(lines.get(c).isEmpty())) && c < lines.size()-1) {
                ingredients.add(lines.get(c));
//                System.out.println(ingredients);
                    c++;
                }

            Recipes recipes = new Recipes(name, time, ingredients);
            recipes.setIngredients(ingredients);
            allRecipes.add(recipes);

//            System.out.println(recipes);
            i = c + 1;
        }
    }

    public ArrayList<String> getLines() {
        return lines;
    }

    public Recipes getRecipes () {
        return recipes;
    }

    public void printAllRecipes () {
        for(int i =0; i < allRecipes.size(); i++) {
            System.out.println(allRecipes.get(i));
        }
    }


    public ArrayList<Recipes> getAllRecipes() {
        return allRecipes;
    }

    public void findName(ArrayList <Recipes> allRecipes) {
        System.out.print("Searched word: ");
        String searchedWord = scanner.nextLine();

        System.out.println("Recipes:");

        for(int i = 0; i < allRecipes.size(); i++) {
            if (allRecipes.get(i).getName().contains(searchedWord)) {
                System.out.println(allRecipes.get(i));
            }
        }
    }

    public void findCookingTime (ArrayList <Recipes> allRecipes) {
        System.out.println("Max cooking time: ");
        int cookingTime = Integer.valueOf(scanner.nextLine());

        System.out.println("Recipes: ");

        for(int i = 0; i< allRecipes.size(); i++) {
            if(allRecipes.get(i).getTime() <= cookingTime) {
                System.out.println(allRecipes.get(i));
            }
        }
    }

    public void findIngredient (ArrayList <Recipes> allRecipes) {
        System.out.print("Ingredient: ");
        String ingredient = scanner.nextLine();
        System.out.println("Recipes: ");


        for (int i = 0; i < allRecipes.size(); i++) {

                if (allRecipes.get(i).getIngredients().contains(ingredient)) {
                    System.out.println(allRecipes.get(i));
                }
            }
        }
    }
