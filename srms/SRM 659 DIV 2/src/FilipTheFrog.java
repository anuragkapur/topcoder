import java.util.*;
import java.math.*;
import static java.lang.Math.*;

/**
 * Max points: 250
 * Status: Complete
 */
public class FilipTheFrog {
	
	public int countReachableIslands(int[] positions, int L) {
        int startingPos = positions[0];
        Arrays.sort(positions);

        // find startingPos in sorted array
        int current = findIndexOfNumberInArray(positions, startingPos);
        if (current == -1) {
            throw new IllegalStateException("invalid array index computed");
        }

        int count = 0;

        // count reachable forward positions
        for (int i=current+1; i<positions.length; i++) {
            if (positions[i] - positions[i-1] <= L) {
                count ++;
            } else {
                // missed this break in attempt 1 and it was disastrous!
                break;
            }
        }

        // count reachable backward positions
        for (int i = current-1; i >= 0; i--) {
            if (positions[i+1] - positions[i] <= L) {
                count ++;
            } else {
                // missed this break in attempt 1 and it was disastrous!
                break;
            }
        }

        // +1 for the starting position
        return count + 1;
	}

    private int findIndexOfNumberInArray(int array[], int num) {
        for (int i=0; i<array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
