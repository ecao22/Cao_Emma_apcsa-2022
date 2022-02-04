//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int oddNumLoc = -1;
		int evenNumLoc = -1;
		
		for (int i = 0; i < ray.length; i++) {
			if (ray[i] % 2 == 1){
				oddNumLoc = i;
				break;
			}
		}
		
		if (oddNumLoc > -1) {
			for (int j = oddNumLoc; j < ray.length; j++) {
				if (ray[j] % 2 == 0) {
					evenNumLoc = j;
					break;
				}
			}
		}
		
		if (evenNumLoc < 0) {
			return -1;
		}
		else {
			return evenNumLoc - oddNumLoc;

		}
		
	}
}