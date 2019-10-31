import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class numToWordTest {

	@Test
	public void test() {
		numberToWord n = new numberToWord();

		assertEquals(" ONE", n.numtoWord(1), "PASS");
		assertEquals(" TWENTY FIVE", n.numtoWord(25), "PASS");
		assertEquals(" FIFTY FIVE", n.numtoWord(56), "FAIL");
	}

}
