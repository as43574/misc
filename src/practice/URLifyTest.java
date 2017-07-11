package practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class URLifyTest {

	@Test
	public void testSpace2url() {
		// test 1
		char[] test = "this is a test      ".toCharArray();
		char[] testURL = "this%20is%20a%20test".toCharArray();
		URLify.space2url(test, 14);
		String str = new String(test);
		String url = new String(testURL);
		assertTrue(str.equals(url));

		// test 2
		char[] test2 = "a test  ".toCharArray();
		char[] testURL2 = "a%20test".toCharArray();
		URLify.space2url(test2, 6);
		String str2 = new String(test2);
		String url2 = new String(testURL2);
		assertTrue(str2.equals(url2));

		// test 3
		char[] test3 = "noSpacesAtAll".toCharArray();
		char[] testURL3 = "noSpacesAtAll".toCharArray();
		URLify.space2url(test3, 13);
		String str3 = new String(test3);
		String url3 = new String(testURL3);
		assertTrue(str3.equals(url3));
	}


}
