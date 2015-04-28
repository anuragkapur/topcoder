import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ProblemSetsEasy {
	
	public int maxSets(int E, int EM, int M, int MH, int H) {

		int count = 0;

		// get min of E, M, H and subtract min from E, M, H
		int min = min(E, M, H);
		count += min;
		E = E - min;
		M = M - min;
		H = H - min;

		// compute all possible distributions of EM

		// compute all possible distributions of MH

		return 0;
	}

	private int min(int E, int M, int H) {
		int min = Math.min(E, M);
		return Math.min(min, H);
	}
}
