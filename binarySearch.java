import java.util.ArrayList;

public abstract class binarySearch {
    /**
     * use binary search to find the letter in the alphabet
     * @param givenList
     * @param target
     * @return index of letter in the arrayList
     */
    public static int search(ArrayList<String> givenList, String target, int highVal, int lowVal, int mid){
        if (lowVal <= highVal) {
            mid = lowVal + (highVal - lowVal) / 2;
            int searching = target.compareToIgnoreCase(givenList.get(mid));

            //check if target matches with mid
            if (searching == 0){
                return mid;
            }

            //If target is greater, look at right side
            if (searching > 0){
                lowVal = mid + 1;
                return search(givenList, target, highVal, lowVal, mid);
            }

            //if target is smaller, look at left side
            else {
                highVal = mid - 1;
                return search(givenList, target, highVal, lowVal, mid);
            }
        }

        return -1;
    }
}
