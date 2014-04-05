import org.junit.Test;
import static org.junit.Assert.*;

public class LongLongTripDiv1Test {
	
	@Test
	public void test0() {
		int N = 3;
		int[] A = new int[] {0,0,1};
		int[] B = new int[] {2,1,2};
		int[] D = new int[] {7,6,5};
		long T = 11L;
		assertEquals("Possible", new LongLongTripDiv1().isAble(N, A, B, D, T));
	}
	
	@Test
	public void test1() {
		int N = 3;
		int[] A = new int[] {0,0,1};
		int[] B = new int[] {2,1,2};
		int[] D = new int[] {7,6,5};
		long T = 25L;
		assertEquals("Possible", new LongLongTripDiv1().isAble(N, A, B, D, T));
	}
	
	@Test
	public void test2() {
		int N = 2;
		int[] A = new int[] {0};
		int[] B = new int[] {1};
		int[] D = new int[] {1};
		long T = 9L;
		assertEquals("Possible", new LongLongTripDiv1().isAble(N, A, B, D, T));
	}
	
	@Test
	public void test3() {
		int N = 2;
		int[] A = new int[] {1};
		int[] B = new int[] {0};
		int[] D = new int[] {1};
		long T = 1000000000000000000L;
		assertEquals("Impossible", new LongLongTripDiv1().isAble(N, A, B, D, T));
	}
	
	@Test
	public void test4() {
		int N = 4;
		int[] A = new int[] {0,0,1};
		int[] B = new int[] {2,1,2};
		int[] D = new int[] {10,10,10};
		long T = 1000L;
		assertEquals("Impossible", new LongLongTripDiv1().isAble(N, A, B, D, T));
	}
	
	@Test
	public void test5() {
		int N = 9;
		int[] A = new int[] {4,8,5,8,3,6,2,6,7,6,6};
		int[] B = new int[] {2,7,1,5,1,3,1,1,5,4,2};
		int[] D = new int[] {6580,8822,1968,673,1394,9337,5486,1746,5229,4092,195};
		long T = 937186357646035002L;
		assertEquals("Impossible", new LongLongTripDiv1().isAble(N, A, B, D, T));
	}
}
