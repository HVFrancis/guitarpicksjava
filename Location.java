
/**
 * Location keeps track of a City and State/Country
 *
 * @author Howard Francis
 * @version 2020.02.11
 */
public class Location
{
    // instance variables - replace the example below with your own
    private String city;
    private String state;

    /**
     * Constructor for objects of class Location
     */
    public Location(String cty, String st)
    {
        city = cty;
        state = st;
    }

    /**
     * accessor for city
     */
    public String getCity()
    {
        return city;
    }
    
    /**
     * Accessor for state/country
     */
    public String getStateCountry()
    {
        return state;
    }
    
    /**
     * Display details about the location
     */
    public void printDetails()
    {
        System.out.println(city + ", " + state);
    }
    
    /**
     * Return details about the location
     */
    public String getDetails()
    {
        return city + ", " + state;
    }
    
}
