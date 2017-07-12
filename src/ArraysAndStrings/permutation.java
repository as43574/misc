package ArraysAndStrings;

import java.util.Scanner;

/* 
 * Check if two strings are permutations of one another.
 * i.e. they have the same characters in different orders
 */
public class permutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String one = sc.nextLine();
		System.out.println("Enter another string: ");
		String two = sc.nextLine();
		if(isPermutation(one, two)) {
			System.out.println("The strings are a permutation");
		}else {
			System.out.println("The strings are not a permutation");
		}
		System.out.println("one: "+one+"\ntwo: "+two);
		sc.close();

	}
	
	public static boolean isPermutation(String one, String two){
		if(one.length() != two.length())
			return false;
		
		return sortChars(one).equals(sortChars(two));
	}
	public static String sortChars(String str) {
		char[] temp = str.toCharArray();
		java.util.Arrays.sort(temp);
		return new String(temp);
		
	}

}
