//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
		
	}

	public void sort()
	{

		String[] sorted = new String[wordRay.length];
		
		for (int i = 0; i < wordRay.length; i++) {
			String min = wordRay[i];
			int minIndex = 0;
			for (int j = i; j < wordRay.length; j++ ) {
				if (wordRay[j].compareTo(min) < 0) {
					min = wordRay[j];
					minIndex = j;
				}
			}

			sorted[i] = min;
			wordRay[minIndex] = wordRay[i];

		}
		
		for (int k = 0; k < sorted.length; k++) {
			wordRay[k] = sorted[k];
		}
		
	}

	public String toString()
	{
		String output = Arrays.toString(wordRay);
		
		return output+"\n\n";
	}
}