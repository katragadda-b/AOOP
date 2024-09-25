package search;
import java.util.Arrays;
public class BinarySearch<T extends Comparable<T>> {
	public int binarySearch(T[] array, T key) {
        Arrays.sort(array); 
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            int comparisonResult = key.compareTo(array[middle]);

            if (comparisonResult == 0) {
                return middle; 
            } 
            else if (comparisonResult > 0) {
                left = middle + 1; 
            } 
            else {
                right = middle - 1; 
            }
        }

        return -1; 
    }
}
