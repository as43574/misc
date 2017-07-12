package ArraysAndStrings;
/*
 * Checks if input string is a permutation of a palindrome
 * 
 */
public class palindrome {
	
	public static boolean isPalendrome(String str) {
		str = str.replaceAll(" ", "");
		char[] ch = str.toCharArray();
		java.util.Arrays.sort(ch);
		boolean result = false;
		if(ch.length %2 == 0) {
			result = isEvenPalendrome(ch);
		}else {
			result = isOddPalendrome(ch);
		}
		
		return result;
	}
	
	// checks if there are an even number of each character, if length of str is even
	public static boolean isEvenPalendrome(char[] ch) {
		if(ch.length==0)
			return true;
		
		int tmp = 1;
		char c = ch[0];
		for(int i=1; i<ch.length; i++) {
			char prev = c;
			c = ch[i];
			if(prev == c) {
				tmp++;
			}else {
				if(tmp%2 == 1)
					return false;
				tmp=1;
			}
			
		}
		return true;
	}
	
	// checks if there are an even number of each character and one of one char,
	// if length of str is odd
		public static boolean isOddPalendrome(char[] ch) {
			if(ch.length==1)
				return true;
			
			int tmp = 1;
			int charsAlone = 0;
			char c = ch[0];
			for(int i=1; i<ch.length; i++) {
				char prev = c;
				c = ch[i];
				if(prev == c) {
					tmp++;
				}else {
					if(tmp%2 == 1) {
						charsAlone++;
						if(charsAlone>1)
							return false;
					}
					tmp=1;
				}
				
			}
			return true;
		}
}
