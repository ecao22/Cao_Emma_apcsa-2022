//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Emma Cao
//Date - 1/24/22
//Class - P. 1
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality test = new StringEquality();
		
		test.setWords("hello", "goodbye");
		test.checkEquality();
		System.out.print(test);
		
		test.setWords("one", "two");
		test.checkEquality();
		System.out.print(test);
		
		test.setWords("three", "four");
		test.checkEquality();
		System.out.print(test);
		
		test.setWords("TCEA", "UIL");
		test.checkEquality();
		System.out.print(test);
		
		test.setWords("State", "Champions");
		test.checkEquality();
		System.out.print(test);
		
		test.setWords("ABC", "ABC");
		test.checkEquality();
		System.out.print(test);
		
		test.setWords("ABC", "CBA");
		test.checkEquality();
		System.out.print(test);
		
		test.setWords("Same", "Same");
		test.checkEquality();
		System.out.print(test);
		
	}
}