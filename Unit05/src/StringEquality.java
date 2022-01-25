//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Emma Cao
//Date - 1/24/22
//Class - P. 1
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
		setWords("x", "y");
	}

	public StringEquality(String one, String two)
	{
		setWords(one, two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkEquality( )
	{
		if (wordOne.equals(wordTwo)) {
			return true;
		}
		return false;
	}

	public String toString()
	{
		if (checkEquality() == false) {
			return wordOne + " does not have the same letters as " + wordTwo + "\n";
		}
	return wordOne + " has the same letters as " + wordTwo + "\n";
	}
}