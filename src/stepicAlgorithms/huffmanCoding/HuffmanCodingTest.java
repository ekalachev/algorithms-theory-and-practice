package stepicAlgorithms.huffmanCoding;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HuffmanCodingTest {
	private HuffmanCoding hc;

	@Before
	public void setUp() throws Exception {
		hc = new HuffmanCoding();
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
		String expectedStr = "10100000110011001111";
		
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
}
