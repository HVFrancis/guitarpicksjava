import java.util.ArrayList;
import java.util.Collections;
/**
 * This class manages a collection of Guitar Picks
 *
 * @author Howard Francis
 * @version 2020.02.19
 */
public class GuitarPickCollection
{
    private ArrayList<GuitarPick> picks;

    /**
     * Constructor for objects of class GuitarPickCollection
     */
    public GuitarPickCollection()
    {
        picks = new ArrayList<>();
        populateCollection();
    }

    /**
     * method to add a pick to the collect
     */
    public void addPick(GuitarPick pick)
    {
        picks.add(pick);
        Collections.sort(picks);
    }

    /**
     * Display information about all the items in the collection
     */
    public void listAll()
    {
        for (GuitarPick pick : picks) {
            pick.printDetails();
        }
    }

    /**
     * Add some picks to the collection
     */
    private void populateCollection()
    {
        picks.add(new SouvenirPick("Nashville", new Location("Nashville", "TN"),
                2018, "purple", true));
        picks.add(new SouvenirPick("Nashville", new Location("Nashville", "TN"),
                2018, "orange", true));
        picks.add(new SouvenirPick("Memphis", new Location("Memphis", "TN"),
                2017, "purple", true));
        picks.add(new SouvenirPick("Memphis", new Location("Memphis", "TN"),
                2017, "orange", true));
        picks.add(new SouvenirPick("Cooter's Garage", new Location("Gatlinburg", "TN"),
                2019, "purple", true));
        picks.add(new SouvenirPick("Cooter's Garage", new Location("Gatlinburg", "TN"),
                2019, "orange", true)); 
        picks.add(new SouvenirPick("Mothman Search Team", new Location("Point Pleasant", "WV"),
                2017, "black", true));
        picks.add(new SouvenirPick("Mothman Search Team", new Location("Point Pleasant", "WV"),
                2017, "green", true));
        picks.add(new SouvenirPick("JWT School of Rock", new Location("Pikeville", "KY"),
                2016, "black", true));            
    }

    
    
    
}
