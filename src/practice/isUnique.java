package practice;

import java.util.Scanner;

/* 
 * isUnique takes in a string from System.in and
 * determines if all characters are unique
 * 
 */
public class isUnique {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check: ");
		if(uniqueCheck(sc.nextLine())) {
			System.out.println("The string is unique");
		}else {
			System.out.println("The string is not unique");
		}
		sc.close();
		
	}
	
	public static boolean uniqueCheck(String str) {
		// There can't be unique chars if the string is larger than ascii table
		// assuming we aren't using extended ascii (256 chars)
		if(str.length() > 128)
			return false;
		// once char is converted to int it will represent 
		// an ascii character in the bool array
		boolean[] check = new boolean[128];
		for(int i=0; i<str.length(); i++) {
			int cur = str.charAt(i);
			if(check[cur])
					return false;
			check[cur] = true;
		}
		return true;
	}

}
