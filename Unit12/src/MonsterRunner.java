//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.println("Enter 1st monster's name : ");
		String name1 = keyboard.next();
		System.out.println("Enter 1st monster's size : ");
		int size1 = keyboard.nextInt();
		
		//instantiate monster one
		Skeleton mon1 = new Skeleton (name1, size1);
		
		//ask for name and size
		System.out.println("Enter 2nd monster's name : ");
		String name2 = keyboard.next();
		System.out.println("Enter 2nd monster's size : ");
		int size2 = keyboard.nextInt();
		
		//instantiate monster two
		Skeleton mon2 = new Skeleton (name2, size2);
		
		mon1.isBigger(mon2);
		mon1.namesTheSame(mon2);
		System.out.println("Monster 1 - " + mon1.getName() + " " + mon1.getHowBig());
		System.out.println("Monster 2 - " + mon2.getName() + " " + mon2.getHowBig());
		if (mon1.isBigger(mon2)) {
			System.out.println("Monster one is bigger than Monster two");
		}
		else {
			System.out.println("Monster one is smaller than Monster two");
		}
		if (mon1.namesTheSame(mon2)) {
			System.out.println("Monster one has the same name as Monster two");
		}
		else {
			System.out.println("Monster one does not have the same name as Monster two");
		}
		
		
		
	}
}