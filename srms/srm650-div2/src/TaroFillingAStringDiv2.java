import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TaroFillingAStringDiv2 {
	
	public int getNumber(String S) {

        if (S.indexOf("?") < 0) {
            char ch1[] = S.toCharArray();
            int ugliness = 0;
            for (int i=1; i<ch1.length; i++) {
                if (ch1[i] == ch1[i-1]) {
                    ugliness ++;
                }
            }
            return ugliness;
        }

        if (S.indexOf("A") < 0 && S.indexOf("B") < 0) {
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
                } else if (ch[i] == 'B') {
                    ch[i-1] = 'A';
                    result2 = getNumber(new String(ch));
                }
            }
        }

        return Math.min(result1, result2);
	}
}
