//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   	String first = a.substring(0,1);
	   	String last = a.substring(a.length()-1, a.length());
	   	first = first.toUpperCase();
	   	last = last.toUpperCase();
	   
	   	if ( first.contains("A") || first.contains("E") || first.contains("I") || 
	   			first.contains("O") || first.contains("U") ) {
	   		return "yes";
	   	}
	   	else if ( last.contains("A") || last.contains("E") || last.contains("I") || 
	   			last.contains("O") || last.contains("U") ) {
	   		return "yes";
	   	}
		
	  return "no";
	}
}