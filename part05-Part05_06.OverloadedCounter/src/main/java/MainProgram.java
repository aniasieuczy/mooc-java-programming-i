
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter ania = new Counter();
        ania.increase();
        ania.increase();
        System.out.println(ania);
        
        ania.decrease();
        
        System.out.println(ania);
        
        ania.decrease(1);
        ania.increase(10);
        ania.decrease(-1);
        System.out.println(ania);
        
        
    }
}
