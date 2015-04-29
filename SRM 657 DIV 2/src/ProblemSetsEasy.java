import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ProblemSetsEasy {
	
	public int maxSets(int E, int EM, int M, int MH, int H) {

		int count = 0;
		int maxIterations = E + EM;
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
				char maxCode = getMaxCode(E+EM, H+MH);
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

	private char getMaxCode(int E, int H) {
		if (E > H) {
			return 'E';
		} else {
			return 'H';
		}
	}
}
