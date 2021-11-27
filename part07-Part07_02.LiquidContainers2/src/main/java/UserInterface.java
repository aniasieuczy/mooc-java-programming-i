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
public class UserInterface {

   Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;


public void start () {
    
    while (true) {

            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

             if (command.equals("add")) {

                if ((first + amount) >= 100) {
                    first = 100;
                } else if (amount < 0) {
                    first = first;
                } else {
                    first = first + amount;
                }
            }

             if (command.equals("move")) {

                if ((second + amount) >= 100) {
                    second = 100;
                    first = first - amount;
                } else if (first == 0) {
                    second = 0;
                } else if (first - amount < 0) {
                    second = first;
                    first = 0;
                } else {
                    first = first - amount;
                    second = second + amount;
                }
            }

            if (command.equals("remove")) {

                if (amount > second) {
                    second = 0;
                } else {
                second = second - amount;
                }
            }
        }
    }
}