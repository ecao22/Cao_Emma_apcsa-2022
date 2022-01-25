//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Emma Cao
//Date - 1/24/22
//Class - P. 1
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		WordsCompare test = new WordsCompare();
		test.setWords("abe", "ape");
		test.compare();
		System.out.print(test);
		
		test.setWords("giraffe", "gorilla");
		test.compare();
		System.out.print(test);
		
		test.setWords("one", "two");
		test.compare();
		System.out.print(test);
		
		test.setWords("fun", "funny");
		test.compare();
		System.out.print(test);
		
		test.setWords("123", "19");
		test.compare();
		System.out.print(test);
		
		test.setWords("193", "1910");
		test.compare();
		System.out.print(test);

		test.setWords("goofy", "godfather");
		test.compare();
		System.out.print(test);
		
		test.setWords("funnel", "fun");
		test.compare();
		System.out.print(test);
	}
}