/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int netBill(int N, int k){
        float eachCost=N/(k+1);
        int i=(int)Math.floor(eachCost);
        int netCost=N-(i*k);
        return netCost;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int N=1, k=4;
		int ans=netBill(N,k);
		System.out.print(ans);
	}
}
