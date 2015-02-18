import org.junit.Test;
import static org.junit.Assert.*;

public class TheKingsRoadsDiv2Test {
	
	@Test(timeout=2000)
	public void test0() {
		int h = 3;
		int[] a = new int[] {1, 2, 3, 7, 1, 5, 4};
		int[] b = new int[] {6, 7, 4, 3, 3, 1, 7};
		assertEquals("Correct", new TheKingsRoadsDiv2().getAnswer(h, a, b));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int h = 2;
		int[] a = new int[] {1, 2, 3};
		int[] b = new int[] {2, 1, 3};
		assertEquals("Incorrect", new TheKingsRoadsDiv2().getAnswer(h, a, b));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int h = 3;
		int[] a = new int[] {7, 1, 1, 2, 2, 3, 1};
		int[] b = new int[] {7, 1, 7, 4, 5, 2, 6};
		assertEquals("Incorrect", new TheKingsRoadsDiv2().getAnswer(h, a, b));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int h = 2;
		int[] a = new int[] {1, 3, 3};
		int[] b = new int[] {2, 1, 2};
		assertEquals("Correct", new TheKingsRoadsDiv2().getAnswer(h, a, b));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int h = 3;
		int[] a = new int[] {6, 5, 3, 3, 5, 5, 6};
		int[] b = new int[] {1, 5, 5, 6, 4, 7, 2};
		assertEquals("Correct", new TheKingsRoadsDiv2().getAnswer(h, a, b));
	}
}
