//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys ) 
	{
		int nope = 0;
		for (int i = 0; i < toyList.size(); i++) {
			if (toyList.get(i).getName().equals(toys)) {
				 nope++;
			}
		}
		if (nope > 0) {
			for (int j = 0; j < toyList.size(); j++) {
				if (toyList.get(j).getName().equals(toys)) {
					 toyList.get(j).setCount(toyList.get(j).getCount()+1);
				}
			}
		}
		else {
		toyList.add(new Toy(toys)); 
		toyList.get(toyList.size()-1).setCount(1);
		}
	}
  
  	public Toy getThatToy( String nm ) 
  	{
  		for (int i = 0; i < toyList.size(); i++) { 
  			if (toyList.get(i).getName() == nm) { 
  				return toyList.get(i); 
  			}
  		}
  		return null; 
  	} 
  
  	public String getMostFrequentToy() 
  	{
  		Toy max = toyList.get(0);
  		for (int i = 1; i < toyList.size(); i++) {
  			if (toyList.get(i).getCount() > max.getCount()) {
  				max = toyList.get(i);
  			}
  		}
  		return max.getName();
  		
  	
  	}  
  
  	public void sortToysByCount()
  	{

  		Toy temp;
  		int orderNum = 0;
  		for (int i = 0; i < toyList.size()-1; i++) {

  				if (toyList.get(i).getCount() < toyList.get(i+1).getCount()) {
  					temp = toyList.get(i);
  					toyList.set(i, toyList.get(i+1));
  					toyList.set(i+1,  temp);
  					orderNum++;
  				}

  		}
  		
  	}  
  	  
	public String toString()
	{
		sortToysByCount();
	   return "sorted by count: " + toyList + "\nmax == " + getMostFrequentToy();
	}
}