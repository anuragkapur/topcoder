import org.junit.Test;
import static org.junit.Assert.*;

public class ProblemSetsEasyTest {
	
	@Test(timeout=2000)
	public void test0() {
		int E = 2;
		int EM = 2;
		int M = 1;
		int MH = 2;
		int H = 2;
		assertEquals(3, new ProblemSetsEasy().maxSets(E, EM, M, MH, H));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int E = 100;
		int EM = 100;
		int M = 100;
		int MH = 0;
		int H = 0;
		assertEquals(0, new ProblemSetsEasy().maxSets(E, EM, M, MH, H));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int E = 657;
		int EM = 657;
		int M = 657;
		int MH = 657;
		int H = 657;
		assertEquals(1095, new ProblemSetsEasy().maxSets(E, EM, M, MH, H));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int E = 1;
		int EM = 2;
		int M = 3;
		int MH = 4;
		int H = 5;
		assertEquals(3, new ProblemSetsEasy().maxSets(E, EM, M, MH, H));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int E = 100000;
		int EM = 100000;
		int M = 100000;
		int MH = 100000;
		int H = 100000;
		assertEquals(166666, new ProblemSetsEasy().maxSets(E, EM, M, MH, H));
	}
}
