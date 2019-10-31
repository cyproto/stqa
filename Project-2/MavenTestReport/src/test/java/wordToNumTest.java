import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class wordToNumTest {

	@Test
	void Test() {
		wordToNumber w = new wordToNumber();
		assertEquals(52, w.wordToNum("fifty two"));
		assertEquals(50103034, w.wordToNum("fifty million one hundred three thousand and thirty four"));
		assertEquals(999, w.wordToNum("nine hundred and ninety nine"));
		assertEquals(42, w.wordToNum("one"));
	}

}
