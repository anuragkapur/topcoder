import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TaroFillingAStringDiv2Alternate2 {

    public int getNumber(String S) {

        // if no ?s used
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

        // if only ?s used
        if (S.indexOf("A") < 0 && S.indexOf("B") < 0) {
            return 0;
        }

        char ch[] = S.toCharArray();

        int result1 = Integer.MAX_VALUE;
        int result2 = Integer.MAX_VALUE;

        while (new String(ch).contains("?")) {
            for (int i=0; i<ch.length; i++) {

                boolean currentAlphabet = false;
                boolean currentSymbol = false;

                if (ch[i] == 'A' || ch[i] == 'B') {
                    currentAlphabet = true;
                } else {
                    currentSymbol = true;
                }

                if (i-1 >= 0) {
                    if (ch[i-1] == 'A' || ch[i-1] == 'B') {
                        // left is alphabet

                        if (currentSymbol) {
                            switch (ch[i-1]) {
                                case 'A': ch[i] = 'B';
                                    break;
                                case 'B': ch[i] = 'A';
                                    break;
                            }
                            break;
                        }
                    } else {
                        // left is symbol

                        if (currentAlphabet) {
                            switch (ch[i]) {
                                case 'A': ch[i-1] = 'B';
                                    break;
                                case 'B': ch[i-1] = 'A';
                                    break;
                            }
                            break;
                        }
                    }
                }

                if (i+1 < ch.length) {
                    if (ch[i+1] == 'A' || ch[i+1] == 'B') {
                        if (currentSymbol) {
                            switch (ch[i+1]) {
                                case 'A': ch[i] = 'B';
                                    break;
                                case 'B': ch[i] = 'A';
                                    break;
                            }
                            break;
                        }
                    } else {
                        if (currentAlphabet) {
                            switch (ch[i]) {
                                case 'A': ch[i+1] = 'B';
                                    break;
                                case 'B': ch[i+1] = 'A';
                                    break;
                            }
                            break;
                        }
                    }
                }
            }
        }

        return getNumber(new String(ch));
    }
}
