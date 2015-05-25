import org.junit.Test;
import static org.junit.Assert.*;

public class FilipTheFrogTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] positions = new int[] {4, 7, 1, 3, 5};
		int L = 1;
		assertEquals(3, new FilipTheFrog().countReachableIslands(positions, L));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] positions = new int[] {100, 101, 103, 105, 107};
		int L = 2;
		assertEquals(5, new FilipTheFrog().countReachableIslands(positions, L));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] positions = new int[] {17, 10, 22, 14, 6, 1, 2, 3};
		int L = 4;
		assertEquals(7, new FilipTheFrog().countReachableIslands(positions, L));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] positions = new int[] {0};
		int L = 1000;
		assertEquals(1, new FilipTheFrog().countReachableIslands(positions, L));
	}

	@Test
	public void test4() {
		int[] positions = new int[] {330, 696, 245, 827, 303, 601, 58, 379, 849, 970, 339, 911, 548, 399, 118, 49, 784, 863, 781, 287, 284, 540, 952, 592, 177, 342, 670, 560, 541, 554, 173, 491, 931, 706, 905, 75, 644, 543, 378, 641, 772, 273, 803, 628, 971};
		int L = 90;
		assertEquals(17, new FilipTheFrog().countReachableIslands(positions, L));
	}
}
