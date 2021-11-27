import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        Scanner scanner = new Scanner (System.in);
        ArrayList <Book> books = new ArrayList<>();
        
        while(true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if(title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, year));  
        }
        
        System.out.print("What information will be printed? ");
        String what = scanner.nextLine();
        
        if(what.equals("everything")) {
            for(Book name: books ) {
                System.out.println(name);
            } 
        }
            
            if (what.equals("name")) {
                    for(int i = 0; i < books.size(); i++) {
                        System.out.println(books.get(i).getTitle());
                    }
            }
        }
        
        

    }

