
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ania
 */
public class Statistics {
 
    private ArrayList<Integer> listOfPoints;
    private ArrayList<Integer> listOfPassing;

    public Statistics() {
        this.listOfPoints = new ArrayList<Integer>();
        this.listOfPassing = new ArrayList<Integer>();
    }


    public void averageOfAll(ArrayList<Integer> listOfPoints) {

        int sum = 0;
        double average = 0;
        for (int i = 0; i < listOfPoints.size(); i++) {
            int points = listOfPoints.get(i);
            sum = points + sum;
        }
        average = sum / listOfPoints.size();
        System.out.println("Point average (all): " + average);
    }


    public void averageOfPassing(ArrayList<Integer> listOfPoints) {
        double averagePassing = 0;
        int passingSum = 0;
        int passingCount = 0;

        for (int i = 0; i < listOfPoints.size(); i++) {
            int points = listOfPoints.get(i);

            if (points >= 50) {
                listOfPassing.add(points);
                passingSum = passingSum + points;
                averagePassing = passingSum / listOfPassing.size();
            }
        }


        if (averagePassing > 0) {
            System.out.println("Point average (passing): " + averagePassing);
        } else if (averagePassing < 0 || averagePassing == 0.0) {
            System.out.println("Point average (passing):- ");
        }
    }


    public void passPercentage (ArrayList<Integer> listOfPoints, ArrayList<Integer> listOfPassing) {

            double passPercentage = 0;

        passPercentage = 100 * (double)listOfPassing.size() / (double)listOfPoints.size();
        System.out.println("Pass percentage: " + passPercentage);
    }

    public ArrayList<Integer> getListOfPassing() {
        return listOfPassing;
    }
}
    