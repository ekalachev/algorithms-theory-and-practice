package stepikAlgorithms.huffmanDecoding;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

public class HuffmanDecodingTest {
	private Map <String, Character> dictionary;
	HuffmanDecoding hd;

	@Before
	public void setUp() throws Exception {
		hd = new HuffmanDecoding();
		
		dictionary = new HashMap<>();
		dictionary.put("0", 'a');
		dictionary.put("10", 'b');
		dictionary.put("110", 'c');
		dictionary.put("111", 'd');
	}

	@Test
	public void test() {
		// Given
		String encodedStr = "01001100100111";
		String expectedResult = "abacabad";
		
		// When
		String result = hd.decode(dictionary, encodedStr);
		
		// Then
		assertEquals(expectedResult, result);
	}

	@Test
	public void test2() {
		// Given
		String encodedStr = "0";
		String expectedResult = "a";
		
		// When
		String result = hd.decode(dictionary, encodedStr);
		
		// Then
		assertEquals(expectedResult, result);
	}
}
