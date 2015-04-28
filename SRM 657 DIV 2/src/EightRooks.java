import java.util.*;
import java.math.*;
import static java.lang.Math.*;

/**
 * Max points: 250
 * Status: Passed system tests
 */
public class EightRooks {
	
	public String isCorrect(String[] board) {

		int columnsUsed[] = new int[8];
		int count = 0;

		for (String row : board) {
			boolean foundInRow = false;
			for (int i=0; i<row.length(); i++) {
				char ch = row.charAt(i);
				if (ch == 'R') {
					count ++;
					if (columnsUsed[i] == 1 || foundInRow) {
						return "Incorrect";
					} else {
						columnsUsed[i] = 1;
						foundInRow = true;
					}
				}
			}
		}

		if (count == 8) {
			return "Correct";
		} else {
			return "Incorrect";
		}
	}
}
