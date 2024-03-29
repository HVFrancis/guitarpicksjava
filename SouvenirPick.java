
/**
 * Write a description of class SouvenirPick here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SouvenirPick extends GuitarPick
{
    // instance variables - replace the example below with your own
    private Location location;    // where obtained
    private int year;           // when obtained
    private boolean isFunctional; // is this a real pick (or a novelty)
    

   
    /**
     * Constructor for objects of class SouvenirPick
     */
    public SouvenirPick(String name, Location loc, int year, String color, boolean isReal)
    {
        super(name, color);
        this.location = loc;
        this.year = year;
        this.isFunctional = isReal;
    }

    /**
     * accessor for location
     */
    public String getLocation()
    {
        return location.getDetails();
    }
    
    /**
     * accessor for year
     */
    public int getYear()
    {
        return year;
    }
  
    /**
     * accessor for isFunctional
     */
    public boolean getIsFunctional()
    {
        return isFunctional;
    }
  
        /**
     * Display the details of the pick
     */
    public void printDetails()
    {
        System.out.println("Name: " + getName());
        System.out.println("From: " + location.getDetails());
        System.out.println("Year: " + year);
        System.out.println("Color(s): " + getColor());
        if(isFunctional == true) {
            System.out.println("is a real pick");
        }
        else {
            System.out.println("is a novelty pick");
        }
        
            
                
    }
    
    
}
