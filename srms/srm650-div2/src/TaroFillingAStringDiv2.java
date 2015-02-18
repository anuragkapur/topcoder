import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TaroFillingAStringDiv2 {
	
	public int getNumber(String S) {
        System.out.println("String :: " + S);

        if (!S.contains("?")) {
            char ch1[] = S.toCharArray();
            int ugliness = 0;
            for (int i=1; i<ch1.length; i++) {
                if (ch1[i] == ch1[i-1]) {
                    ugliness ++;
                }
            }
            return ugliness;
        }

        if (!S.contains("A") && !S.contains("B")) {
            return 0;
        }

        char ch[] = S.toCharArray();

        int result1 = Integer.MAX_VALUE;
        int result2 = Integer.MAX_VALUE;

        if (ch[0] != '?') {
            for (int i=1; i<ch.length; i++) {
                if (ch[i] == '?') {
                    if (ch[i -1] == 'A') {
                        ch[i] = 'B';
                        result1 = getNumber(new String(ch));
                    } else {
                        ch[i] = 'A';
                        result2 = getNumber(new String(ch));
                    }
                    break;
                }
            }
        } else {
            for (int i=1; i<ch.length; i++) {
                if (ch[i] == 'A') {
                    ch[i-1] = 'B';
                    result1 = getNumber(new String (ch));
                    // The break statement is critical. Else the input string can get incorrectly modified.
                    // Ex: In the 2nd iteration of this loop for ??AB,
                    // the string will become: ?BBB - note A was changed to B, which should never happen.
                    break;
                } else if (ch[i] == 'B') {
                    ch[i-1] = 'A';
                    result2 = getNumber(new String(ch));
                    break;
                }
            }
        }

        return Math.min(result1, result2);
	}
}
