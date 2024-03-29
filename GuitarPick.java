
/**
 * This class stores information about a single guitar pick
 * in the guitar pick collection
 *
 * @author Howard Francis
 * @version 2020.02.04
 */
public abstract class GuitarPick implements Comparable<GuitarPick>
{
    // instance variables - replace the example below with your own
    private String name;        // writing on pick
    private String color;       // color(s) of the pick


    
    
    /**
     * Constructor for objects of class GuitarPick
     */
    public GuitarPick(String name, String color)
    {
        this.name = name;
        this.color = color;
    }

    /**
     * accessor for name
     */
    public String getName()
    {
        return name;
    }

    /**
     * accessor for color
     */
    public String getColor()
    {
        return color;
    }

    /**
     * Display the details of the pick
     */
    abstract public void printDetails();   

    /**
     * Print a one-line description of the pick
     */
    public void printShortDescription()
    {
        System.out.println("A " + color + " pick that says " + name + ".");
    }

    public int compareTo(GuitarPick other)
    {
        if(this.getName().toLowerCase().equals(other.getName().toLowerCase())) {
            return this.getColor().compareToIgnoreCase(other.getColor());
        }
        else {
            return this.getName().compareToIgnoreCase(other.getName());
        }
    }

}
