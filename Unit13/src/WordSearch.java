//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	int pos = 0;
    	m = new String[size][size];
    	for (int i = 0; i < size; i++) {
    		for (int j = 0; j < size; j++) {
    			m[i][j] = str.substring(pos, pos+1);
    			pos++;
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	for (int r = 0; r < m.length; r++ ) {
    		for (int c = 0; c < m[r].length; c++) {
    			if (checkRight(word, r, c) || checkLeft(word, r, c) || checkUp(word, r, c) ||
    					checkDown(word, r, c) || checkDiagUpRight(word, r, c) || 
    					checkDiagUpLeft(word, r, c) || checkDiagDownRight(word, r, c) || 
    					checkDiagDownLeft(word, r, c)) {
    				return true;
    			}
    		}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		if (c+w.length() > m[r].length) {
			return false;
		}
		
		int pos = 0;
		
		for (int i = c; i < c+w.length(); i++) {
			if (!(m[r][i].equals(w.charAt(pos) + ""))) {
				return false;
			}
			pos++;
		}
		
		return true;

	}

	public boolean checkLeft(String w, int r, int c)
	{
		if (c+w.length() > m[r].length) {
			return false;
		}
		
		int pos = w.length()-1;
		
		for (int i = c; i < c+w.length(); i++) {
			if (!(m[r][i].equals(w.charAt(pos) + ""))) {
				return false;
			}
			pos--;
		}
		return true;
	}

	public boolean checkUp(String w, int r, int c)
	{
		if (r+w.length() > m.length) {
			return false;
		}
		
		int pos = w.length()-1;
		
		for (int i = r; i < r+w.length(); i++) {
			if (!(m[i][c].equals(w.charAt(pos) + ""))) {
				return false;
			}
			pos--;
		}
		
		return true;
	}

	public boolean checkDown(String w, int r, int c)
   {
		if (r+w.length() > m.length) {
			return false;
		}
		
		int pos = 0;
		
		for (int i = r; i < r+w.length(); i++) {
			if (!(m[i][c].equals(w.charAt(pos) + ""))) {
				return false;
			}
			pos++;
		}
	    return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		if (r-w.length() < 0 || c+w.length() > m[r].length) {
			return false;
		}
		
		int pos = 0;
		int j = r;
		
		for (int i = c; i < c+w.length(); i++) {
			if (!(m[j][i].equals(w.charAt(pos) + ""))) {
				return false;
			}
			pos++;
			j--;
		}
		
		
		return true; 
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		if (r-w.length() < 0 || c-w.length() < 0) {
			return false;
		}
		
		int pos = 0;
		int j = r;
		
		for (int i = c; i > c-w.length(); i--) {
			if (!(m[j][i].equals(w.charAt(pos) + ""))) {
				return false;
			}
			pos++;
			j--;
		}
		
		return true;

	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		
		if (r-w.length() < 0 || c-w.length() < 0) {
			return false;
		}
		
		int pos = 0;
		int j = r;
		
		for (int i = c; i > c-w.length(); i--) {
			if (!(m[j][i].equals(w.charAt(pos) + ""))) {
				return false;
			}
			pos++;
			j--;
		}
		
		return true;
		
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		if (r-w.length() < 0 || c-w.length() < 0) {
			return false;
		}
		
		int pos = 0;
		int j = r;
		
		for (int i = c; i > c-w.length(); i--) {
			if (!(m[j][i].equals(w.charAt(pos) + ""))) {
				return false;
			}
			pos++;
			j--;
		}
		
		return true;
	}

    public String toString()
    {
    	String output = "";
    	for (int i = 0; i < m.length; i++) {
    		for (int j = 0; j < m[i].length; j++) {
    			output += m[i][j] + " ";
    		} 
    		output += "\n";
    	}
    	
    	return output;
    }
}
