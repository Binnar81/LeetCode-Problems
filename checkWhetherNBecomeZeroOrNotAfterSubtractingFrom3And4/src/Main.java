import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of tests");
        int T=sc.nextInt();
        for(int i=1;i<=T;i++) {
            System.out.println("Enter your" +i+ "test case Nth number");
            int N=sc.nextInt();
            int result = N;
            if (result >= 3) {
                result -= 3;
            }
            if (result >= 4) {
                result -= 4;
            }
            if (result == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    }

