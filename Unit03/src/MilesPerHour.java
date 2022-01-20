//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Emma Cao
//Date - 1/19/22
//Class - P. 1
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist, hrs, mins);
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		mph = distance/(hours + (double)minutes/60);
	}

	public void print()
	{
		System.out.print("Print: " + distance + " miles in " + hours + " hours and " + minutes + ": " + Math.round(mph) + " MPH");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "Print with toString: " + distance + " miles in " + hours + " hours and " + minutes + ": " + Math.round(mph) + " MPH";
	}
}