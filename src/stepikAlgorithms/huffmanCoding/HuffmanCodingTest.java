package stepikAlgorithms.huffmanCoding;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class HuffmanCodingTest {
	private HuffmanCoding hc;
	private Random rand;

	@Before
	public void setUp() throws Exception {
		hc = new HuffmanCoding();
		rand = new Random();
	}

	@Test
	public void encode() {
		// Given
		String sourceString = "aabcccada";
		String expectedStr = "0010011111101010";

		// When
		String resultStr = hc.encode(sourceString);

		// Then
		assertEquals(expectedStr, resultStr);
	}

	@Test
	public void encode2() {
		// Given
		String sourceString = "aaaaa";
		String expectedStr = "00000";

		// When
		String resultStr = hc.encode(sourceString);

		// Then
		assertEquals(expectedStr, resultStr);
	}

	@Test
	public void encode3() {
		// Given
		String sourceString = "aabb";
		String expectedStr = "0011";

		// When
		String resultStr = hc.encode(sourceString);

		// Then
		assertEquals(expectedStr, resultStr);
	}

	@Test
	public void encode4() {
		// Given
		String sourceString = "accepted";
		String expectedStr = "11110100011001100010";

		// When
		String resultStr = hc.encode(sourceString);

		// Then
		assertEquals(expectedStr, resultStr);
	}

	@Test
	public void encode5() {
		// Given
		String sourceString = "a";
		String expectedStr = "0";

		// When
		String resultStr = hc.encode(sourceString);

		// Then
		assertEquals(expectedStr, resultStr);
	}

	@Test(timeout = 100)
	public void encode6() {
		// Given
		StringBuilder sourceString = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			char letter = (char) ('a' + rand.nextInt(26));
			sourceString.append(letter);
		}

		// When // Then
		hc.encode(sourceString.toString());
	}
}
