//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] ray = new int[size];
		for (int i = 0; i < size; i++) {
			ray[i] = (int)(Math.random()*10);
		}
		shiftEm(ray);
		return ray;
	}
	public static void shiftEm(int[] array)
	{
		int sevenPos = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 7) {
				int temp = array[sevenPos];
				array[sevenPos] = 7;
				array[i] = temp;
				sevenPos++;
			}
		}
	}
}