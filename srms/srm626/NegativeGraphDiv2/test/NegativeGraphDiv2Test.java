import org.junit.Test;
import static org.junit.Assert.*;

public class NegativeGraphDiv2Test {
	
	@Test
	public void test0() {
		int N = 3;
		int[] s = new int[] {1,1,2,2,3,3};
		int[] t = new int[] {2,3,1,3,1,2};
		int[] weight = new int[] {1,5,1,10,1,1};
		int charges = 1;
		assertEquals(-9L, new NegativeGraphDiv2().findMin(N, s, t, weight, charges));
	}
	
	@Test
	public void test1() {
		int N = 1;
		int[] s = new int[] {1};
		int[] t = new int[] {1};
		int[] weight = new int[] {100};
		int charges = 1000;
		assertEquals(-100000L, new NegativeGraphDiv2().findMin(N, s, t, weight, charges));
	}
	
	@Test
	public void test2() {
		int N = 2;
		int[] s = new int[] {1,1,2};
		int[] t = new int[] {2,2,1};
		int[] weight = new int[] {6,1,4};
		int charges = 2;
		assertEquals(-9L, new NegativeGraphDiv2().findMin(N, s, t, weight, charges));
	}
	
	@Test
	public void test3() {
		int N = 2;
		int[] s = new int[] {1};
		int[] t = new int[] {2};
		int[] weight = new int[] {98765};
		int charges = 100;
		assertEquals(-98765L, new NegativeGraphDiv2().findMin(N, s, t, weight, charges));
	}
}
