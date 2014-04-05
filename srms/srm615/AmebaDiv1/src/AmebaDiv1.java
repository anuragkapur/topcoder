import java.util.*;
import java.math.*;
import static java.lang.Math.*;

/**
 * Max Points: 250
 * Status: All System Tests Pass
 */
public class AmebaDiv1 {
	
	public int count(int[] X) {

        Set<Integer> candidateS = new HashSet<>();
        Set<Integer> possibleFinalSizes = new HashSet<>();

        for (int i=0; i<X.length; i++) {

            int currentSize = X[i];
            for (int j=0; j<X.length; j++) {
                if (currentSize == X[j]) {
                    candidateS.add(currentSize);
                    currentSize = currentSize * 2;
                }
            }
            possibleFinalSizes.add(currentSize);
        }

        // s minus possibleFinalSizes
        Set<Integer> s = new HashSet<>();
        for (Integer candidateSElement : candidateS) {
            if (!possibleFinalSizes.contains(candidateSElement)) {
                s.add(candidateSElement);
            }
        }

		return s.size();
	}
}
