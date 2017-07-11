package practice;
/*
 * Replaces spaces in string (char array in this case) to %20
 * Assumes input string has buffer space at end for extra chars
 */
public class URLify {

	//given string and true length of string
	public static void space2url(char[] str, int trueLen) {
		//count spaces -- not needed in current implementation
		//since space buffer is given in str
		/*
		int spaceCount = 0;
		for(int i=0; i<trueLen; i++) {
			if(str[i]==(' '))
				spaceCount++;
		}
		*/
		//int index = trueLen + spaceCount*2;
		int index = str.length-1;
		for(int i=trueLen-1; i>=0; i--) {
			if(str[i]==' ') {
				str[index-2] = '%';
				str[index-1] = '2';
				str[index] = '0';
				index -= 3;
			}else {
				str[index] = str[i];
				index--;
			}
		}
		
	}
}
