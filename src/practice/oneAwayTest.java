package practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class oneAwayTest {

	/*@Test
	public void testIsOneAway() {
		assertTrue(oneAway.isOneAway("yes", "yes"));
		assertTrue(oneAway.isOneAway("absolute", "absolut"));
		assertTrue(oneAway.isOneAway("abcdef", "abcef"));
		
		assertFalse(oneAway.isOneAway("no", "no way"));
		assertFalse(oneAway.isOneAway("1234", "12"));
		assertFalse(oneAway.isOneAway("1234", "4321"));//fails
		
	}*/
	
	@Test
	public void testIsOneAway2() {
		assertTrue(oneAway.isOneAway2("yes", "yes"));
		assertTrue(oneAway.isOneAway2("absolute", "absolut"));
		assertTrue(oneAway.isOneAway2("abcdef", "abcef"));
		
		assertFalse(oneAway.isOneAway2("no", "no way"));
		assertFalse(oneAway.isOneAway2("1234", "12"));
		assertFalse(oneAway.isOneAway2("1234", "4321"));

		
	}
}
