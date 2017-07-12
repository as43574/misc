package ArraysAndStrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class palindromeTest {

	@Test
	public void testIsPalendrome() {
		assertTrue(palindrome.isPalendrome("abba"));
		assertTrue(palindrome.isPalendrome("absba"));
		assertTrue(palindrome.isPalendrome("ab ba"));
		assertTrue(palindrome.isPalendrome("bbb"));
		assertTrue(palindrome.isPalendrome("33332"));
		assertTrue(palindrome.isPalendrome(""));


		assertFalse(palindrome.isPalendrome("abbf"));
		assertFalse(palindrome.isPalendrome("abc"));
		assertFalse(palindrome.isPalendrome("12 3"));
		assertFalse(palindrome.isPalendrome("a b"));

	}

}
