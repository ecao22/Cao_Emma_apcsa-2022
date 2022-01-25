//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Emma Cao
//Date - 1/24/22
//Class - P.1
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;
	private boolean isEven;

	public StringOddOrEven()
	{
		setString("");
		isEven = false;
	}

	public StringOddOrEven(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
		if (word.length() % 2 == 1) {
			isEven = false;
			return false;
		}
		isEven = true;
		return true;
	}

 	public String toString()
 	{
 		String output = " is even.";
 		if (isEven == true) {
 	 		return word + output;
 		}
 		output = " is odd.";
 		return word + output;
 		
	}
}