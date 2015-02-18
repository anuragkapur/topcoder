import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TaroJiroDividing {
	
	public int getNumber(int A, int B) {

        Set<Integer> set = new HashSet<>();

        while(true) {
            set.add(A);
            if(A % 2 == 0) {
                A = A / 2;
            }else {
                break;
            }
        }

        System.out.println(set.size());

        int count = 0;
        while(true) {
            if (!set.add(B)) {
                count ++;
            }
            if(B % 2 == 0) {
                B = B / 2;
            }else {
                break;
            }
        }
		return count;
	}
}
