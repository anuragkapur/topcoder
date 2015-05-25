import org.junit.Test;
import static org.junit.Assert.*;

public class PublicTransitTest {
	
	@Test(timeout=5000)
	public void test0() {
		int R = 4;
		int C = 1;
		assertEquals(1, new PublicTransit().minimumLongestDistance(R, C));
	}
	
	@Test(timeout=5000)
	public void test1() {
		int R = 2;
		int C = 2;
		assertEquals(1, new PublicTransit().minimumLongestDistance(R, C));
	}
	
	@Test(timeout=5000)
	public void test2() {
		int R = 5;
		int C = 3;
		assertEquals(4, new PublicTransit().minimumLongestDistance(R, C));
	}
	
	@Test(timeout=5000)
	public void test3() {
		int R = 8;
		int C = 2;
		assertEquals(4, new PublicTransit().minimumLongestDistance(R, C));
	}
}
