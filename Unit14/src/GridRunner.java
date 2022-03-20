//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		Grid x = new Grid(7,7, new String[] {"a", "b", "c", "7", "9", "x", "2"});
		System.out.println(x);
		System.out.println("a count is :: " + x.countVals("a"));
		System.out.println("b count is :: " + x.countVals("b"));
		System.out.println("c count is :: " + x.countVals("c"));
		System.out.println("7 count is :: " + x.countVals("7"));
		System.out.println("9 count is :: " + x.countVals("9"));
		System.out.println("x count is :: " + x.countVals("x"));
		System.out.println("2 count is :: " + x.countVals("2"));
		System.out.println(x.findMax(new String[] {"a", "b", "c", "7", "9", "x", "2"}));
		
		
	 }
}