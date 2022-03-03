//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int num1;
	private int den1;
	

	//write two constructors
	public Rational() {
		setRational(1, 1);
	}
	
	public Rational(int n1, int d1) {
		setRational(n1, d1);
	}


	//write a setRational method
	public void setRational(int n1, int d1) {
		setNumDen(n1, d1);
	}
	

	//write  a set method for numerator and denominator
	public void setNumDen(int n1, int d1) {
		num1 = n1;
		den1 = d1;
	}

	
	public void add(Rational other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		int temp1 = num1;
		int temp2 = den1;
		
		num1 = (temp1*other.getDen() + other.getNum()*temp2);
		den1 = (temp2*other.getDen());
		
		
		reduce();

	}

	private void reduce()
	{
		int temp1 = num1;
		int temp2 = den1;
		num1 = num1/gcd(temp1, temp2);
		den1 = den1/gcd(temp1, temp2);

	}

	private int gcd(int numOne, int numTwo)
	{
		int min;
		int gcd=1;
		if (numOne < numTwo) {
			min = numOne;
		}
		else {
			min = numTwo;
		}
					
		for (int i = 1; i < min+1; i++) {
			if (numOne%i == 0 && numTwo%i == 0) {
				gcd = i;
			}
		}

		return gcd;
	}

	public Object clone ()
	{
		Rational r = new Rational();
		r.setNumDen(num1, den1);
		return r;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNum() {
		return num1;
	}
	
	public int getDen() {
		return den1;
	}
	
	
	public boolean equals( Object obj)
	{
		reduce();
		((Rational)obj).reduce();
		if (num1 == ((Rational) obj).getNum() && den1 == ((Rational)obj).getDen()) {
			return true;
		}

		return false;
	}

	public int compareTo(Rational other)
	{
	
		if (((double)num1/den1) > ((double)other.getNum()/other.getDen())) {
			return 1;
		}
		else if (((double)num1/den1) < ((double)other.getNum()/other.getDen())) {
			return -1;
		}
		else {
			return 0;
		}
		
		
	}

	public String toString() {
		return num1+"/"+den1;
	}

	
	//write  toString() method
	
	
}