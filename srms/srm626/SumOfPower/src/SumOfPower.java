/**
 * Max Points: 250
 * Status: Passed System Testing
 */
public class SumOfPower {

	public int findSum(int[] array) {

        int sum = 0;

        for (int i=0; i<array.length; i++) {
            int lastIndex = i;
            while(lastIndex < array.length) {
                for (int j=i; j<=lastIndex; j++) {
                    sum += array[j];
                }
                lastIndex ++;
            }
        }
        return sum;
	}
}
