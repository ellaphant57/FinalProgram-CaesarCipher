import java.io.IOException;

/**
 *  Final Program
 *  define methods needed to sort the alphabet
 *  CS108-4
 *  5/14/20
 *  @author  Danela Mae Agpaoa
 */

public interface alphabetSorting {
    /**
     * convert the alphabet file to an ArrayList of letters and numbers.
     * @param filePath
     * @throws IOException
     */
    public void alphaToList(String filePath) throws IOException;

    /**
     * sorts the alphabet using bubble sort
     */
    public void alphaSort();
}
