//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Emma Cao

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("", 'x');
	}

	public LetterRemover(String s, char rem) {
		setRemover(s, rem);
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		
		/* if (cleaned.charAt(0) == lookFor) {
			cleaned = cleaned.substring(1, cleaned.length());
		}
		
		/* for (int i = 0; i < cleaned.length(); i++) {
			if (cleaned.charAt(i) == lookFor) {
				cleaned = cleaned.substring(0, i) + cleaned.substring(i+1);
				// cleaned = cleaned.substring(i+1);
			}
		else {
				cleaned = cleaned.substring(0);
			}
		} */
		
		int loc = cleaned.indexOf(lookFor);
		
		while (loc > -1) {
			cleaned = cleaned.substring(0,loc) + cleaned.substring(loc+1);
			loc = cleaned.indexOf(lookFor);
		}
		
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters() + "\n";
	}
}