import java.util.*;
import java.math.*;
import static java.lang.Math.*;

/**
 * Max points: 500
 * Status: Passed system tests
 */
public class ProblemSetsEasy {
	
	public int maxSets(int E, int EM, int M, int MH, int H) {

		int count = 0;
		int maxIterations = Math.min(E + EM, H + MH);
		for (int i = 0; i < maxIterations; i++) {

			// slot E
			if (E > 0) {
				E --;
			} else if (EM > 0){
				EM --;
			} else {
				break;
			}

			// slot H
			if (H > 0) {
				H --;
			} else if (MH > 0) {
				MH --;
			} else {
				break;
			}

			// slot M
			if (M > 0) {
				M --;
			} else {
				char maxCode = getMaxCode(E, EM, MH, H);
				if (maxCode == 'E' && EM > 0) {
					// take from EM
					EM --;
				} else if (maxCode == 'H' && MH > 0) {
					// take from MH
					MH --;
				} else {
					break;
				}

			}

			// update count
			count ++;
		}

		return count;
	}

	private char getMaxCode(int E, int EM, int MH, int H) {
		if (EM == 0) {
			return 'H';
		} else if (MH == 0){
			return 'E';
		} else if (E+EM >= MH+H) {
			return 'E';
		} else if (E+EM < MH + H){
			return 'H';
		} else {
			throw new IllegalStateException("meh");
		}
	}
}
