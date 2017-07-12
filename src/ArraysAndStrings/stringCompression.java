package ArraysAndStrings;
/*
 * Converts a string to compressed string of type:
 * aaabbcccaa = a3b2c3a2
 * 
 */
public class stringCompression {

	public static String compressString(String str) {
		String result = "";
		String copy = str.toLowerCase();
		char current = copy.charAt(0);
		int count = 1;
		for(int i=1; i<copy.length(); i++) {
			if(copy.charAt(i) == current) {
				count++;
			}else {
				result = result + current + count;
				current = copy.charAt(i);
				count = 1;
			}
			if(i==copy.length()-1)
				result = result + current + count;
		}
		if(str.length() <= result.length())
			return str;
		return result;
	}
}
