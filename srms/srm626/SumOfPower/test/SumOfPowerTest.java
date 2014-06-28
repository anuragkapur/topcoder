import org.junit.Test;
import static org.junit.Assert.*;

public class SumOfPowerTest {
	
	@Test
	public void test0() {
		int[] array = new int[] {1,2};
		assertEquals(6, new SumOfPower().findSum(array));
	}
	
	@Test
	public void test1() {
		int[] array = new int[] {1,1,1};
		assertEquals(10, new SumOfPower().findSum(array));
	}
	
	@Test
	public void test2() {
		int[] array = new int[] {3,14,15,92,65};
		assertEquals(1323, new SumOfPower().findSum(array));
	}
	
	@Test
	public void test3() {
		int[] array = new int[] {1,2,3,4,5,6,7,8,9,10};
		assertEquals(1210, new SumOfPower().findSum(array));
	}
}
