

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        
        String [] nazwa = {"a", "t", "n"};
        
        ArrayList <Integer> numbers = new ArrayList <>();
        numbers.add(3);
        numbers.add(85);
        numbers.add(8);
        
        ArrayList <String> imiona = new ArrayList <>();
        imiona.add("Ania");
        imiona.add("Tymon");
        imiona.add("Nikos");
        
        Main.sort(array);
        Main.sort(nazwa);
        
        Main.sortIntegers(numbers);
        Main.sortStrings(imiona);
        
    }
 
        
    
    public static void sort(int[] array) {
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));
    }
    
    public static void sort(String[] array) {
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));
    }
    
    public static void sortIntegers(ArrayList<Integer> integers) {
    Collections.sort(integers);
    System.out.println(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings)  {
    Collections.sort(strings);
    System.out.println(strings);
    }
    
}




