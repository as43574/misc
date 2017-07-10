package practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class isUniqueTest {

	@Test
	public void testUniqueCheck() {
		assertTrue(isUnique.uniqueCheck("abcdefg1234"));
		assertTrue(isUnique.uniqueCheck("1234567890,./ "));
		assertTrue(isUnique.uniqueCheck(" ,.mnbvcxz432"));
		
		assertFalse(isUnique.uniqueCheck("aabbcc"));
		assertFalse(isUnique.uniqueCheck("abcdefg12344"));
		assertFalse(isUnique.uniqueCheck("abcdefg123//"));
		assertFalse(isUnique.uniqueCheck("abcde  fg123"));

	}

}
