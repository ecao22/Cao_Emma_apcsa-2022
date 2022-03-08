//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables	
	private String name1;
	private int size1;


	//add a constructor
	public Skeleton(String n, int s) {
		setMonster(n,s);
	}

	//add code to implement the Monster interface
	
	public void setMonster(String n, int s) {
		name1 = n;
		size1 = s;
	}
	
	public int getHowBig() {
		return size1;
	}
	
	public String getName() {
		return name1;
	}
	
	public boolean isBigger(Monster other)	{
		if (getHowBig() > other.getHowBig()) {
			return true;
		}
		return false;
	}
	
	public boolean isSmaller(Monster other) {
		if (getHowBig() < other.getHowBig()) {
			return true;
		}
		return false;
	}
	
	public boolean namesTheSame(Monster other) {
		if (getName().equals(other.getName())) {
			return true;
		}
		return false;
	}

	//add a toString
	
	public String toString() {
		String output = "Monster 1 - " + getName() + " " + getHowBig() + "\n";
		
		return output;

	}
}