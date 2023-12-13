/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{ public static int totalCost(int X, int Y ){
    int messCost=X*6;
    int restaurantCost=Y;
    int totalCost=messCost+restaurantCost;
    return totalCost;
}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int X=100, Y=500;
		int ans=totalCost(X,Y);
		System.out.println(ans);
	}
}
