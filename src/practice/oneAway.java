package practice;
/*
 * Checks to see if two given strings are one character
 * edit away from being the same
 * 
 */
public class oneAway {
	
	//This solution fails to account for reordered strings of the same chars
	public static boolean isOneAway(String one, String two) {
		if(one.equals(two))
			return true;
		
		char[] str1 = one.toCharArray();
		char[] str2 = two.toCharArray();
		
		if(java.lang.Math.abs(str1.length - str2.length) > 1) {
			return false;
		}else {
			int[] int1 = new int[128];
			int[] int2 = new int[128];
			for(int i=0; i<str1.length; i++) {
				int1[str1[i]]++;
			}
			for(int i=0; i<str2.length; i++) {
				int2[str2[i]]++;
			}
			int diff = 0;
			for(int i=0; i<128; i++) {
				diff += java.lang.Math.abs(int1[i]-int2[i]);
				if(diff>1)
					return false;
			}
		}
		return true;
	}
	
	// Working solution from book
	/*
	 * Lesson learned: Use while loops for the uneven search through two strings
	 * 
	 */
	public static boolean isOneAway2(String first, String second) {
		if(first.length() == second.length()) {
			return oneEditReplace(first, second);
		}else if(first.length()+1 == second.length()) {
			return oneEditInsert(first, second);
		}else if(first.length()-1 == second.length()) {
			return oneEditInsert(second, first);
		}
		return false;
	}
	
	public static boolean oneEditReplace(String s1, String s2) {
		boolean foundDifference = false;
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				if(foundDifference)
					return false;
				foundDifference = true;
			}
		}
		return true;
	}
	
	public static boolean oneEditInsert(String s1, String s2) {
		int index1 = 0;
		int index2 = 0;
		while (index2<s2.length() && index1<s1.length()) {
			if(s1.charAt(index1) != s2.charAt(index2)) {
				if(index1 != index2)
					return false;
				index2++;
			}else {
				index1++;
				index2++;
			}
		}
		return true;
	}
	
}
