//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		
		ToyStore test = new ToyStore();
		test.loadToys("sorry");
		test.loadToys("bat");
		test.loadToys("sorry");
		test.loadToys("sorry");
		test.loadToys("sorry");
		test.loadToys("train");
		test.loadToys("train");
		test.loadToys("teddy");
		test.loadToys("teddy");
		test.loadToys("ball");
		test.loadToys("ball");
		System.out.println(test);

		

	}
}