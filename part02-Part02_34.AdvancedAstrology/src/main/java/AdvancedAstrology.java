
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int print = 1;
        while(print <= number) {
            System.out.print("*");
            print++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int print = 1;
        while(print <= number) {
            System.out.print(" ");
            print++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int number = 1;
        int spaces = size - 1;
        while(number <= size) {
            printSpaces(spaces);
            printStars(number);
            spaces = spaces - 1;
            number++;
            
        }
//        System.out.println("");
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        
        int spaces = height-1;
        int stars = 1;
               
        while (spaces >= 0){
            printSpaces(spaces);
            printStars(stars);
                       
            spaces--;
            stars+=2;
        }     
        spaces = height - 2;
        stars  = 3;
               
        printSpaces(spaces);
        printStars(stars);
        printSpaces(spaces);
        printStars(stars);
    }
        
        
//        int h = height - 1;
//        int stand = height - 2;
//        int number = 1;
//
//        while (height > 0) {
//            printSpaces(h);
//            printStars(number);
//            number = number +2;
//            h--;
//            height--;
//        }
//        printSpaces(number);
//        printStars(3);
//        printSpaces(number);
//        printStars(3);
//    }
//        
    

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
