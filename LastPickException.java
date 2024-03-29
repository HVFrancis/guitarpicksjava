
/**
 * Write a description of class LastPickException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LastPickException extends RuntimeException
{
    

    /**
     * Constructor for objects of class LastPickException
     */
    public LastPickException()
    {
    
    }

    public String toString() {
        return "That was the last pick of that type in the collection.";
    }
}
