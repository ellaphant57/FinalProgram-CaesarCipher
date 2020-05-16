import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *  Final Program
 *  This class includes all dealings with the alphabet: sorting, listing. Also includes the message to be printed after the encryption process.
 *  CS108-4
 *  5/14/20
 *  @author  Danela Mae Agpaoa
 */

public class Alphabet <E> extends binarySearch implements alphabetSorting{
    public static ArrayList<String> alphabetList = new ArrayList<String>();
    public static String[] alphabetArray;
    public static ArrayList<String> message = new ArrayList<String>();
    public static ArrayList<String> temporaryList = new ArrayList<String>();

    public Alphabet() throws IOException {
        alphaToList("alphabet.txt");
        alphaSort();
    }

    /**
     * convert the alphabet file to an ArrayList of letters and numbers.
     * @param filePath
     * @throws IOException
     */
    public void alphaToList(String filePath) throws IOException {
        FileInputStream inStream = new FileInputStream(filePath);
        Scanner inFS = new Scanner(inStream);

        String stringLine = inFS.nextLine();
        alphabetArray = stringLine.split(" ");

        for (int i = 0; i < alphabetArray.length; i++) {
            temporaryList.add(alphabetArray[i]);
        }

        inStream.close();
    }

    /**
     * sorts the alphabet using bubble sort
     */
    public void alphaSort() {
        int minIndex = 0;
        String fakeString = "";
        boolean success = true;

        //bubble sort the alphabet
        while(success){
            success = false;

            for (int i = 0; i < alphabetArray.length - 1; i++) {
                if (alphabetArray[i].compareToIgnoreCase(alphabetArray[i + 1]) > 0){
                    fakeString = alphabetArray[i];
                    alphabetArray[i] = alphabetArray[i + 1];
                    alphabetArray[i + 1] = fakeString;

                    success = true;
                }
            }
        }

        //reset temporaryList with the new sorted values
        for (int i = 0; i < alphabetArray.length; i++) {
            temporaryList.set(i, alphabetArray[i]);
        }

        //add strings from temporary arrayList to alphabet arrayList
        for (String alphaBit : temporaryList) {
            alphabetList.add(alphaBit);
        }
        alphabetList.add(" ");
    }

    /**
     * print out statement indicating the encryption process is done.
     * @return top of queue
     */
    public E doneMethod(){
        Queue<E> queue = new LinkedList<E>();
        String finished = "Have fun with that! Bye!";

        queue.add((E) finished);

        return queue.poll();
    }
}
