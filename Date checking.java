// The "AFDgeena" class.
import java.awt.*;
import hsa.Console;

public class AFDgeena
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	c.print ("Enter the month of the date that you would like to determine whether it is before or after Feburary 18 (use 2 instead of Feburary):");
	int month;
	month = c.readInt();
	c.print ("Enter the day of the date that you would like to determine whether it is before or after Feburary 18 :");
	int day;
	day = c.readInt ();
	if (month < 2)
	{
	    System.out.println("It is before Feburary 18.");
	    
	}else 
	{
	    if (month ==2)
	    {
		if (day < 18)
		{
		    System.out.println("It is before Feburary 18.");
		}else
		{
		    if (day > 18)
		    {
			System.out.println("It is after Feburary 18.");
		    }else
		    {
			System.out.println("It is on the same day.");
		    }
		}
	    }else
	    {
		System.out.println("It is after Feburary 18.");
	    }
	}
	
	
   
	
	// Place your program here.  'c' is the output console
    } // main method
} // AFDgeena class
