//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Emma Cao
//Date - 1/20/22
//Class - P. 1
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;


public class Discount
{
	//instance variables and constructors could be used, but are not really needed
	private double customerBill;
	
	
	public void setDiscount(double bill) {
		customerBill = bill;
	}

	
	
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	public static double getDiscountedBill(double bill)
	{
		if (bill > 2000.0) {
			return bill*0.85;
		}
		else {
			return bill;
		}
	}
	
	public String toString() {
		if (customerBill > 2000.0) {
			return "" + customerBill*0.85;
		}
	return "" + customerBill;
	}

}