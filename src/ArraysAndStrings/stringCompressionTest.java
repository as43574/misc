package ArraysAndStrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class stringCompressionTest {

	@Test
	public void testCompressString() {
		assertTrue(stringCompression.compressString("aaabbccaa").equals("a3b2c2a2"));
		assertTrue(stringCompression.compressString("abcd").equals("abcd"));
		assertTrue(stringCompression.compressString("aaabbbbccaab").equals("a3b4c2a2b1"));

	}

}
