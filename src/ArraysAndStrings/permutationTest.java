package ArraysAndStrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class permutationTest {

	@Test
	public void testIsPermutation() {
		assertTrue(permutation.isPermutation("dog","god"));
		assertTrue(permutation.isPermutation("abcd123","dcba321"));
		assertTrue(permutation.isPermutation("test case","case test"));

		assertFalse(permutation.isPermutation("failing", "badly"));
		assertFalse(permutation.isPermutation("abcd", "efg"));
		assertFalse(permutation.isPermutation("4321", "asdf"));

	}

	@Test
	public void testSortChars() {
		assertTrue(permutation.sortChars("abcde").equals("abcde"));
		assertTrue(permutation.sortChars("edcba").equals("abcde"));
		assertTrue(permutation.sortChars("4321").equals("1234"));

		assertFalse(permutation.sortChars("abcde").equals("edcba"));
		assertFalse(permutation.sortChars("1234").equals("4321"));

	}

}
