
/**
 * Write a description of class PlayingPick here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlayingPick extends GuitarPick
{
    // instance variables - replace the example below with your own
    private double thickness;
    private int quantity;
    

    /**
     * Constructor for objects of class PlayingPick
     */
    public PlayingPick(String name, double thickness, String color, int quantity)
    {
        super(name, color);
        this.thickness = thickness;
        this.quantity = quantity;
    }

    /**
     * Accessor for thickness
     */
    public double getThickness() {
        return thickness;
    }
    
    /**
     * Accessor for quantity
     */
    public int getQuantity() {
        return quantity;
    }
    
    /**
     * Add picks of this type to the collection
     * 
     * @param picks The number of new picks being added
     */
    public void addPicks(int picks) {
        quantity += picks;
    }
    
    
    /**
     * Remove a single pick from of this type
     */
    public void removePick()
           throws LastPickException 
    {
        quantity--;
        
        if (quantity <= 0) {
            throw new LastPickException();
        }
        
    }
    
    public void printDetails() {
        
    }
}
