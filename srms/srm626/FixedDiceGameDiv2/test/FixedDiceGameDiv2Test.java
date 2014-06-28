import org.junit.Test;
import static org.junit.Assert.*;

public class FixedDiceGameDiv2Test {
	
	@Test
	public void test0() {
		int a = 2;
		int b = 2;
		assertEquals(2.0, new FixedDiceGameDiv2().getExpectation(a, b), 1e-9);
	}
	
	@Test
	public void test1() {
		int a = 4;
		int b = 2;
		assertEquals(3.2, new FixedDiceGameDiv2().getExpectation(a, b), 1e-9);
	}
	
	@Test
	public void test2() {
		int a = 3;
		int b = 3;
		assertEquals(2.6666666666666665, new FixedDiceGameDiv2().getExpectation(a, b), 1e-9);
	}
	
	@Test
	public void test3() {
		int a = 11;
		int b = 13;
		assertEquals(7.999999999999999, new FixedDiceGameDiv2().getExpectation(a, b), 1e-9);
	}
}
