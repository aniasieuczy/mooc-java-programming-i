
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("File: ");
        String file = scan.nextLine();
        
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        ArrayList <String> allData = new ArrayList<>();
        
        int count = 0;
        int wins = 0;
        int losses = 0;
        
        try (Scanner reader = new Scanner (Paths.get(file))) {
            
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
        
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);
                
                allData.add(line);
                
                if(homeTeam.equals(team)) { 
                    count++;
                      
                    if(homePoints > visitingPoints) {
                        wins++;
                    } else {
                        losses++;
                    }      
                } else if (visitingTeam.equals(team)) {
                            count++;
                            
                            if(visitingPoints > homePoints) {
                                wins++;
                        } else {
                                losses++;   
                    }   
                }    
            }
            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
