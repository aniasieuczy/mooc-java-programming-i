
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        int index = 0;
        
        while(index < array.length) {
            int number = array [index];
            int count = 0;
            
            while(count < number) {
                System.out.print("*");
                count ++;
            }
            System.out.println("");
            index ++;
            
            
            
//            switch (number) {
//                case 0:
//                    System.out.println("");
//                    break;
//                case 1:
//                    System.out.println("*");
//                    break;
//                case 2:
//                    System.out.println("**");
//                    break;
//                case 3:
//                    System.out.println("***");
//                    break;
//                case 4:
//                    System.out.println("****");
//                    break;
//                case 5:
//                    System.out.println("*****");
//                    break;
//                case 6:
//                    System.out.println("******");
//                    break;
//                case 7:
//                    System.out.println("*******");
//                    break;
//                case 8:
//                    System.out.println("********");
//                    break;
//                case 9:
//                    System.out.println("*********");
//                    break;
//                default:
//                    break;
//            }
            
            
        }
        
        
    }

}
