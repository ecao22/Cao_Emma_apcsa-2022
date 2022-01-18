//� A+ Computer Science
//www.apluscompsci.com

//Name - Emma Cao
//Date - 1/15/22
//Class - P. 1
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public void printText()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	   out.println("********************");
   }

   public void printTwentyDashes()
   {
	   out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
	   out.println("\n\n");
   }
   
   public void printASmallBox()
   {
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
   }
 
   public void printABigBox()
   { 	
	   printASmallBox();
	   printASmallBox();
   }   
   
   public void printCheckers()
   {
	   out.println("o-o-o-o-o-o-o-o-o-o-");
	   out.println("-o-o-o-o-o-o-o-o-o-o");
   }
   public void printCheckerBox()
   {
	   out.println("Bonus pattern:");
	   printCheckers();
	   printCheckers();
	   printCheckers();
	   printCheckers();
   }
   public void printSmile()
   {
	   printTwentyDashes();
	   printTwentyDashes();
	   out.println("-------@----@-------");
	   printTwentyDashes();
	   out.println("---o------------o---");
	   out.println("----oo--------oo----");
	   out.println("------oo----oo------");
	   out.println("--------oooo--------");
	   printTwentyDashes();
	   printTwentyDashes();
   }
}
