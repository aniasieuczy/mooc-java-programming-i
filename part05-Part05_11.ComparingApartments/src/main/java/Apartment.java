
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setSquares(int squares) {
        this.squares = squares;
    }

    public void setPrincePerSquare(int princePerSquare) {
        this.princePerSquare = princePerSquare;
    }

    public int getRooms() {
        return rooms;
    }

    public int getSquares() {
        return squares;
    }

    public int getPrincePerSquare() {
        return princePerSquare;
    }
    
    
    
    
    
    public boolean largerThan(Apartment compared) {
        if(this.squares > compared.squares) {
        return true;
    } 
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        int price = this.squares * this.princePerSquare;
        int priceCompared = compared.squares * compared.princePerSquare;
        int difference = price - priceCompared;
        
        if(difference > 0) {
            return difference;
        }
        return difference * (-1);
        }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int price = this.squares * this.princePerSquare;
        int priceCompared = compared.squares * compared.princePerSquare;
        if(price > priceCompared) {
        return true;
    }
        return false;
    }

}
