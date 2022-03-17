//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown


	private static int getNumDigits(int number)
	{
		int count = number%10;
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int length = (int) (Math.log10(number) + 1);
		int[] sorted = new int[length];
		for (int i = 0; i < length; i++) {
			sorted[i] = getNumDigits((int)(number/(Math.pow(10, i))));
		}
		

		for (int j = 0; j < length-1; j++) {
			int min = j;
			for (int k = j+1; k < length; k++) {
				if (sorted[k] < sorted[min]) {
					min = k;
				}
			}
			if (min != j) {
				int temp = sorted[min];
				sorted[min] = sorted[j];
				sorted[j] = temp;
			}
		}
		
		return sorted;
	}
}