//� A+ Computer Science
//www.apluscompsci.com

//Name - Emma Cao
//Date - 1/15/22
//Class - P. 1
//Lab  -

import static java.lang.System.*;

public class StarsRunner
{
   public static void main(String args[])
   {
      //instantiate a StarsAndStripes object
	   StarsAndStripes painter = new StarsAndStripes();
	   
      //call the methods needed to make the patterns on the word document
	   painter.printText();
	   painter.printASmallBox();
	   painter.printTwoBlankLines();
	   painter.printABigBox();
	   painter.printTwoBlankLines();
	   painter.printCheckerBox();
	   painter.printTwoBlankLines();
	   painter.printSmile();
	  
   }
}