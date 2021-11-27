
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal) {
          if(!(this.meals.contains(meal))){
             this.meals.add(meal); 
          }
        
    }
    
    public void printMeals() {
        for(String name: meals){
            System.out.println(name);
        } 
    }
    
    public void clearMenu() {
      this.meals.removeAll(meals);
    }
    
    
    
    
}
