
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
public class Grades {
    
    private ArrayList<Integer> listOfPoints;
    private int [] grades;



    public Grades() {
//        this.listOfPoints = new ArrayList<>();
        this.grades = new int[6];
    }



    public int [] gradeDistribution (ArrayList <Integer> listOfPoints) {

//            int [] grades = {0, 0, 0, 0, 0, 0};

        for (Integer point : listOfPoints) {
            if ((point > 0) && (point < 50)) {
                this.grades[0]= this.grades[0] + 1;
            } else if ((point >= 51) && (point < 60)) {
                this.grades[1]= this.grades[1] + 1;
            } else if ((point >= 60) && (point < 70)) {
                this.grades[2]= this.grades[2] + 1;
            } else if ((point >= 70) && (point < 80)) {
                this.grades[3]= this.grades[3] + 1;
            } else if ((point >= 80) && (point < 90)) {
                this.grades[4]= this.grades[4] + 1;
            } else if (point >= 90) {
                this.grades[5]= this.grades[5] + 1;
            }
        }
        return grades;
    }

    public int[] getGrades() {
        return grades;
    }

    public void printGradesAsStars (int [] grades) {

        System.out.println("Grade distribution: ");

        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int a = 0; a < grades[i]; a++) {
                System.out.print("*");

            }
            System.out.println("");
        }
    }

}
