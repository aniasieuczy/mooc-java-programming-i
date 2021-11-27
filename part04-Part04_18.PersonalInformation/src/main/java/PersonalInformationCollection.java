
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("First name: ");
            String name = scanner.nextLine();
            
               if(name.isEmpty()) {
                break;
                }
            
            System.out.print("Last name: ");
            String lastName = scanner.nextLine();
            
            System.out.print("Identification number: ");
            String identification = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation (name, lastName, identification));

        }
        System.out.println();
              
        
        for(PersonalInformation name: infoCollection) {
            System.out.println(name);  
        }
//        
//        System.out.println(infoCollection);

        for(int i = 0; i < infoCollection.size(); i++) {
            System.out.print(infoCollection.get(i).getFirstName() + " ");
            System.out.print(infoCollection.get(i).getLastName());
            System.out.println("");
            
        }
    }
}

