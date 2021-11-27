
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
public class UserInterface {


    private Scanner scanner;
    private ArrayList<Integer> listOfPoints;


    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.listOfPoints = new ArrayList<Integer>();
    }

    public ArrayList<Integer> gettingPoints() {
        System.out.println("Enter point totals, -1 stops: ");

        while (true) {
            String numberAsString = scanner.nextLine();
            int points = Integer.valueOf(numberAsString);

            if (points == -1) {
                break;

            } else if ((points > 0) && (points < 100)) {
                this.listOfPoints.add(points);
            }
        }
        return listOfPoints;
    }

    public ArrayList<Integer> getListOfPoints() {
        return listOfPoints;
    }
}

