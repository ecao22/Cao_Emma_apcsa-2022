//(c) A+ Computer Science
//www.apluscompsci.com
//Name Emma Cao

import static java.lang.System.*;

public class CountPairs
{
	
	public static int pairCounter( String str )
	{ 
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i == 1 && str.charAt(i) == str.charAt(i - 1)) {
				count = count + 1;
			}
			if (i > 1 && str.charAt(i) == str.charAt(i - 1)) {
				count = count + 1;
			}
		}
		return count;
		
	}
}