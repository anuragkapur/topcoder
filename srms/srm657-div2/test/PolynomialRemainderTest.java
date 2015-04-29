import org.junit.Test;
import static org.junit.Assert.*;

public class PolynomialRemainderTest {
	
	@Test(timeout=2000)
	public void test0() {
		int a = 0;
		int b = 0;
		int c = 0;
		assertEquals(0, new PolynomialRemainder().findRoot(a, b, c));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int a = 0;
		int b = 0;
		int c = 1;
		assertEquals(-1, new PolynomialRemainder().findRoot(a, b, c));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int a = 1;
		int b = 2;
		int c = 3;
		assertEquals(-1, new PolynomialRemainder().findRoot(a, b, c));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int a = 123456000;
		int b = 789012345;
		int c = 678901230;
		assertEquals(121618466, new PolynomialRemainder().findRoot(a, b, c));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int a = 479659453;
		int b = 928595613;
		int c = 143451144;
		assertEquals(647373336, new PolynomialRemainder().findRoot(a, b, c));
	}
}
