import java.util.Arrays;

/**
 * Max Points: 250
 * Status: All System Tests Pass
 */
public class EllysSortingTrimmer {
	
	public String getMin(String S, int L) {

        if (S.length() == L) {
            char chars[] = S.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        } else {

            String prefixString = S.substring(0, S.length()-L);

            String strToSort = S.substring(S.length()-L);
            char charsToSort[] = strToSort.toCharArray();
            Arrays.sort(charsToSort);

            S = prefixString + new String(charsToSort);
            S = S.substring(0, S.length() - 1);

            return getMin(S, L);
        }
	}
}
