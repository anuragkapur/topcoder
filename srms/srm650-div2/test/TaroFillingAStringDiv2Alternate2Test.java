import org.junit.Test;
import static org.junit.Assert.*;

public class TaroFillingAStringDiv2Alternate2Test {
	
	@Test(timeout=2000)
	public void test0() {
		String S = "ABAA";
		assertEquals(1, new TaroFillingAStringDiv2Alternate2().getNumber(S));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String S = "??";
		assertEquals(0, new TaroFillingAStringDiv2Alternate2().getNumber(S));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String S = "A?A";
		assertEquals(0, new TaroFillingAStringDiv2Alternate2().getNumber(S));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String S = "A??B???AAB?A???A";
		assertEquals(3, new TaroFillingAStringDiv2Alternate2().getNumber(S));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String S = "?BB?BAAB???BAB?B?AAAA?ABBA????A?AAB?BBA?A?";
		assertEquals(10, new TaroFillingAStringDiv2Alternate2().getNumber(S));
	}

    @Test
    public void test5() {
        String S = "????";
        assertEquals(0, new TaroFillingAStringDiv2Alternate2().getNumber(S));
    }
}
