//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Emma Cao
//Date - 1/24/22
//Class - P.1
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		System.out.print("Enter a word :: ");
		String wordInput = keyboard.next();
		
		StringOddOrEven test = new StringOddOrEven();
		test.setString(wordInput);
		test.isEven();
		System.out.print(test);
	}
}