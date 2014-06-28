/**
 * Max Points: 500
 * Status: Passed System Testing
 */
public class FixedDiceGameDiv2 {
	
	public double getExpectation(int a, int b) {

        int sum = 0;
        int count = 0;

        for (int i=1; i<=b; i++) {
            for(int j=i+1; j<=a; j++) {
                sum += j;
                count ++;
            }
        }

        return (double)sum/count;
	}
}
