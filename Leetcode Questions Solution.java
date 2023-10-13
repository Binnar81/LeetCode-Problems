








/*

//Array assigning program

 import java.io.*;
public class Main {
    public static void main(String[] args) {
        int[] arr;
        arr= new int[5];
        arr[0]=2;
        arr[1]=4;
        arr[2]=6;
        arr[3]=8;
        arr[4]=10;
        for(int i=0;i<=arr.length;i++){
            System.out.println("Element at index"+i+"="+arr[i]);
        }

    }
}


class Student{
    public int roll_no;
    public String name;
    Student(int roll_no,String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
    class Main{
        public static void main(String [] args){
            Student[] arr;
            arr= new Student[5];
            arr[0]=new Student(0,"Sanjay");
            arr[1]=new Student(1,"Rahul");
            arr[2]=new Student(2,"Virat");
            arr[3]=new Student(3,"Anderson");
            arr[4]=new Student(4,"Smith");
            for(int i=0;i<=arr.length;i++){
                System.out.println("Element at"+i+":"+arr[i].roll_no+ " "+arr[i].name);
            }

        }

    }
}

//Printing 2D array

  import java.io.*;
class Main{
    public static void main(String[] args){
        int pattern[][]={{1,5,6},{3,4,5},{2,3,1}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                System.out.print(pattern[i][j] + " ");
                System.out.println();
            }
        }
    }

//sum of array program

 import java.io.*;
class Main{
    public static void main(String[] args) {
        int number[] = {1, 6, 9, 7, 8, 14};
        sum(number);
    }
    public static void sum(int[] number){
        int sum=0;
        for(int i=0;i< number.length;i++)
            sum+=number[i];
        System.out.println("sum of the array numbers=" +sum);


    }
}




//Print pattern by taking user input

import java.io.*;
import java.util.Scanner;
class Main{
    public static void main(String []args){
        int n,m;
        Scanner src= new Scanner(System.in);
        System.out.println("enter number of rows to print for * pattern");
        n= src.nextInt();
        System.out.println("enter number of coloumn to print for * pattern");
        m= src.nextInt();
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}



//Print Rectangle using * pattern

 import java.io.*;
import java.util.Scanner;
class Main{
    public static void main(String [] args){
        int a=4,b=8;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                if(i==1||j==1||i==a||j==b){
                    System.out.print("*");
                    } else {
                    System.out.print(" ");
                }
                }
            System.out.println();
            }
        }
    }

//print half pyramid by using * pattern

 import java.io.*;
class Main{public static void main(String [] args){
    int n=1;
    for(int i=5;i>=n;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");

        }
        System.out.println();
    }

}}

//Print "E" in the Pattern format

 import java.io.*;
class Main{
    public static void main(String[] args){
        int n=7;
        //outer loop for ->number of rows
        for( int i=0;i<n;i++){
            //inner loop for ->number of coloumns
            for(int j=0;j<n-4;j++){
                if(i==0||j==0||i==n-4||j==n-4||i==n-1||j==n-1){
                    System.out.print("*");}

                    else{
                    System.out.print(" ");}

                }

            System.out.println();
            }


        }
    }

//Print Square Hollow Pattern
 import java.io.*;
class Main{
    public static void main(String[] args){
        int n=6;
        //outer loop for number of rows
        for(int i=0;i<n;i++){
            //inner loop for number of coloumns
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print("*");}
                else {
                    System.out.print(" ");
                }

                }
            System.out.println();
            }
        }

    }



//print incrementing numbers in array format

import java.util.Arrays;
class Main{
    public static void main(String []args){
        int value=1,column=4,row=4;
        int[][] array=new int[row][column];
        for(int i=0;i<row;i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = value;
                value++;
            }
        }
        System.out.println("2D array is:");
        for(int i=0;i<row;i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(array[i][j] + " ");


        }
        System.out.println();

            }
        }

    }


//print array with index number

 import java.util.Arrays;
class Main{public static void main(String[] args){
    int[][] array={{1,2},{3,1}};
    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            System.out.println("array["+i+"]["+j+"]"  +array[i][j]);

        }
    }
}}


//print array by taking user input
 import java.util.Arrays;
import java.util.Scanner;
class Main{
    public static void main(String [] args){

        Scanner scan=new Scanner(System.in);
        System.out.println("enter number of rows:");
        int row=scan.nextInt();
        System.out.println("enter number of columns:");
        int column=scan.nextInt();
        int[][] array=new int[row][column];
        for(int i=0;i<row;i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = (i + 2) * (j + 2);
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
            }
scan.close();


        }


    }


//print final array
import java.util.Arrays;
class Main{
    public static void main(String [] args){
        final int[][] arr ={{1,2,3},{5,8,7}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=arr[i][j]*10;
                System.out.print(arr[i][j]+ " ");
            }
        }
        System.out.println();

    }
}

//This code is a example of polymorphism(overloading method)
public class Sum{
    public int sum(int x, int y){
        return (x+y);}
    public int sum(int x, int y, int z){
        return (x+y+z);}
    public double sum(double x, double y) {
        return (x + y);
    }
    public static void main(String [] args){
        Sum s =new Sum();
        System.out.println(s.sum(10,40));
        System.out.println(s.sum(20, 30); */
//Pattern Questions on 1234 pattern
/* import java.io.*;
class Sum{
    public static void main(String[] args){
        //outer loop for-->number of rows
        for(int i=1;i<=5;i++){
            //inner loop for-->relation between rows & column
            for(int j=1;j<=i;j++){
                System.out.print(j);}
            System.out.println();
            }

        }
    } */

/* pattern Question on
1
22
333
4444
55555
 */
/*
import java.io.*;
class Sum{
    public static void main(String[] args){
        //outer for loop for-->number of rows
        for(int i=1;i<=5;i++){
            //inner for loop for-->relation between rows and column
            for(int j=1;j<=i;j++){
                System.out.print(i);}
            System.out.println();
                }

            }
        } */

/*
Pattern Questions no:3
*****
****
***
**
*
 */

/*
import java.io.*;
class Sum{
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");}
            System.out.println();
            }
        }
    }
*/


/*
12345
1234
123
12
1
 */
/* import java.io.*;
class Sum{
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<n;i++){
            for(int j=n;j>i;j--){
                int k=n-j+1;
                System.out.print(k);}
            System.out.println();
            }
        }
    }


*/

/* pattern Question no:07
           *
          ***
         *****
        *******
       *********
 */
/*
import java.io.*;
class Sum {
    static void Pattern(int N) {
        //outer loop for -->number of rows: N
        for (int i = 0; i < N; i++) {
            //inner for loop-->for  spaces
            for (int j = 0; j < N - i + 1; j++) {
                System.out.print(" ");
            }
            //inner for loop---> for star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            //inner for loop---> for spaces
            for (int j = 0; j < N - i + 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

        public static void main(String []args){
        int N=7;
        Pattern(N);

            }

        }  */

/*  pattern No:08
           *********
            *******
             *****
              ***
               *
 */
/*
import java.io.*;
class Sum {
    public static void main(String[] args) {
        int N = 5;
        //outer for loop ---> for number of rows
        for (int i = 0; i < N; i++) {
            //inner loop --> for number of spaces
            for (int j = 0; j<i; j++) {
                System.out.print(" ");
            }
            //inner loop--> for number of stars
            for (int j = 0; j <2*N-(2*i+1); j++) {
                System.out.print("*");
            }
            //outer loop --> for number of spaces
            for (int j = 0; j<i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
} */

/* pattern question No:09 (Diamond Pattern)
                   *
                  ***
                 *****
                *******
               *********
               *********
                *******
                 *****
                  ***
                   *
 */

/*
import java.io.*;
class Sum {
    static void normal_triangle(int N) {
        //outer loop for normal triangle shape
        for (int i = 0; i < N; i++) {
            //inner loop for spaces(normal triangle shape)
            for (int j = 0; j < N - (i + 1); j++) {
                System.out.print(" ");
            }
            //inner loop for star(normal triangle shape)
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            //inner loop for spaces(normal triangle shape)
            for (int j = 0; j < N - (i + 1); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void reverse_triangle(int N) {
        //outer loop for reverse triangle
        for (int i = 0; i < N; i++) {

            //inner loop for spaces(reverse triangle)
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //inner loop for star(reverse triangle)
            for (int j = 0; j < 2 * N - (2 * i + 1); j++) {
                System.out.print("*");
            }
            //inner loop for spaces(reverse triangle)
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }
    }

        public static void main (String []args){
            int N = 9;
            normal_triangle(N);
            reverse_triangle(N);
        }
    }
*/

/* Half Diamond star Pattern(Q.No:10)
                 *
                 **
                 ***
                 ****
                 *****
                 ****
                 ***
                 **
                 *
 */
/*
import java.io.*;
class Sum {
    static void half_normal_diamond(int N) {
        //outer loop for half diamond normal
        for (int i = 0; i <N; i++) {
            //inner loop for star(half diamond normal shape)
            for (int j = 0; j < N-(4-i); j++) {
                System.out.print("*");
            }
            //inner loop for spaces(half diamond normal shape)
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void half_reverse_diamond(int N) {
        //outer loop for half reverse diamond
        for (int i = 0; i < N - 1; i++) {
            //inner loop for star(half reverse diamond)
            for (int j = 0; j < N - (i + 1); j++) {
                System.out.print("*");
            }
            //inner loop for spaces(half reverse diamond)
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        half_normal_diamond(N);
        half_reverse_diamond(N);
    }
} */
/*   pattern question No:11
        1
        01
        101
        0101
        10101
 */
/*
import java.io.*;
class Sum{
    static void Pattern11(int N) {
        //declare start row number
        int start = 1;
        //outer loop for the number of rows
        for (int i = 0; i < N; i++) {
            //declared that when remainder is 0 then print 1 and else 0
            if (i % 2 == 0) start = 1;
            else start = 0;
            //inner loop for printing binary number alternatively
            for (int j = 0; j <=i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            for (int j = 0; j < N - (i + 1); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int N=5;
        Pattern11(N);
            }

        } */

/* Pattern Question No:12
          1      1
          12    21
          123  321
          12344321

 */
/*
import java.io.*;
class Sum{
    static void Pattern12(int N) {
        //outer loop for part1
        for (int i = 1; i <= N; i++) {
            //inner loop to print numbers in part1
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            //inner loop to print spaces
            for (int j = 1; j < 2*N - (2 * i); j++) {
                System.out.print(" ");
            }
            //inner loop to print part2 numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
    public static void main(String[] args){
    int N=4;
    Pattern12(N);
    }
} */


/* Pattern Question No:13
       1
       23
       456
       78910
       1112131415
 */

/*
import java.io.*;
class Sum{
    static void Pattern13(int N) {
        int num = 1;
        //outer loop for number of rows
        for (int i = 1; i <= N; i++) {
            //inner loop to print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num + 1;
            }
            //inner loop to print spaces
            for (int j = 1; j < N - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){

    int N=5;
    Pattern13(N);

            }
        }  */

/*  pattern Question No:14
     A
     AB
     ABC
     ABCD
     ABCDE
 */
/*
import java.io.*;
class Sum{
    static void Pattern14(int N) {
        //outer loop for number of rows
        for (int i = 1; i <= N; i++) {
            //inner loop to print alphabets
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
    public static void main(String[] args){
        int N=5;
        Pattern14(N);
            }
        } */

/* pattern Question No:15
    ABCDE
    ABCD
    ABC
    AB
    A
 */
/*
import java.io.*;
class Sum {
    static void Pattern15(int N) {
        //outer loop for number of rows
        for (int i = 1; i <= N; i++) {
            //inner loop to print alphabets
            for (char ch = 'A'; ch <= 'A' + (5 - i); ch++) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        Pattern15(N);
    }
} */


/* pattern Question No:16
    A
    BB
    CCC
    DDDD
    EEEEE
 */
/*
import java.io.*;
class Sum{
    static void Pattern16(int N) {
        //outer loop for number of rows
        for (int i = 0; i < N; i++) {
            char ch = 'A';
            //inner loop to print alphabets
            for (int j = 0; j <= i; j++) {
                System.out.print((char)((int)ch + i) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int N=5;
        Pattern16(N);
            }
        }  */

/* Pattern Question No:17
         A
        ABA
       ABCBA
      ABCDCBA
 */
/*
import java.io.*;
class Sum{
    static void Pattern17(int N) {
        //outer loop
        for (int i = 0; i < N; i++) {
            //inner loop for spaces

            for (int j=0;j<N-i-1;j++) {
                System.out.print(" ");}
            //inner loop for alphabets
            char ch='A';
            int breakpoint=(2*i+1)/2;
            for(int j=1;j<=2*i+1;j++) {
                System.out.print(ch);
                if (j <= breakpoint) ch++;
                else ch--;
            }
            //inner loop for spaces
            for(int j=0;j<N-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        int N=4;
        Pattern17(N);
            }
        }  */

/* Pattern Question No:18
       E
       DE
       CDE
       BCDE
       ABCDE
 */
/*
import java.io.*;
class Sum{
    static void Pattern18(int N){
        //outer loop for number of rows
        for(int i=0;i<N;i++){
            //inner loop to print alphabets
            for(char ch=(char)(int)('A'+N-i-1);ch<=(char)(int)('A'+(N-1));ch++) {
                System.out.print(ch+ " ");}

            System.out.println();
            }
        }
        public static void main(String[] args){
        int N=5;
        Pattern18(N);
        }
    }
*/


/*  Pattern Question No:19
        **********
        ****  ****
        ***    ***
        **      **
        *        *
        *        *
        **      **
        ***    ***
        ****  ****
        **********
 */
/*
import java.io.*;
class Sum{
    static void Pattern19_part1(int N) {
        //outer loop for number of rows in part1
        for (int i = 0; i < N; i++) {
            //inner loop to print stars in part1
            for (int j = 0; j < N - i; j++) {
                System.out.print("*");
            }
            //inner loop to print spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < N - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //outer loop for number of rows
        for(int i=1;i<=N;i++){
            //inner loop to print stars in part2
                for(int j=1;j<=i;j++){
                    System.out.print("*");}
                //inner loop to print spaces
                for(int j=1;j<=2*N-(2*i);j++){
                    System.out.print(" ");}
                //inner loop to print star in part2
                for(int j=1;j<=i;j++){
                    System.out.print("*");}
                System.out.println();
                }
            }

        public static void main(String[] args) {
        int N=5;
        Pattern19_part1(N);

        }
} */

/* pattern Question No: 20

               *        *
               **      **
               ***    ***
               ****  ****
               **********
               ****  ****
               ***    ***
               **      **
               *        *

 */
/*
import java.io.*;
class Sum{
    static void Pattern20(int N){
        //outer loop for number of rows in part1
        for(int i=1;i<=N;i++) {
            //inner loop to print star in part1
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            //inner loop to print spaces in part1
            for (int j = 0; j <= 8 - 2 * i; j++) {
                System.out.print(" ");
            }
            //inner loop to print stars in part1
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i == N) {
                //outer loop for number of rows in part2
                for (int k = 1; k < N; k++) {
                    //inner loop to print star in part2
                    for (int j = 1; j <= N - k; j++) {
                        System.out.print("*");
                    }
                    //inner loop to print spaces in part2
                    for (int j = 1; j <= 2 * k; j++) {
                        System.out.print(" ");
                    }
                    //inner loop to print star in part2
                    for (int j = 1; j <= N - k; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }}
            public static void main(String[] args){
        int N=5;
        Pattern20(N);

        }
}
*/

/* Pattern Question No:21
        ****
        *  *
        *  *
        ****

 */
/*
import java.io.*;
class Sum{
    static void Pattern21(int N) {
        //outer loop for number of rows
        for (int i = 0; i < N; i++) {
            //inner loop to print spaces and star
            for (int j = 0; j < N; j++) {
                if (i == 0 || j == 0 || i == N - 1 || j == N - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
        public static void main(String[] args){
        int N=4;
        Pattern21(N);
    }}  */

/* Pattern Question No:22

 */

/* import java.io.*;
class Sum{
    static void Pattern22(int N) {
        //outer loop for number of rows
        for (int i = 0; i < N * 2 - 1; i++) {
            //inner loop for number of columns
            for (int j = 0; j < N * 2 - 1; j++) {
                int top = i;
                int bottom = j;
                int right = 2 * N - 2 - j;
                int left = 2 * N - 2 - i;

                System.out.print(N - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int N=5;
        Pattern22(N);


            }

        } */


// Question No:01 to count the number of digits of the given number N (approach No:1)
/*
import java.io.*;
class Sum{
    static int CountDigit(int N) {
        int x = N, count = 0;
        while (x != 0) {
            x = x / 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        int N=456789;
        System.out.println("Number of digits in "+N+ " is:" +CountDigit(N) );
    }
}*/
//Question No:01 to count the number of digits of the given number N (approach No:2)
/*
import java.io.*;
class Sum{
    static int CountDigit(int N) {
        String digit = Integer.toString(N);
        return digit.length();
    }
    public static void main(String[] args){
        int N=34567;
        System.out.println("Number of digits in "+N+ " is:" +CountDigit(N) );;

    }}*/
//Question No:01 to count the number of digits of the given number N (approach No:3)

//import java.io.*;
//class Sum{
//    static int CountDigit(int N){
//    int digit=(int)Math.floor(Math.log10(N));
//    return digit;}
//    public static void main(String[] args){
//        int N=34567;
//        System.out.println("Number of digits in "+N+ " is:" +CountDigit(N) );;
//
//    }
//}



////Question No:02 to reverse the given numbers
////import java.io.*;
////class Sum{
////    static void Reverse_Number(int N) {
////        int reverse = 0;
////        int num = N;
////        while (N != 0) {
////            int digit = N % 10;
////            reverse = reverse * 10 + digit;
////            N = N / 10;
////        }
////        System.out.println("The reverse number of the given number " + N + " is:" + reverse);
////    }
////    public static void main(String[] args){
////        int N=4596;
////        Reverse_Number(N);
////
////        }
//    }

/*
//Write a program to check wheather the given number N is Palindrome or not
import java.io.*;
class Sum {static void Is_Palindrome(int N)
     {
        int num = N;
        int reverse = 0;
        while (N != 0) {
            int digit = N % 10;
            reverse = reverse * 10 + digit;
            N = N / 10;
        }
        System.out.println(reverse == num);
    }
    public static void main(String[] args){
    int N=21234;
    Is_Palindrome(N);
    }
}
*/


/*//write a program to find out GCD/HCF of the given number

import java.lang.Math;
class Sum{
    public static void main(String[] args){

    int a=14,b=12;
    int ans=1;
    for(int i=1;i<=Math.min(a,b);i++){

        if(a%i==0 && b%i==0){
            ans=i;
            }

        }
        System.out.print(ans);

    }
    }*/

/*
//Write a program to find out wheather a given number is armstrong number or not
import java.io.*;
class Sum {
    static Boolean armstrong_Number(int N) {
        int original_No = N;
        int temp = N;
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        int sumOfPower = 0;
        while (N != 0) {
            int digit = N % 10;
            sumOfPower += Math.pow(digit, count);
            N /= 10;
        }
        return(sumOfPower==original_No);

    }
    public static void main(String[] args){
        int N=153;
        if(armstrong_Number(N)){
                    System.out.print("The given number is a armstrong number");
                } else {
                    System.out.print("The given number is not a armstrong  number");
                }
            }
        }
*/

/*
import java.io.*;
class Sum{
    static Boolean armstrong_Number(int N) {
        int original_No = N;
        int temp = 0;
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        int sumOf_Power = 0;
        while (N != 0) {
            int digit = N % 10;
            sumOf_Power += Math.pow(digit, count);
            N /= 10;
        }
        return (sumOf_Power == original_No);
    }
    public static void main(String[] args){
        int N=152;
        if(armstrong_Number(N)) {
            System.out.print("The given number " + N + " is a armstrong Number");
        }
        else {
            System.out.print("The given number " + N + " is not a armstrong Number");
        }

        }
    }
*/

/*
//write a code to find out divisors of the given number
import java.io.*;
import java.lang.Math;
class Sum {
    static void sumOfDivisor(int N) {
        int i=1;
        int sum=i;
        for ( i = 1; i <= N; i++) {
            if (N % i == 0) {
                sum+=sum;
                System.out.print(i + " ");
                System.out.print("Sum of the divisors= " +sum+ " ");


            }
        }
    }

    public static void main(String [] args) {
        int N = 153;
        sumOfDivisor(N);
    }
}
*/

/*
//write a program to check wheather the given number is prime or not
import java.util.*;
import java.lang.Math;
class Sum{
    static Boolean Is_Prime(int N){
        for(int i=2;i<N;i++) {
            if (N % i == 0) {
                return false;}

        }return true;
    }
        public static void main(String [] args){
        int N=12;
       Boolean ans= Is_Prime(N);
       if(N!=1 && ans==true){
           System.out.print("The given number " +N+ " is a prime number");}
       else{
           System.out.print("The given number "+N+ " is not a prime number");
       }
    }
}
*/


/*
import java.io.*;
import java.lang.Math;
class Sum{
    static Boolean Is_prime(int N){
        for(int i=2;i<N;i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
            }
            public static void main(String[] args){
        int N=31;
        Boolean ans=Is_prime(N);
        if(N!=1 && ans==true){
            System.out.print("The given number " +N+ " is a prime number" );}
        else{
            System.out.print("The given number " +N+ " is not a prime number" );
        }
    }
        }


*/

/*
//Write a program to print the numbers till N in array format
import java.io.*;
import java.lang.Math;
class Sum{
    static int count=0;
    static void print_Number(int N){

        if(count==N+1)
            return;
        System.out.println(count);
        count=count+1;
        print_Number(N);}
    public static void main(String [] args){
        int N=12;
        print_Number(N);

        }

    }
*/


/*
//Write a program to print particular name N times
import java.io.*;
import java.lang.Math;
class Sum {
    static String name = "Java";

    static void Print_Name(int i, int N) {
        if (i > N) return;
        System.out.println(name);
        Print_Name(i + 1, N);
    }

    public static void main(String[] args) {
        int N = 12;
        Print_Name(1, N);
    }
}
*/

/*
//Write a program to print a number from 1 to N
import java.io.*;
import java.lang.Math;
class Sum{
    static int count=0;
    static void Number(int N, int count){
        if(count>N)return;
            System.out.println(count);
        Number(N,count+1);}
    public static void main(String[] args){
        int N=12;
        Number(N, 1);

    }
}
*/

/*//write a program to print the numbers from N to 1
import java.io.*;
import java.util.*;
class Sum{
    static int reverse=1;
    static void N_to_1(int N,int reverse){
        if(N<reverse)return;
        System.out.println(N);
        N_to_1(N-1,reverse);}
    public static void main(String [] args){
        int N=12;
        N_to_1(N ,reverse);
    }
}*/


/*
//Write a program to print sum of first N numbers
import java.io.*;
class Sum{
    static void Sum_Of_FirstN(int N,int sum) {
        if (N < 1) {
            System.out.println(sum);
            return;
        }
        Sum_Of_FirstN(N - 1, sum + N);
    }
    public static void main(String[] args){
        int N=3;
        Sum_Of_FirstN(N,0);
        }
    }
*/


/*//write a program to print the factorial of the given number
import java.io.*;
class Sum{
    static void Factorial(int N,int fact){
        if(N<1) {
            System.out.println(fact);
            return;
        }
        Factorial(N-1,fact*N);}
    public static void main(String[] args){
        int N=6;
        Factorial(N,1);
        }
    }*/

/*//Write a program to find out factorial of the given number by using for loop
import java.io.*;
class Sum {
    static int Factorial(int N) {
        int ans = 1;
        for (int i = 1; i <=N; i++) {
            ans = ans * i;
        }return ans;

    }
    public static void main(String[] args){
        int N=3;
        int result=Factorial(N);
        System.out.println(result);
        }
    }*/
/*
//Write a program to reverse array
import java.io.*;
import java.lang.Math;
class Sum {
    static void Print_Array(int ans[], int N) {
        System.out.print("The reversed array of the given array is:");
        for(int i=0;i<N;i++){
        System.out.print(ans[i]+ " ");
    }}

    static void Reverse_Array(int arr[], int N) {
        int[] ans = new int[N];
        for (int i = N - 1; i >= 0; i--) {
            ans[N - i - 1] = arr[i];
        }
        Print_Array(ans, N);
    }

    public static void main(String[] args) {
        int N = 5;
        int[] arr = {2,3,7,1,6};
        Reverse_Array(arr, N);
    }
}
*/

/*
//Write a program to reverse a given array by using space optimized iteration method
import java.io.*;
import java.lang.Math;
class Sum {
    static void Print_Array(int arr[], int N) {
        System.out.print("The reversed array of the given array is:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void Reverse_Array(int arr[], int N) {
        int p1 = 0, p2 = N - 1;
        while (p1 < p2) {
            int tmp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = tmp;
            p1++;
            p2--;
        }
        Print_Array(arr, N);
    }
public static void main(String[] args){
        int N=6;
        int[] arr={2,4,3,8,7,1};
        Reverse_Array(arr,N);
        }
    }
*/

/*
//Write a program to reverse array by using library function method
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
class Sum{
    static void Print_Array(Integer arr[],int N) {
        System.out.print("The reversed array of the given array is:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void Reversed_Array(Integer arr[]) {
        Collections.reverse(Arrays.asList(arr));
    }
    public static void main(String [] args){
        int N=5;
        Integer[] arr={2,1,4,3,5};
        Reversed_Array(arr);
        Print_Array(arr,N);
        }
    }
*/


/*
//Write a program to check whether a given string is palindrome or not
import java.io.*;
import java.util.Arrays;
class Sum{
    static boolean Is_Palindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);
            if (!Character.isLetterOrDigit(l))
                left++;
            else if (!Character.isLetterOrDigit(r))
                right++;
            else if (Character.toLowerCase(l) != Character.toLowerCase(r))
                return false;
            else {
                left++;
                right--;
            }
        } return true;
    }
    public static void main(String[] args){
        String str="MALAYALM";
        boolean ans=Is_Palindrome(str);
        if(ans==true){
            System.out.print("The given string is a palindrome string");}
        else{
            System.out.print("The given string is not a palindrome string");

            }
        }
    }

*/


/*
//Write a program to check whether given string is palindrome or not
import java.io.*;
import java.util.Arrays;
class Sum{
    static boolean Is_Palindrome(int i, String s) {
        if (i >= s.length() / 2) return true;
        if (s.charAt(i) != s.charAt(s.length()-i- 1) )
        return false;
        return Is_Palindrome(i + 1, s);
    }
    public static void main(String [] args){
        String s="adam";
        boolean ans=Is_Palindrome(0,s);
        System.out.print(ans);
        if(ans==true){
            System.out.print("The given string is a palindrome string");}
        else{
            System.out.print("The given string is not a palindrome string");

        }
        }
    }
*/

//Write a program to find out whether the given character is upperCase or LowerCase or anything else
/*
import java.io.*;
import java.util.Scanner;
class Solution {public static void main(String[] args){

    Scanner data=new Scanner(System.in);
    System.out.println("Enter the any character");
    char alpha=data.next().charAt(0);

    if(Character.isUpperCase(alpha)){
        System.out.println("1");
    }
    else if(Character.isLowerCase(alpha)){
        System.out.println("0");
    }
    else{
        System.out.println("-1");
    }
}
}
*/


/*import java.io.*;
 class Solution {
    public static void main(String[] args){
        int N=15;
        for(int i=1;i<=N;i++){
            if(i%3==0){
                System.out.println("Fizz");
            }
            else{
                System.out.println(i);
            }
           if(i%5==0){
               System.out.println("Buzz");
           }

        }
    }
}*/

/*
//Write a program to find out area of circle & rectangle
import java.io.*;
import java.util.Scanner;
class Area{
    public static void main (String[] args){
        Scanner data=new Scanner(System.in);
        System.out.println("Enter the ch value");
        int ch=data.nextInt();
        Scanner num=new Scanner(System.in);
        System.out.println("Enter the x value");
        int x=num.nextInt();
        Scanner val=new Scanner(System.in);
        System.out.println("Enter the y value");
        int y=val.nextInt();
        int a;
        switch(a=ch){
            case 1: a=x;
                double ans=2*3.14*x;
                System.out.println("The area of circle is:" +ans);
                break;
            case 2: a=x;
            a=y;
            int result=x*y;
                System.out.println("The area of rectangle is:" +result);
                break;
            default:
                System.out.println("The given number is invalid");
                break;
        }
    }
}
*/


/*//write a program to find out fibonacci series Nth value
import java.io.*;
import java.util.Scanner;
class fibonacciSeries{
    public static void main(String[] args){
        Scanner data=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N=data.nextInt();
        int first=1, second=1;
        int ans;
        if(N==1||N==2){
            System.out.println(first);}
        else{
            for(int i=3;i<=N;i++){
                int series=first+second;
                first=second;
                second=series;
            }
            System.out.println("Fibonacci series " +N+"th value is:" +second+ " ");
        }
    }
}*/



/*
//Write a program to find out the sum of even digit and sum of odd digit of the given number N
import java.io.*;
import java.util.Scanner;
class Sum{
    public static void main(String [] args){
        Scanner data=new Scanner(System.in);
        System.out.println("Enter the value of N");
       int N=data.nextInt();
       int odd=0,even=0,ans,result;
       while(N!=0){
           int temp=N%10;
           if(temp%2==0){
               even+=temp;
              }
           else{
               odd+=temp;
               }
           N=N/10;

           }
        System.out.println("The sum of even digit of the given number is:" +even);
        System.out.println("The sum of odd digit of the given number is:" +odd);
       }

    }

*/

/*
//Write a program to find the maximum number and swap the given inputs
import java.io.*;
import java.util.Scanner;
class Sum {
    static int Maximum(int x, int y) {
        if (x >= y)
            return x;
        else return y;
    }

    static int Swap(int x, int y) {
        int c = x;
        x = y;
        y = c;
        return Swap(x,y);

    }
    public static void main(String[] args){
        Scanner data=new Scanner(System.in);
        System.out.println("Enter test value");
        int test=data.nextInt();
        System.out.println("a:");
        int a =data.nextInt();
        System.out.println("b:");
        int b=data.nextInt();
        switch(test){
            case 1:
                int r=Maximum(a,b);
                System.out.println("Maximum number:" +r);
                break;
            case 2:
                int result=Swap(a,b);
                System.out.println("Swap numbers:" +result);
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
    }
}

*/


/*
//write a code to check whether user provided number is a Armstrong number or not
import java.io.*;
import java.lang.Math;
import java.util.Scanner;
class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check Armstrong number or not:");
        int N = sc.nextInt();

        boolean ans=Is_Armstrong(N);
        if(ans==true){
            System.out.println("The given number "+N+ " is a Armstrong Number");}
        else{
            System.out.println("The given number "+N+" is not a Armstrong Number");
        }
    }

    public static boolean Is_Armstrong(int N) {
        int sum = 0, temp = N;
        int power = countDigits(N);
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, power);
            temp = temp / 10;
        }
        if (sum == N) {
            return true;
        }
        else {
            return false;
        }
    }

    public static int countDigits(int N) {
        int count = 0;
        while (N != 0) {
            N = N / 10;
            count++;
        }
        return count;
    }

}
*/

/*
//Sum of all divisors from 1 to N
import java.io.*;
class SumOfDivisor {
    public static void main(String[] args) {

        int N = 5;
        int ans = SumOfDivisors(N);
        System.out.println(ans);
    }

    static int SumOfDivisors(int N) {
       int sum=0;
       for(int i=1;i<=N;i++){
           for(int j=1;j<=i;j++){
               if(i%j==0){
                   sum=sum+j;
               }
           }
       }return sum;
    }
}
*/


/*
import java.io.*;
import java.util.Scanner;
class IsPrimeNumber {
   static boolean Is_Prime(int N) {

       for (int i = 2; i < N; i++) {
           if (N % i == 0) {
               return false;
           }

       }return true;
   }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether a number is prime or not");
        int N = sc.nextInt();
        boolean ans=Is_Prime(N);
            if (N != 1 && ans==true) {
                System.out.println("Prime number");
            } else {
                System.out.println("Not a prime number");
            }

        }

    }


*/
/*
//prime number program
import java.io.*;
class Solution{
    static boolean isPrime(int n) {
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }}
        return true;
    }
    public static void main(String[] args){
        int n=5;
        boolean ans=isPrime(n);
        if(n!=1 && ans==true){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }	}
}
*/


/*//write a program to print number from o to N (by using recursion and without for loop)
import java.io.*;
class numToN{
    static int count=1;
    static void print(int N) {
        if (count ==N) return;
        System.out.println(count);
        count = count + 1;
        print(N);
    }
    public static void main(String[] args){
        int N=3;
        print(N);

    }
}*/


/*
//print a given string N times
import java.io.*;
class PrintStringNTimes{
   static String name="sanjay";
   static void Print_String(int i,int n) {
       if (i >= n) return;
       System.out.println(name);
       Print_String(i + 1, n);
   }
   public static void main(String[] args){
       int n=5;
       Print_String(0,n);
   }
}
*/

/*
//print a array from N to 1
import java.io.*;
class Nto1{
    static void N_To1(int i,int N) {
        if (i < 1) return;
        System.out.println(i);
        N_To1(i - 1, N);
    }
    public static void main(String[] args){
        int N=5;
        N_To1(N,N);

    }
}*/





/*
//sum of first N numbers
import java.io.*;
class sumOfFirstN{
    static void Sum_Of_N(int i,int sum) {
        if (i <1){
            System.out.println(sum);
        return;}
        Sum_Of_N(i-1,sum+i);

    }
    public static void main(String [] args){
        int n=3;
        Sum_Of_N(n,0);
    }
}*/


/*
//find the factorial of the given number N
import java.io.*;
class factorial{
    static void Factorial_Of_N(int i,int fact){
        if(i<1)
        {  System.out.println(fact);
            return;}
        Factorial_Of_N(i-1,fact*i);
    }
public static void main(String[] args){
        int N=4;
        Factorial_Of_N(N,1);
}}
*/


/*
//Reverse Array by using auxillary array approach
class Reverse_Array{
    static void Print_Array(int[] ans,int N ) {
        System.out.println("The reversed array of the given array is:");
        for (int i = 0; i < N; i++) {
            System.out.print(ans[i] + " ");
        }
    }
    static void Reversed_Array(int[] arr,int N) {
        int[] ans = new int[N];
        for (int i = N - 1; i >= 0; i--) {
            ans[N - i - 1] = arr[i];
        }
        Print_Array(ans, N);
    }
    public static void main(String[] args){
        int N=5;
        int[] arr={5,4,3,2,1};
        Reversed_Array(arr,N);

    }
    }

*//*







*/
/*
//Print Reversed Array by using space optimized method
class Reverse_Array{
    static void Print_Array(int[] arr,int N) {
        System.out.println("The reversed array of the given is:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void Reversed_Array(int[] arr,int N) {

        int p1 = 0, p2 = N - 1;
        while (p1 < p2) {
            int tmt = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = tmt;
            p1++;
            p2--;
        }
        Print_Array(arr, N);
    }
    public static void main(String[] args){
        int N=5;
        int[] arr={1,2,3,4,5};
        Reversed_Array(arr,N);

        }
    }
*//*





*/
/*
//Reverse array by using recursive method
class Reverse_Array{
    static void Print_Array(int[] arr,int N) {
        System.out.println("The reversed array of the given array is:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void Reversed_Array(int[] arr,int start,int end) {
        if (start < end) {
            int tmt = arr[start];
            arr[start] = arr[end];
            arr[end] = tmt;
            Reversed_Array(arr, start + 1, end - 1);
        }
    }
    public static void main(String[] args){
        int N=5;
        int[] arr={5,6,7,8,9};
        Reversed_Array(arr,0,N-1);
        Print_Array(arr,N);
        }
    }*//*




//Reverse Array by using collection / library function method
import java.util.Collections;
import java.util.Arrays;
class CollectionMethod{
    static void Print_Array(Integer[] arr,int N) {
        System.out.println("The reversed array of the given array is:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void Reversed_Array(Integer[] arr) {
        Collections.reverse(Arrays.asList(arr));
    }
    public static void main(String[] args){
        int N=5;
        Integer[] arr={5,4,3,2,1};
        Reversed_Array(arr);
        Print_Array(arr,N);

        }
    }
*/




/*
//Write a program to check whether a given string is palindrome or not
class Is_Palindrome{
    static boolean IsPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char p = s.charAt(left), q = s.charAt(right);
            if (!Character.isLetterOrDigit(p))
                left++;
            else if (!Character.isLetterOrDigit(q))
                right--;
            else if (Character.toLowerCase(p) != Character.toLowerCase(q))
                return false;
            else {
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s="sanjay";
        boolean ans=IsPalindrome(s);
        if(ans==true) {
            System.out.println("Palindrome String");
        }
        else{
            System.out.println("Not a Palindrome String");



            }
        }
    }

*/



/*
// Write a program to check whether given string is palindrome or not by using recursive method
import java.lang.String;
class Palindrome{
    static boolean Is_Palindrome(int i, String s) {
        if (i ==s.length() / 2) return true;
        if (s.charAt(i) != s.charAt(s.length() - i - 1))return false;
        return Is_Palindrome(i + 1, s);
    }
    public static void main(String[] args){
        String s="sanjay";
        boolean ans=Is_Palindrome(0,s);
        if(ans==true) {
            System.out.println("Palindrome String");
        }
        else{
            System.out.println("Not a Palindrome String");

        }

        }

    }

*/





/*//Write a program to find out the fibonacci series of the given Nth term by using native approach
class fibonacci {
    public static void main(String[] args) {
        int N = 5;
        if (N == 0) {
            System.out.println("0");
        } else {
            int fib[] = new int[N + 1];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i <= N; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            System.out.println("The fibonacci series of the given "+N+"th term is");
            for(int i=0;i<=N;i++)
            System.out.print(fib[i]+ " ");
            }
        }
    }*/



/*
//write a program to find out the fibonacci series of the given Nth term by using recursive approach
class fibonacci{
    static int Fibonacci(int N) {
        if (N <= 1) {
            return N;
        }
            int last = Fibonacci(N - 1);
            int s_last = Fibonacci(N - 2);
            return last + s_last;

    }
    public static void main(String [] args){
        int N=4;
        int ans=Fibonacci(N);
        System.out.println(ans);
  }
  }
 */






/*
//Write a program to print the frequency of the array element till Nth array index
import java.util.*;
class CountFrequency{
    public static void main(String[] args){
        int arr[]={10,3,10,2,3};
                int N=5;
                Count_Freq(arr,N);
    }
     static void Count_Freq(int[] arr,int N){
        boolean[] visited=new boolean[N];
        for(int i=0;i<N;i++){
            if(visited[i]==true)
                continue;
            int count=1;
            for(int j=i+1;j<N;j++){
                if(arr[i]==arr[j]) {
                    visited[j] = true;
                    count++;
                }
                }
            System.out.println(arr[i]+"->"+count);
            }
        }

    }
*/




/*
//Write the program to find the frequency of the all array values
import java.io.*;
import java.util.HashMap;
import java.util.Map;
class CountFrequency{
    public static void main(String[] args){
        int[] arr={10,3,10,4,3,10};
        int N=arr.length;
        Count_Freq(arr,N);}
    static void Count_Freq(int[] arr,int N){
        //implement HashMap method
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());

        }
    }
}
*/







/*
//Find the maximum and minimum frequency array element by using 2 for loop method
import java.io.*;
class Max_Min_Freq{
    public static void main(String[] args) {
        int[] arr = {10, 3, 10, 3, 4, 10};
        int N = arr.length;
        MaxAndMin_Freq(arr, N);
    }
    static void MaxAndMin_Freq(int[] arr, int N){
        int maxFreqValue=0,minFreqValue=N;
        int maxFreqElement=0,minFreqElement=0;
        boolean[] visited=new boolean[N];
        for(int i=0;i<N;i++) {
            if (visited[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < N; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count > maxFreqValue) {
                maxFreqElement = arr[i];
                maxFreqValue = count;
            }
            if (count < minFreqValue) {
                minFreqElement = arr[i];
                minFreqValue = count;
            }
        }
        System.out.println("The Maximum frequency array element is:" +maxFreqElement);
        System.out.println("The minimum frequency array element is:" +minFreqElement);


                }
            }
*/




/*
//Find the maximum and minimum frequency array element by using map
import java.io.*;
import java.util.Map;
import java.util.HashMap;
class MaxMinFreq{
    public static void main(String [] args) {
        int[] arr = {10, 3, 10, 3, 4, 10};
        int N = arr.length;
        MaxMin_Freq(arr, N);
    }
    static void MaxMin_Freq(int[] arr,int N){
        int maxFreqValue=0,minFreqValue=N;
        int maxFreqElement=0,minFreqElement=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
            int countFreqElement = entry.getKey();
            int countFreqValue = entry.getValue();
            if (countFreqValue > maxFreqValue) {
                maxFreqElement = countFreqElement;
                maxFreqValue = countFreqValue;
            }
            if (countFreqValue < minFreqValue) {
                minFreqElement = countFreqElement;
                minFreqValue = countFreqValue;
            }
        }
        System.out.println("The Maximum frequency array element is:" +maxFreqElement);
        System.out.println("The minimum frequency array element is:" +minFreqElement);

            }
        }
*/





/*//Write a program to sort the given array elements in non-decreasing order
import java.io.*;
import java.util.Arrays;
class Sort{
    static void Sorted_Num(int[] arr,int N) {
        //outer loop for sorting array elements
        for (int i = 0; i < N - 1; i++) {
            int mini = i;

            //inner loop for un-sorted array elements
            for (int j = i + 1; j < N; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            //swapping of arr[i] and arr[mini]
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Array after the Selection Sort Algorithm:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr={10,4,2,1,7,3};
        int N=arr.length;
        System.out.println("Array Before applying Selection Sort Algorithm:");
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+ " ");
                }
        System.out.println();
        Sorted_Num(arr,N);
            }
        }*/

/*
//write a program to sort the given array by using bubble sort algorithm for worst case scenario
import java.io.*;
class Bubble_Sort {
    static void Bubble_Sorting(int[] arr, int N) {
        //outer loop for sorted array elements
        for (int i = N - 1; i >= 1; i--) {
            //inner loop for un-sorted array elements
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swapping  the arr[j] and arr[j+1]
                    int temp = arr[j];// temporary variable taken for swapping
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("The sorted array after implementing bubble sorting algorithm is:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 2, 5, 9, 6, 4, 1};
        int N = arr.length;
        Bubble_Sorting(arr, N);
    }
}

*/





/*
//write a program to sort the given array by using bubble sort algorithm for best case scenario
import java.io.*;
class Bubble_Sort {
    static void Bubble_Sorting(int[] arr, int N) {
        //outer loop for sorted array elements
        for (int i = N - 1; i >= 1; i--) {
            int didSwap=0;
            //inner loop for un-sorted array elements
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swapping  the arr[j] and arr[j+1]
                    int temp = arr[j];// temporary variable taken for swapping
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap=1;
                }
            }
            if(didSwap==0){
                break;
            }
        }
        System.out.println("The sorted array after implementing bubble sorting algorithm is:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 2, 5, 9, 6, 4, 1};
        int N = arr.length;
        Bubble_Sorting(arr, N);
    }
}

*/





/*
//Write a program to sort the array element by using Insertion Sorting Algorithm
import java.io.*;
class InsertionSort{
    static void Insertion_Sorting(int[] arr,int N) {
        //outer loop for sorted array elements
        for (int i = 0; i <= N - 1; i++) {
            int j = i;
            //condition for swapping
            while (j > 0 && arr[j - 1] > arr[j]) {
                //swapping arr[j-1] and arr[j]
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println("The  array after implementing Insertion Sorting Algorithm is:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr={10,3,4,2,1,6,7,5};
        int N=arr.length;
        System.out.println("The array before implementing Insertion Sorting  Algorithm is:");
        for(int i=0;i<N;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Insertion_Sorting(arr,N);

            }

        }
*/







/*
//Write a program to sort the given array by using Merge Sort Algorithm
import java.util.*;
class Sorting {
    private static void Merge(int[] arr, int low, int mid, int high) {
        //Declaring temp variable to store sorted array
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;// Starting index of left half of the array
        int right = mid + 1;// Starting index right half of the array
        //dividing the array into two halves--> [low...to...mid] & [mid+1...to...high]
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
            //copying the array elements that left-out in left half into temp variable
            while (left <= mid) {
                temp.add(arr[left]);
                left++;
            }
            //copying the array elements that left-out in right half into temp variable
            while (right <= high) {
                temp.add(arr[right]);
                right++;
            }
//copying all the temporary variable data into arr[i] variable
        for (int i = low; i <=high; i++) {
            arr[i] = temp.get(i - low);
        }
    }


    //dividing the array by using Merge_Sort function
    public static void Merge_Sort(int arr[], int low, int high) {
        //base condition
        if (low >= high) return;
        int mid = (low + high) / 2;
        //left half of the array
        Merge_Sort(arr, low, mid);
        //right half of the array
        Merge_Sort(arr, mid + 1, high);
        //calling Merge function in this function
        Merge(arr, low, mid, high);
    }
}
class Sort {
    public static void main(String[] args) {
        int[] arr = {10, 4, 2, 6, 9, 1, 3};
        int N = 7;
        System.out.println("The Un-sorted array before implementing Merge Sort algorithm is:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Sorting.Merge_Sort(arr, 0, N - 1);//calling Merge_Sort function in this class
        System.out.println("The Sorted array after implementing Merge Sort algorithm is:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


*/




/*
//Write a program to sort the given array by using bubble sort algorithm( recursive method approach)
class BubbleSort{
    static void Bubble_Sort(int[] arr,int N) {
        //declaring the base condition
        if (N == 1) return;
        //declaring the range of the sorted array
        for (int i = 0; i <= N - 2; i++) {
            //condition for swapping the array
            if (arr[i] > arr[i + 1]) {
                //swapping the arr[i] & arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        Bubble_Sort(arr, N - 1);
    }
    public static void main(String[] args){
        int[] arr={10,3,4,2,9,7,8};
        int N=arr.length;
        System.out.println("The un-sorted array before implementing the bubble sort algorithm is: ");
        for(int i=0;i<N;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Bubble_Sort(arr,N);
        System.out.println("The sorted array after implementing the bubble sort algorithm is:");
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    }

*/



/*//Write a program to sort the given array by using Insertion Sorting Algorithm(Recursive method)
class InsertionRecursion{
    static void Insertion_Sort_Recursion(int[] arr,int i,int N) {
        //base condition
        if (i == N) return;
        int j = i;
        //condition for swapping
        while (j > 0 && arr[j - 1] > arr[j]) {
            //swapping the arr[j-1] & arr[j]
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
        Insertion_Sort_Recursion(arr, i + 1, N);
    }
    public static void main(String[] args){
        int[] arr={10,4,6,7,8,3,2,1};
                int N= arr.length;
        System.out.println("The un-sorted array before implementing the Insertion sort algorithm(Recursive Method) is: ");
        for(int i=0;i<N;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
       Insertion_Sort_Recursion(arr,0,N);
        System.out.println("The sorted array after implementing the bubble sort algorithm is:");
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}*/



/*
//Write a program to sort the given array by using Quick Sort Algorithm
import java.util.*;
class QuickSort {
    private static int Partition(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[low];
        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void Quick_Sort(int[] arr, int low, int high) {
        if (low < high) {
            int PIndex = Partition(arr, low, high);
            Quick_Sort(arr, low, PIndex - 1);
            Quick_Sort(arr, PIndex + 1, high);
        }
    }
}

    class Sort {
        public static void main(String[] args) {
            int[] arr = {10, 2, 4, 1, 5, 6, 8};
            int N = arr.length;
            System.out.println("The Un-sorted array before implementing Quick Sort Algorithm is:");
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            QuickSort.Quick_Sort(arr, 0, N - 1);
            System.out.println("The Sorted array after implementing Quick Sort Algorithm is:");
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

*/








/*
//Write a program to sort the given array by using Quick_Sort Algorithm
import java.util.*;
class QuickSort {
    private static int Partition(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[low];
        while (i < j) {
            //left sub_array
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            //right sub_array
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                //swap arr[i] & arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap arr[low] & arr[j]
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void Quick_Sort(int[] arr, int low, int high) {
        if (low < high) {
            int PIndex = Partition(arr, low, high);
            Quick_Sort(arr, low, PIndex - 1);
            Quick_Sort(arr, PIndex + 1, high);
        }
    }
}
    class Sort{
        public static void main(String[] args) {
            int[] arr = {10, 3, 4, 2, 1, 4, 5, 7, 8, 12, 23, 34, 12, 99, 100, 1000};
            int N = arr.length;
            System.out.println("The Un-sorted array before implementing Quick Sort Algorithm is:");
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            QuickSort.Quick_Sort(arr, 0, N - 1);
            System.out.println("The Sorted array after implementing Quick Sort Algorithm is: ");
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

*/






/*
//Write a program to sort the given algorithm by using Quick Sort (ArrayList data used)
import java.util.*;
class Sorting {
    static int Partition(List<Integer> arr, int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr.get(low);
        while (i < j) {
            while (arr.get(i) <= pivot && i <= high - 1) {
                i++;
            }
            while (arr.get(j) > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                //swap arr[i] & arr[j]
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        //swap arr[low] & arr[j]
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }

    static void QS(List<Integer> arr, int low, int high) {
        if (low < high) {
            int PIndex = Partition(arr, low, high);
            QS(arr, low, PIndex - 1);
            QS(arr, PIndex + 1, high);
        }
    }

    static List<Integer> QuickSort(List<Integer> arr) {
        QS(arr, 0, arr.size() - 1);
        return arr;
    }
}
class Algo {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr = Arrays.asList(new Integer[]{10, 4, 2, 1, 67, 100, 400, 1000, 200000, 300, 12, 30, 300, 20000000});
        int N = arr.size();
        System.out.println("Un-sorted array before implementing Quick sort Algorithm is: ");
        for (int i = 0; i < N; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        arr = Sorting.QuickSort(arr);
        System.out.println("The Sorted array after implementing QuickSort Algorithm is:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr.get(i+N-1) + " ");
        }
        System.out.println();
    }
}

*/








/*
//Find the largest array element from the given un-sorted array by using Brute Force Approach
import java.util.*;
class LargeNum{
    public static void main(String[] args) {
        int[] arr1 = {1000, 23, 24, 1, 3, 4000, 5000, 200, 100, 10};
        System.out.println("The largest array element from the given un-sorted array is:"+Sort(arr1));
    }
    static int Sort(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
*/




/*
//Find the Largest array element from the given Un-Sorted array by using Recursive approach
import java.util.*;
class Sorting{
    public static void main(String[] args) {
        int[] arr1 = {100, 30000, 2, 1000, 20, 30};

        System.out.println("The Largest array element of the given un-sorted array is: " +Sort(arr1));
    }
     static int Sort(int[] arr){
         int max=arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max) {
                max = arr[i];
            }
            }
        return max;
        }
    }
*/






/*
//Find the 2nd Largest/Smallest array element from the given un-sorted array elements
import java.util.*;
class SecondLargeSmall{
    public static void main(String[] args) {
        int[] arr1 = {10, 30, 2, 1, 32, 43};
        System.out.println("The 2nd Largest array element from the given array is:"+Large(arr1));
        System.out.println("The 2nd Smallest array element from the given array is:"+Small(arr1));
    }
    static int Large(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }
    static int Small(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-arr.length+1];

    }

}
*/




/*
//Find the 2nd Small /2nd Large array element from the given un-sorted array by using brute force method
import java.util.*;
class Solution{
    static void Sort(int[] arr,int N) {
        if (N == 0 || N == 1) {
            System.out.print("-1");
            System.out.print(" ");
            System.out.print("-1");
            System.out.println("/N");
        }
        Arrays.sort(arr);
        int small = arr[1];
        int Large = arr[N - 2];
        System.out.println("2nd large array element is: " + Large);
        System.out.println("2nd Small array element is: " + small);
    }
    public static void main(String[] args){
        int[] arr={10,2,3,1,900,90};
        int N=arr.length;
        Sort(arr,N);
    }
}

*/





/*
//Find the 2nd Small & 2nd Large array element without sorting the array
import java.util.*;
class Solution{
    static void Non_Sorting(int[] arr,int N) {
        if (N == 0 || N == 1) {
            System.out.print("-1");
            System.out.print(" ");
            System.out.print("-1");
            System.out.print("/N");
        }
        int small = Integer.MAX_VALUE;
        int SecondSmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int SecondLarge = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }
        for (int i = 0; i < N; i++) {
            if (arr[i] < SecondSmall && arr[i] != small) {
                SecondSmall = arr[i];
            }
            if (arr[i] > SecondLarge && arr[i] != large) {
                SecondLarge = arr[i];
            }
        }
        System.out.println("2nd Large array element is:" +SecondLarge);
        System.out.println("2nd Small array element is:" +SecondSmall);

            }
            public static void main(String[] args){
        int[] arr={22,4,2,30,12,24,8000,40};
        int N=arr.length;
        Non_Sorting(arr,N);
    }

}
*/




/*
//Find the 2nd largest/smallest array element by using optimal approach
import java.util.*;
class NonSorting{
    private static int Second_Small(int[] arr,int N) {
        if (N < 2) return -1;
        int small = Integer.MAX_VALUE;
        int SecondSmall = Integer.MAX_VALUE;
        int i = 0;
        for (i = 0; i < N; i++) {
            if (arr[i] < small) {
                SecondSmall = small;
                small = arr[i];
            } else if (arr[i] < SecondSmall && arr[i] != small) {
                SecondSmall = arr[i];
            }
        }
        return SecondSmall;
    }
    private static int Second_Large(int[] arr,int N) {
        if (N < 2) return -1;
        int large = Integer.MIN_VALUE;
        int SecondLarge = Integer.MIN_VALUE;
        int i = 0;
        for (i = 0; i < N; i++) {
            if (arr[i] > large) {
                SecondLarge=large;
                large=arr[i];
            } else if (arr[i] > SecondLarge && arr[i] != large) {
                SecondLarge = arr[i];
            }
        }
        return SecondLarge;
    }
    public static void main(String[] args){
        int[] arr={2,1,3,4,90,40};
        int N=arr.length;
        int sl=Second_Large(arr,N);
        int ss=Second_Small(arr,N);
        System.out.println("2nd Large array element is:" +sl);
        System.out.println("2nd small array element is:" +ss);
    }
}
*/











/*
//Check whether the given array elements are sorted or not (Optimal approach)
import java.util.*;
class CheckSorting{
    public static void main(String[] args) {
        int[] arr = {10, 20, 31,40, 50};
       boolean result= Check_Sorting(arr);
       if(result ==true){
               System.out.println("The given array are in the sorted order");
           } else{

               System.out.println("The given array are not in  the sorted order");
       }
    }
    static boolean Check_Sorting(int[] arr){
     for(int i=0;i<arr.length-1;i++){
         if(arr[i]>arr[i+1])
             return false;
             }return true;
         }
     }

*/



/*
//Check whether the given array elements are sorted or not (Brute Force approach)
import java.util.*;
class CheckSorting{
    static boolean Check_Sorting(int[] arr,int N){
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                if(arr[i]>arr[j])
                    return false;
            }

        }
        return true;
    }
    public static void main(String[] args){
        int[] arr={10,20,30,40,30};
        int N=arr.length;
        boolean ans=Check_Sorting(arr,N);
        if(ans==true) {
            System.out.println("Sorted array");
        }
        else {
            System.out.println("Un-Sorted Array");
        }
    }
}

*/




/*
//write a program to remove duplicates array from the given array elements
import java.util.*;
class Solution{
    static int Duplicate_Array(int[] arr, int N){
        if(N==0 || N==1){
            return N;
        }
            int j=0;
        int[] temp=new int[N];
        for(int i=0;i<N-1;i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++]=arr[i];
            }

        }
        temp[j++]=arr[N-1];
        //copying temporary array variable data into original array
        for(int i=0;i<j;i++) {
            arr[i] = temp[i];
        } return j;
        }
    public static void main(String[] args){
        int[] arr={10,10,20,20,30};
        int N=arr.length;
        int k= Duplicate_Array(arr,N);
        System.out.println("The original array of the given sorted array is:");
       for(int i=0;i<k;i++) {
           System.out.print(arr[i] + " ");
       }
       }
    }

*/


/*
//Write a program to remove the duplicates array elements from the given sorted array
import java.util.*;
class RemoveDuplicates{
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3};
        int k = Remove_Duplicates(arr);
        System.out.println("The array after removing duplicates array:");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");

        }
    }
    static int Remove_Duplicates(int[] arr){
        HashSet< Integer > set= new HashSet< > ();
        for(int i=0;i<arr.length;i++) {
            set.add(arr[i]);
        }
        int k=set.size();
        int j=0;
        for(int x:set) {
            arr[j++] =x;
        }
        return k;
    }
}

*/









/*//Remove the duplicates array by using optimal approach
  import java.util.*;
  class RemoveDuplicates{
      public static void main(String[] args){
          int[] arr={10,10,20,20,20,30,39};
          int k=Remove_Duplicates(arr);
          System.out.println("The array after removing duplicates is:");
          for(int i=0;i<=k;i++) {
              System.out.print(arr[i] + " ");

          }
      }
      static int Remove_Duplicates(int[] arr){
          int i=0;
          for(int j=1;j<arr.length;j++){
              if(arr[i]!=arr[j]) {
                  i++;
                  arr[i] = arr[j];
              }
              } return i;
          }

      }*/








/*
//Rotate the one place of the array to left side by using optimal approach
import java.util.*;
class RotateLeft{
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        int N=5;
        Rotate_Left(arr,N);
    }
    static void Rotate_Left(int[] arr,int N){
        int temp=arr[0];
        for(int i=1;i<N;i++) {
            arr[i - 1] = arr[i];
        }
        arr[N-1]=temp;
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
*/





/*
//Rotate the array elements to left side by one place by using brute force approach
import java.util.*;
class Rotate{
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        int N=5;
        Rotate_Left(arr,N);

    }
    static void Rotate_Left(int[] arr,int N) {
        int[] temp = new int[N];
        for (int i = 1; i < N; i++) {
            temp[i - 1] = arr[i];
        }
        temp[N - 1] = arr[0];
    for(int i=0;i<N;i++){
        System.out.print(temp[i]+ " ");
        }
    }
}
*/





/*import java.util.*;
class Solution{
    public static void main(String[] args){
        int Pattern[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(Pattern[i][j]+ " ");
            }
            System.out.println();
        }
    }
}*/




/*
//Rotate the array to right side by k times
import java.util.*;
class Rotate{
   public static void Rotate(int[] num,int k){
        k%=num.length;
        Recursion(num,0,num.length-1);
        Recursion(num,0,k-1);
        Recursion(num,k,num.length-1);
    }
   public static void Recursion(int[] num,int start,int end) {
        while (start < end) {
            //Swapping num[start] & num[end]
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int[] num={10,20,30,40,50};

        Rotate(num,3);
        System.out.println("Array after moving k places to right");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+ " ");

        }
    }
}







/*
//Rotate the array to right side by k times
import java.util.*;
class RotateRight{
    static void Rotate_Right(int[] arr,int k,int N){
        if(N==0)
            return;
        k%=N;
        if(k>N)
            return;
        int[] temp=new int[k];
        //store last k(means N-k to N) elements into the  temp array
        for(int i=N-k;i<N;i++) {
            temp[i - (N - k)] = arr[i];
        }
        //store the remaining array elements from 0<------N-k in arr[i]
        for(int i=N-k-1;i>=0;i--) {
            arr[i + k] = arr[i];
        }
        //copy the array that we stored in temp array into the original array  arr[i=0-----K]
        for(int i=0;i<k;i++) {
            arr[i] = temp[i];
        }
        }
        public static void main(String[] args){
        int[] arr={10,20,30,40,50,60,70};
        int N=arr.length;
        Rotate_Right(arr,2,N);
            System.out.println("The array after rotating kth times to right side is: ");
            for(int i=0;i<N;i++) {
                System.out.print(arr[i] + " ");
            }
            }
    }

*/







/*
//Rotate the array to left side by kth times
import java.util.*;
class Rotate_Left{
    static void Rotate_Left(int[] arr,int N,int k){
        if(N==0)
            return;
        k%=N;
        if(k>N)
            return;
        int[] temp=new int[k];
        //store the first 0--->k elements in temp array
        for(int i=0;i<k;i++) {
            temp[i] = arr[i];
        }
        //store the remaining array arr[k-->N-k] elements into arr[i=0---->N-K]
        for(int i=0;i<N-k;i++) {
            arr[i] = arr[i + k];
        }
        // Copy the first 0---->k elements that we stored in temp array into original array
        for(int i=N-k;i<N;i++) {
            arr[i] = temp[i - (N - k)];
        }
        }
        public static void main(String[] args){
        int[] arr={10,20,30,40,50,60,70};
        int N=arr.length;
        Rotate_Left(arr,N,2);
            System.out.println("The array after rotating to left side by kth times");
            for(int i=0;i<N;i++){
                System.out.print(arr[i]+ " ");

            }
    }
}

*/









/*
//Rotate the array to right side by kth times by using Recursive method(Reversal Algorithm)
import java.util.*;
class RotateRight{
    static void Recursive(int[] arr,int start,int end) {
        //base condition
        while (start <= end) {
            //swapping of arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void Rotate_Right(int[] arr,int k, int N){
        Recursive(arr,0,N-k-1);
        Recursive(arr,N-k,N-1);
        Recursive(arr,0,N-1);

        }
        public static void main(String[] args){
        int[] arr={10,20,30,40,50,60,70};
        int N=arr.length;
        Rotate_Right(arr,2,N);
            System.out.println("The array after rotating kth times to right side:");
            for(int i=0;i<N;i++){
                System.out.print(arr[i]+ " ");

            }
    }
}

*/






/*
//Rotate the array to left side by kth times by using Recursive method(Reversal Algorithm)
import java.util.*;
class RotateLeft{
    static void Recursive(int[] arr,int start,int end) {
        //base condition
        while (start <= end) {
            //swapping of arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void Rotate_Left(int[] arr,int k, int N){
        Recursive(arr,0,k-1);
        Recursive(arr,k,N-1);
        Recursive(arr,0,N-1);

    }
    public static void main(String[] args){
        int[] arr={10,20,30,40,50,60,70};
        int N=arr.length;
        Rotate_Left(arr,2,N);
        System.out.println("The array after rotating kth times to left side:");
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+ " ");

        }
    }
}

*/





/*
//Move the "0" to the end from the given array by using Brute force approach
import java.util.*;
class MoveZero {
   static int[] Move_Zero(int[] arr,int N){
       ArrayList<Integer> temp=new ArrayList<>();
       //Non-zero number stored in temp array
       for(int i=0;i<N;i++) {
           if (arr[i] != 0) {
               temp.add(arr[i]);
           }
       }
       //Non-Zero array size declared
       int nz=temp.size();
       //Copy the Non-zero array stored in temp array into original array
       for(int i=0;i<nz;i++) {
           arr[i] = temp.get(i);
       }
       //store the zero arrays in the remaining vacant places of the original array
       for(int i=nz;i<N;i++) {
           arr[i] = 0;
       }
       return arr;
           }
           public static void main(String[] args){
       int[] arr={1,0,2,0,3,0,4};
       int N=arr.length;
       int[] ans=Move_Zero(arr,N);
               System.out.println("The array after moving zero to the end:");
               for(int i=0;i<N;i++){
                   System.out.print(ans[i]+ " ");
               }
               System.out.println("");
       }
   }

*/







/*
//Move Zero to the end of the given array by using Optimal approach
import java.util.*;
class MoveZero{
    static int[] Move_Zero(int[] arr,int N){
        int j=-1;
        for(int i=0;i<N;i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
            if(j==-1)return arr;
            for(int i=j+1;i<N;i++){
                if(arr[i]!=0){
                    //swap arr[i] & arr[j]
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    j++;
            }
        } return arr;
    }
    public static void main(String[] args){
        int[] arr={1,0,2,0,3,0,4};
        int N=arr.length;
        int[] ans=Move_Zero(arr,N);
        System.out.println("The array after moving zero to the end is:");
        for(int i=0;i<N;i++){
            System.out.print(ans[i]+ " ");
        }
        System.out.println("");
    }
}

*/





/*
//Check whether the num present in the given array by using Linear Search
import java.util.*;
class CheckNum{
    static int Check_Num(int[] arr,int num,int N){
        for(int i=0;i<N;i++) {
            if (arr[i] == num)
                return i;
        } return -1;
        }
    public static void main(String[] args){
        int[] arr={1,2,3,9,10};
        int N=arr.length;
       int ans= Check_Num(arr,4,N);
        System.out.println(ans);
       }

    }
*/



/*
//Find the Union of the given two array by using HashMap
import java.util.*;
class Union{
    static ArrayList<Integer> Union_HashMap(int[] a,int[] b,int n,int m) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        ArrayList<Integer> Union = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            freq.put(a[i], freq.getOrDefault(a[i], 0) + 1);
        }
        for (int i = 0; i < m; i++) {
            freq.put(b[i], freq.getOrDefault(b[i], 0) + 1);
        }
        for (int data : freq.keySet())
            Union.add(data);
        return Union;
    }
    public static void main(String[] args){
        int[] a={1,3,5,7,9};
        int[] b={1,2,4,5};
        ArrayList<Integer> info=Union_HashMap(a,b,5,4);
        System.out.println("Union of Array a & Array b is:");
        for(int val:info) {
            System.out.print(val + " ");
        }

        }
    }
*/








/*
//Find the Union of the given array by using HashSet
import java.util.*;
class UnionByHashSet{
    static ArrayList<Integer> Union_ByHashSet(int[] a,int[] b,int n,int m){
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> Union=new ArrayList<>();
        for(int i=0;i<n;i++) {
            set.add(a[i]);
        }
        for(int i=0;i<m;i++) {
            set.add(b[i]);
        }
        for(int data:set) {
            Union.add(data);
        }
        return Union;
        }
        public static void main(String[] args){
        int[] a={1,3,4,5,6,9};
        int[] b={1,2,3,7,8,10};
       ArrayList<Integer> info= Union_ByHashSet(a,b,6,6);
            System.out.println("Union of the given array a & array b is:");
        for(int val:info){
            System.out.print(val+ " ");

        }
    }
}
*/









/*
//Find the Union of the given arrays by using two pointer (Optimal Approach)
import java.util.*;
class UnionByOptimal {
    static ArrayList<Integer> Union_By_TwoPointer(int[] a, int[] b, int n, int m) {
        int i = 0, j = 0;
        ArrayList<Integer> Union = new ArrayList<>();
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                //if Union is empty or Union doest not  have any similar value like array a[i] then add to a[i] value to Union
                if (Union.size() == 0 || Union.get(Union.size() - 1) != a[i]) {
                    Union.add(a[i]);
                }
                //if that value added or not then also i++ will happen
                i++;
            } else {
                //if Union is empty or Union doest not  have any similar value like array b[j] then add to b[j] value to Union
                if (Union.size() == 0 || Union.get(Union.size() - 1) != b[j]) {
                    Union.add(b[j]);
                }
                //if that value added or not then also j++ will happen
                j++;
            }
        }
        while (i < n) {
            //this condition check whether  any array elements still remain in a[i]
            if (Union.size() == 0 || Union.get(Union.size() - 1) != a[i]) {
                Union.add(a[i]);
            }
            i++;
        }
        while (j < m) {
            //this condition check whether  any array elements still remain in b[j]
            if (Union.size() == 0 || Union.get(Union.size() - 1) != b[j]) {
                Union.add(b[j]);
            }
            j++;
        }
        return Union;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 6, 8, 10};
        int[] b = {1, 2, 3, 4, 5, 7, 9, 10};
        ArrayList<Integer> data = Union_By_TwoPointer(a, b, 6, 8);
        System.out.println("The Union of the given array a & array b is:");
        for (int val : data) {
            System.out.print(val + " ");
        }
    }
}

*/




/*

//Find the Missing Number from the given array by using flag check variable
import java.util.*;
class MissingNumber{
    static int Missing_Number(int[] nums){
       for(int i=1;i<=nums.length;i++) {
           int flag = 0;
           for(int j=0;j<nums.length-1;j++){
               if(nums[j]==i){
                    flag=1;
                    break;
               }
           }
           if(flag==0) return i;
       } return -1;
    }
    public static void main(String[] args){
        int[] nums={3,0,1};
       int ans= Missing_Number(nums);
        System.out.println(ans);

    }
}
*/







/*//Find the missing number by using hashing(Better Approach)
import java.util.*;
class MissingNumber{
    static int Missing_Number(int[] arr,int N){
        int Hash[]=new int[N+1];
        for(int i=0;i<N-1;i++) {
            Hash[arr[i]]++;
        }
        for(int i=1;i<=N;i++){
            if(Hash[i]==0)
                return i;
        } return -1;
    }
    public static void main(String[] args){
        int[] arr={3,0,1};
        int N=arr.length;
        int ans=Missing_Number(arr,N);
        System.out.println(ans);
    }
}*/



/*
//Find Missing Number by using Summation method (Optimal Approach)
import java.util.*;
class MissingNUmber{
    static int Missing_Number(int[] arr,int N){
        int sum=N*(N+1)/2;
        int count=0;
        for(int i=0;i<N-1;i++) {
            count += arr[i];
        }
        int missing_num=sum-count;
        return missing_num;
        }
        public static void main(String[] args){
        int[] arr={0,2,3};
        int N=arr.length;
        int ans=Missing_Number(arr,N);
            System.out.println(ans);
    }
}*/






/*
//Find Missing number by using XOR method(Optimal Approach)
import java.util.*;
class MissingNumber{
    static int Missing_Number(int[] arr,int N){
        int xor1=0,xor2=0;
        for(int i=0;i<N-1;i++) {
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i + 1);
        }
        xor1=xor1^N;
        int missing_num=xor1^xor2;
        return missing_num;
        }
    public static void main(String[] args){
        int[] arr={1,2,3,4,0};
        int N=arr.length;
        int ans=Missing_Number(arr,N);
        System.out.println(ans);
    }
    }
*/






/*
//Find the missing number from the given array by XOR accurate method
import java.util.*;
class MissingNum{
    static int Missing_Number(int[] arr) {
        int N = arr.length;
        for (int i = 0; i < arr.length; i++) {
            N ^= arr[i];
            N ^= i;
        }
        return N;
    }
    public static void main(String[] args){
        int[] arr={2,0,1};
        int ans=Missing_Number(arr);
        System.out.println(ans);

    }
}
*/





/*//Find the Missing Number by using summation method(Accurate method)
import java.util.*;
class MissingNum{
    static int Missing_Number(int[] arr){
        int N=arr.length;
        int sum=N*(N+1)/2;
        for(int i=0;i<arr.length;i++){
            sum-=arr[i];
        } return sum;
    }
    public static void main(String[] args){
        int[] arr={2,0,1};
        int ans=Missing_Number(arr);
        System.out.println(ans);

    }

}*/






/*
//Find the Missing Number by using binary search method (not a accurate method)
import java.util.*;
class Missing_Number{
    static int Missing_Number(int[] arr){
        Arrays.sort(arr);
        int left=0, right=arr.length,mid=left+right/2;
        while(left<right){
            if (arr[mid] > mid)
                right = mid;

            else
                left = mid + 1;


        }return left;
        }
    public static void main(String[] args){
        int[] arr={1,2,0};
        int ans=Missing_Number(arr);
        System.out.println(ans);

    }
    }
*/





/*
//Calculate the Maximum consecutive "1" numbers
import java.util.*;
class CalConsecutiveNum{
    static int Cal_Consecutive(int[] arr) {
        int count = 0;
        int maxi=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                    count++;
            }
            else {
                count = 0;
            }
            maxi=Math.max(maxi,count);
        }  return maxi;
    }
    public static void main(String[] args){
        int[] arr={0,1,1,1};
        int ans=Cal_Consecutive(arr);
        System.out.println(ans);

    }

}
*/






/*
//Calculate the Maximum Consecutive "1" numbers (if M is the error: that means M number  of zero present in the given array are 1)
import java.util.*;
class MaxConsecutive{
    static int Max_Consecutive(int[] vehicle, int M, int N){
        int count=0,zero_count=0,max=0,start=0;
        while(count<N) {

            if (vehicle[count] == 0) {
                //it will calculate number of zero_count elements
                zero_count++;
            }
            //if zero_count is greater than M then start will increase (that means start will increase until zero_count>M
            //so that the zero_count will become equal to M and those zero_count value will be counted as 1
            while (zero_count > M) {
                if (vehicle[start] == 0) {
                    zero_count--;
                }
                start++;
            }
            count++;
        max=Math.max(max,count-start);
            }return max;
        }
        public static void main(String[] args){
        int[] vehicle={1,0,1,1,1,0,1,1,0};
        int N=vehicle.length;
        int ans=Max_Consecutive(vehicle,2,N);
            System.out.println(ans);
    }
}


*/






/*
//Given a non-empty array of integers arr, every element appears twice except for one. Find that single one by using hashing approach
import java.util.*;
class Solution{
    static int One_FreqNum(int[] arr,int N){
        int[] Hash=new int[N+1];
        for(int i=0;i<N;i++) {
            Hash[arr[i]]++;
        }
        for(int i=0;i<N;i++){
            if(Hash[arr[i]]==1)
                return arr[i];
        } return -1;
    }
    public static void main(String[] args){
        int[] arr={1,1,2,2,3,3,4,5,5};
        int N=arr.length;
        int ans=One_FreqNum(arr,N);
        System.out.println(ans);
    }
}


*/









/*
//if in the given array all elements appears twice except one element then find that one element which appears ones by using brute force approach
import java.util.*;
class Solution{
    static int Find_One_NumFreq(int[] nums){
        int N=nums.length;
        for(int i=0;i<N;i++){
            int num=nums[i];
            int count=0;
            for( int j=0;j<N;j++){
                if(nums[j]==num){
                    count++;
                }
            }
            if(count==1)
                return num;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums={1,1,2,2,3,3,4,5,5};
        int ans=Find_One_NumFreq(nums);
        System.out.println(ans);
    }

}

*/






/*
//if in the given array all elements appears twice except one element then find that one element which appears ones by using hashing approach
import java.util.*;
class Solution{
    static int Find_One_NumFreq(int[] nums){
        int N=nums.length;
        int maxi=nums[0];
        for(int i=0;i<N;i++) {
            maxi = Math.max(maxi, nums[i]);
        }
        int[] hash=new int[maxi+1];
        for(int i=0;i<N;i++) {
            hash[nums[i]]++;
        }
        for(int i=0;i<N;i++){
            if(hash[nums[i]]==1)
                return nums[i];
        }return -1;
        }
    public static void main(String[] args){
        int[] nums={1,1,2,2,3,3,4,5,5};
        int ans=Find_One_NumFreq(nums);
        System.out.println(ans);
    }

    }

*/




/*
//if in the given array all elements appears twice except one element then find that one element which appears ones by using HashMap approach
import java.util.*;
class Solution{
    static int Find_One_NumFreq(int[] nums) {
        int N = nums.length;
        HashMap<Integer, Integer> data = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int value = data.getOrDefault(nums[i], 0);
            data.put(nums[i], value + 1);
        }
        for (Map.Entry<Integer, Integer> info : data.entrySet()) {
            if (info.getValue() == 1) {
                return info.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums={1,1,2,2,3,3,4,5,5};
        int ans=Find_One_NumFreq(nums);
        System.out.println(ans);
    }

}

*/





/*
//if in the given array all elements appears twice except one element then find that one element which appears ones by using XOR approach
import java.util.*;
class Solution{
    static int Find_One_NumFreq(int[] nums) {
        int N=nums.length;
        int xor=0;
        for(int i=0;i<N;i++) {
            xor = xor ^ nums[i];
        }
        return xor;
        }
    public static void main(String[] args){
        int[] nums={1,1,2,2,3,3,4,5,5};
        int ans=Find_One_NumFreq(nums);
        System.out.println(ans);
    }
    }

*/






/*
//Find  the sum of sub-arrays is equal to k  with maximum length by using three for loop(Brute force approach)
import java.util.*;
class MaxSubArray{
    static int Max_SubArray(int[] arr,int k) {
        int N = arr.length;
        int max_length = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                long s=0;
                for (int m = i; m <= j; m++) {
                    s += arr[m];
                }
                if (s == k) {
                    max_length = Math.max(max_length, j - i + 1);
                }
            }
        }
        return max_length;
    }
    public static void main(String[] args){
        int[] arr={1,1,1,4,2,1,2,3,4,2};
        int ans=Max_SubArray(arr,3);
        System.out.println(ans);
                }
            }

*/







/*
//Find the sum of the sub-arrays equal to k with maximum length by using two for loop( better approach)
import java.util.*;
class Max_LengthSubArray{
    static int Max_Length_SubArray(int[] arr,int k){
        int N=arr.length;
        int length=0;
        for(int i=0;i<N;i++){
            long s=0;
            for(int j=i;j<N;j++) {
                s += arr[j];
            if(s==k) {
                length = Math.max(length, j - i + 1);
            }
            }
        } return length;
    }
    public static void main(String[] args){
    int[] arr={1,1,1,2,1,1,1,2,2};
    int ans=Max_Length_SubArray(arr,4);
        System.out.println(ans);
    }
}

*/








/*
//Find the maximum length of the sub-array whose sum equal to k by using HashMap
import java.util.*;
class MaxLength_SubArray{
    static int Max_LengthSubArray(int[] arr,int k) {
        int N = arr.length;
        int max_length = 0;
        long sum = 0;
        HashMap<Long, Integer> data = new HashMap<>();
        for (int i = 0; i < N; i++) {
            sum += arr[i];
            if (sum == k) {
                max_length = Math.max(max_length, i + 1);
            }
            long rem = sum - k;
            if (data.containsKey(rem)) {
                int len = i - data.get(rem);
                max_length = Math.max(max_length, len);
            }
            if (!data.containsKey(sum)) {
                data.put(sum, i);
            }
        } return max_length;
    }
    public static void main(String[] args){
        int[] arr={1,1,1,1,1,2,3,2};
        int ans=Max_LengthSubArray(arr,4);
        System.out.println(ans);

        }
    }


*/







/*
//Find the maximum length of the sub-arrays whose sum=k by using two pointer approach
import java.util.*;
class Max_LengthSubArray{
static int Max_Length_SubArray( int[] arr,int k){
    int N=arr.length;
    int left=0,right=0,max_length=0;
    long sum=arr[0];
    while(right<N){
        while(left<=right && sum>k ){
                sum -= arr[left];
                left++;
            }
            if(sum==k) {
                max_length = Math.max(max_length, right - left + 1);
            } right++;
            if(right<N) {
                sum += arr[right];
            }
            } return max_length;
        }
    public static void main(String[] args){
        int[] arr={1,1,1,1,1,2,3,2};
        int ans=Max_Length_SubArray(arr,4);
        System.out.println(ans);

    }

    }

*/






/*
//Find the sum of the longest sub-array equal to k value from the given array by using Map
import java.util.*;
class Long_Sub_Array{
    static int Long_SubArray(int[] arr,int k){
        int N=arr.length;
        int sum=0;
        int max_len=0;
        Map<Integer,Integer> data=new HashMap<>();
        for(int i=0;i<N;i++) {
            sum += arr[i];
        if(sum==k) {
            max_len = Math.max(max_len, i + 1);
        }
        int rem=sum-k;
        if(data.containsKey(rem)) {
            int len = i - data.get(rem);
            max_len = Math.max(max_len, len);
        }
        if(!data.containsKey(sum)) {
            data.put(sum, i);
        }
        }return max_len;
        }

        public static void main(String[] args){
        int[] arr={2,2,3,4,5,6};
        int ans=Long_SubArray(arr,4);
            System.out.print(ans);
    }
}

*/





/*
//Find the sum of the longest sub-array equal to k value from the given array by using two for loop approach
import java.util.*;
class LongestSubArray{
    static int Longest_SubArray(int[] arr,int k){
        int N=arr.length;
        int len=0;
        for(int i=0;i<N;i++){
            int sum=0;
            for(int j=i;j<N;j++) {
                sum += arr[j];
            if(sum==k){
                len=Math.max(len,j-i+1);
            }
        }
    }return len;
}
public static void main(String[] args){
    int[] arr={2,2,3,4,5,6};
    int ans=Longest_SubArray(arr,7);
    System.out.println(ans);
    }
}
*/








/*
//Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.
import java.util.*;
class CheckRead{
    static String Check_Read(int[] Book, int Target, int N){
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
               if( Book[i]+Book[j]==Target)return "YES";
            }
        }return "NO";
    }
    public static void main(String[] args){
        int[] Book={2,2,3,4,5,6};
        int N=Book.length;
        String ans=Check_Read(Book,12,N);
        System.out.println(ans);
    }

}

*/





/*
//Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.
import java.util.*;
class CheckSumPair{
    static String Check_Sum_Pair(int[] nums,int Target){
        int N=nums.length;
        HashMap<Integer,Integer> data=new HashMap<>();
        for(int i=0;i<N;i++) {
            int num = nums[i];
            int val = Target - num;
            if (data.containsKey(val)) {
                return "YES";
            }
            data.put(nums[i], i);
        }return "NO";

        }
        public static void main(String[] args){
        int[] nums={1,2,1,3,4,2};
        String ans=Check_Sum_Pair(nums,8);
            System.out.println(ans);
    }
}
*/








/*
//Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1} by using two for loop(Brute force approach)
import java.util.*;
class Indices{
    static int[] Find_Indices(int[] nums,int Target){
        int N=nums.length;
        int[] ans=new int[2];
        ans[0]=ans[1]=-1;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(nums[i]+nums[j]==Target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }return ans;
    }
    public static void main(String[] args){
        int[] nums={1,2,1,3,4,2};
        int[] ans=Find_Indices(nums,6);
        System.out.println("The index of two array elements that is equals to Target is:"+ans[0]+"," +ans[1]+ " ");
    }
}


*/





/*
//Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1} by using HashMap
import java.util.*;
class FindIndices{
    static int[] Find_Indices(int[] nums,int Target){
        int N=nums.length;
        int[] ans=new int[2];
        ans[0]=ans[1]=-1;
        HashMap<Integer,Integer> data=new HashMap<>();
        for(int i=0;i<N;i++){
            int num=nums[i];
            int MoreNeeded=Target-num;
            if(data.containsKey(MoreNeeded)){
                ans[0]=data.get(MoreNeeded);
                ans[1]=i;
                return ans;
            }
            data.put(nums[i],i);
        }return ans;

    }public static void main(String[] args){
        int[] nums={1,2,1,3,4,2};
        int[] ans=Find_Indices(nums,6);
        System.out.println("The index of two array elements that is equals to Target is:"+ans[0]+"," +ans[1]+ " ");
    }

}


*/






/*
//Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1} by using two pointer approach
import java.util.*;
class FindIndices{
    static String Check_PairSum(int[] arr,int Target){
        int N=arr.length;
        Arrays.sort(arr);
        int left=0,right=N-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==Target){
                return "YES";
            }
            else if(sum<Target)left++;
            else right--;
        }return "NO";
    }
    public static void main(String[] args){
        int[] arr={1,2,1,3,4,2};
        String ans=Check_PairSum(arr,6);
        System.out.println(ans);
    }
}

*/





/*
//Sort the given array in increasing order by using Selection Sort Algorithm
import java.util.*;
class Sorting{
    static void Sort_Array(ArrayList<Integer> arr, int N){
        for(int i=0;i<N-1;i++){
            int mini=i;
            for(int j=i+1;j<N;j++) {
                if (arr.get(i) > arr.get(j)) {
                    mini = j;
                }
            }
                //Swapping
                int temp=arr.get(i);
                arr.set(i,arr.get(mini));
                arr.set(mini,temp);
            }
        for(int i=0;i<N;i++){
            System.out.print(arr.get(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(new Integer[]{2,2,2,2,1,1,1,0,0,0}));
        int N=arr.size();
        Sort_Array(arr,N);
        }
    }
*/





/*
//Sort the given un-sorted algorithm in the increasing order by using cnt variable method
import java.util.*;
class SortArray {
    static void Sort_Array(ArrayList<Integer> arr, int N) {
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < N; i++) {
            if (arr.get(i) == 0) cnt0++;
            else if (arr.get(i) == 1) cnt1++;
            else {
                cnt2++;
            }
        }
        for (int i = 0; i < cnt0; i++) arr.set(i, 0);
        for (int i = cnt0; i < cnt0 + cnt1; i++) arr.set(i, 1);
        for (int i = cnt0 + cnt1; i < N; i++) arr.set(i, 2);
    }
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(new Integer[]{2,2,2,2,0,0,1,1,1}));
        int N=arr.size();
        Sort_Array(arr,N);
        System.out.println("The  Sorting array is: ");
        for(int i=0;i<N;i++){
            System.out.print(arr.get(i)+ " ");
        }
    }
}

*/









/*
//Sort the Array in increasing order by using 3 pointer method(Dutch National Flag Algorithm)
import java.util.*;
class SortArray{
    static void Sort_Array(ArrayList<Integer> arr,int N){
        int low=0,high=N-1,mid=0;
        while(mid<=high) {
            if (arr.get(mid) == 0) {
                //swap arr[low] & arr[mid]
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);
                low++;
                mid++;
            } else if (arr.get(mid) == 1) {
                mid++;
            } else {
                //swap arr[mid] & arr[high]
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);
                high--;
            }
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(new Integer[]{2,2,2,2,0,0,1,1}));
        int N=arr.size();
        Sort_Array(arr,N);
        System.out.println("The Sorted array is:");
        for(int i=0;i<N;i++){
            System.out.print(arr.get(i)+ " ");
        }
    }
}

*/






/*
//Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//You must solve this problem without using the library's sort function.
import java.util.*;
class Solution {
public static void sortColors(int[] nums) {
        int N=nums.length;
        int red=0,white=1,blue=2;
        int low=0,high=N-1,mid=0;
        while(mid<=high){
        if(nums[mid]==red){
        //swap nums[mid] & nums[low]
        int temp=nums[mid];
        nums[mid]=nums[low];
        nums[low]=temp;
        low++;
        mid++;
        }
        else if(nums[mid]==white){
        mid++;
        }
        else{
        //swap nums[mid] & nums[high]
        int temp=nums[mid];
        nums[mid]=nums[high];
        nums[high]=temp;
        high--;
        }
        }
        }
public static void main(String[] args){
        int[] nums={2,0,2,1,1,0};
        sortColors(nums);
        for(int i=0;i<nums.length;i++){
        System.out.print(nums[i]+ " ");
        }

        }
        }

*/






/*
//Find the majority elements in the array that appears more than N/2 times by using hashing
import java.util.*;
class MajorityElement{
    static int Majority_ArrayElement(int[] arr, int N){
        int[] hash=new int[N+1];
        for(int i=0;i<N;i++) {
            hash[arr[i]]++;
        }
        for(int i=0;i<N;i++){
            if(hash[arr[i]]>N/2){
                return arr[i];}
        }return -1;
    }
    public static void main(String[] args){
        int[] arr={3,1,3};
        int N=arr.length;
        int ans=Majority_ArrayElement(arr,N);
        System.out.println("The Majority Array Element which appear more than N/2 is:" +ans);
    }
}

*/






/*
//Find the majority elements in the array that appears more than N/2 times by using HashMap
import java.util.*;
 class Solution {
    public static int majorityElement(int []v) {
        // Write your code here
        int N=v.length;
        HashMap<Integer,Integer>data=new HashMap<>();
        for(int i=0;i<N;i++){
            int val=data.getOrDefault(v[i],0);
            data.put(v[i],val+1);
        }
        for(Map.Entry<Integer,Integer> info:data.entrySet()){
            if(info.getValue()>N/2){
                return info.getKey();
            }
        }return -1;
    }

    public static void main(String[] args){
        int[] v={2,2,1,3,1,1,3,1,1};
        int ans=majorityElement(v);
        System.out.print(v);
    }
}

*/




/*//Find the majority elements in the array that appears more than N/2 times by using two for loop
import java.util.*;
class MajorityElement{
    static int Majority_Element(int[] arr){
        int N=arr.length;
        for(int i=0;i<N;i++){
            int cnt=0;
            for(int j=0;j<N;j++) {
                if (arr[j] == arr[i]) {
                    cnt++;
                }
            }
            if(cnt>N/2)
                return arr[i];
            }return -1;
        }
    public static void main(String[] args){
        int[] arr={3,2,3};
        int ans=Majority_Element(arr);
        System.out.print(ans);
    }
    }*/










/*
//Find the majority elements in the array that appears more than N/2 times by using Moore's Voting Algorithm
import java.util.*;
class MajorityElement{
    static int Majority_Element(int[] arr){
        int N=arr.length;
        int cnt=0,el=0;
            for(int i=0;i<N;i++) {
                if (cnt == 0) {
                    cnt = 1;
                    el = arr[i];
                } else if (el == arr[i]) {
                    cnt++;
                } else {
                    cnt--;
                }
            }
            int cnt1=0;
            for(int i=0;i<N;i++) {
                if (arr[i] == el) {
                    cnt1++;
                }
            }
            if(cnt1>N/2){
                return el;
        }return -1;
    }
    public static void main(String[] args){
        int[] arr={1,1,2,2,3,3,1,1,1};
        int ans=Majority_Element(arr);
        System.out.println("The Majority Elements in the array is:" +ans);
    }
}


*/






/*
//Find the Maximum Sum of any sub-arrays by using three for loop (Brute force approach)
import java.util.*;
class MaxSum{
    static int Max_Sum(int[] arr){
        int N=arr.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                int sum=0;
                for(int k=i;k<j;k++){
                    sum+=arr[k];
                    maxi=Math.max(maxi,sum);
                }
            }
        }return maxi;
    }public static void main(String[] args){
        int[] arr={1,2,7,-4,3,2,-10,9,1};
        int n=arr.length;
        long ans=Max_Sum(arr);
        System.out.println(ans);
    }
}

*/



/*
//Find the Maximum Sum of any sub-arrays by using two for loop (Better approach)
import java.util.*;
class Solution {
    public static int maxSubArray(int[] nums) {
        int N=nums.length;
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<N;i++){
           sum+=nums[i];
           maxi=Math.max(maxi,sum);
        }return maxi;
    }
    public static void main(String[] args){
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int ans=maxSubArray(nums);
        System.out.println(ans);
    }
}

*/




/*
//Find the maximum sum of any sub-array from the given array by single loop & Long data type(Optimal approach)
import java.util.* ;
import java.io.*;

 class Solution {

    public static long maxSubarraySum(int[] arr, int n) {
        // write your code here
        long maxi=Long.MIN_VALUE;
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>maxi){
                maxi=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        if(maxi<0){
            maxi=0;
        }return maxi;
    }
    public static void main(String[] args){
        int[] arr={1,2,7,-4,3,2,-10,9,1};
        int n=arr.length;
        long ans=maxSubarraySum(arr,n);
        System.out.println(ans);
    }

}
*/








/*
//Find the sub-arrays whose sum is maximum by using kadane's algorithm
import java.util.*;
class SubArray{
    static long Find_MaxSub_Array(int[] arr) {
        int N = arr.length;
        int start = 0, ansStart = -1, ansEnd = -1;
        long sum = 0;
        long maxi = Long.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (sum == 0)
                start = i;
                sum += arr[i];
                if (sum > maxi) {
                    maxi = sum;
                    ansStart = start;
                    ansEnd = i;
                }
                if (sum < 0) {
                    sum = 0;
                }
            }
        System.out.print("The sub-arrays are[");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();
        return maxi;
    }
    public static void main(String[] args){
        int[] arr={1,4,3,-10,7,9,4,5};
        long ans=Find_MaxSub_Array(arr);
        System.out.println(ans);
    }
}

*/






/*//Buy low price stock and sell this stock on high prices to get maximum profit and stock can not be sold before buying any stock by using Optimal approach
import java.util.*;
class Profit{
    static int Max_Profit(int[] arr){
        int N=arr.length;
        int stock_buy=Integer.MAX_VALUE;
        int stock_sell=Integer.MIN_VALUE;
        int prices;
        for(int i=0;i<N;i++) {
            prices = arr[i];
            stock_buy = Math.min(stock_buy, prices);
            stock_sell = Math.max(stock_sell, prices-stock_buy);
        }
       return stock_sell;
        }
        public static void main(String[] args){
        int[] arr={12,2,1,4,6,1};
        int ans=Max_Profit(arr);
            System.out.println(ans);
    }
}*/



/*
//Buy low price stock and sell this stock on high prices to get maximum profit and stock can not be sold before buying any stock by using Brute Force approach
import java.util.*;
class profit{
    public static int maxProfit(int[] prices) {
        int N = prices.length;
        int stockBuy = Integer.MIN_VALUE;
        int num = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (prices[j] > prices[i]) {
                    stockBuy = Math.max(stockBuy, prices[j] - prices[i]);
                }

            }
        }return stockBuy;
    }
    public static void main(String[] args){
        int[] prices={7,6,3,4,1};
        int ans=maxProfit(prices);
        System.out.println(ans);
    }
}

*/




/*
//Print the given array in positive,negative alternative order by brute force approach
import java.util.*;
class Alternative {
    static int[] Alternative_Order(int[] arr) {
        int N = arr.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (arr[i] > 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }
        for (int i = 0; i < N / 2; i++) {
            arr[2 * i] = pos.get(i);
            arr[2 * i + 1] = neg.get(i);
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -2, 1, -3, -5, -9};
        int[] ans = Alternative_Order(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

*/








/*
//Print the given array in positive,negative alternative order by Optimal approach
import java.util.*;
class Alternative {
    static ArrayList<Integer> Alternative_Order(ArrayList<Integer> arr){
        int N=arr.size();
        ArrayList<Integer> ans=new ArrayList<>(Collections.nCopies(N,0));
        int posIndex=0,negIndex=1;
        for(int i=0;i<N;i++){
            if(arr.get(i)>0) {
                ans.set(posIndex, arr.get(i));
                posIndex += 2;
            }
            else{ans.set(negIndex,arr.get(i));
                negIndex+=2;
            }
        }return ans;
    }
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(new Integer[]{1,2,-9,3,-2,-5}));
        ArrayList<Integer> ans=Alternative_Order(arr);
        for(int i=0;i<arr.size();i++){
            System.out.print(ans.get(i)+ " ");
        }
    }
}

*/






/*
//Find the Next permutation of the given array by using List data type in function and array
import java.util.*;
class NextPermutation{
    static List<Integer> Next_Permutation(List<Integer> A){
        int N=A.size();
        int breakPoint=-1;
        for(int i=N-2;i>=0;i--){
            if(A.get(i)<A.get(i+1)){
                breakPoint=i;
                break;
            }
        }
        if(breakPoint==-1) {
            Collections.reverse(A);
            return A;
        }
        for(int i=N-1;i>breakPoint;i--) {
            if (A.get(i) > A.get(breakPoint)) {
                //swap A[breakPoint] & A[i]
                int temp = A.get(breakPoint);
                A.set(breakPoint, A.get(i));
                A.set(i, temp);
                break;
            }
        }
        List<Integer> subList=A.subList(breakPoint+1,N);
        Collections.reverse(subList);
        return A;


            }
            public static void main(String[] args){
        List<Integer> A=Arrays.asList(new Integer[]{2,1,5,4,3,0,0});
        List<Integer> ans=Next_Permutation(A);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+ " ");
        }
    }
}


*/







/*
//Find the next permutation of the given array by using void  data type in function and int data type in array
import java.util.*;
class NextPermutation{
    static void Next_Permutation(int[] arr){
        int N=arr.length;
        int ind1=-1;
        int ind2=-1;
        //find the breaking point(that means the number i.e arr[i] which is less than arr[i+1] from the right side of the array
        for(int i=N-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                ind1=i;
            break;
            }
        }
        if(ind1==-1){
            reverse(arr,0);
        }
        else{
            //find the number  which is slightly greater than ind1 from ind1<-----N-1
            for(int j=N-1;j>ind1;j--){
                if(arr[j]>arr[ind1]){
                    ind2=j;
                    break;
                }
            }
            //swapping of ind1 & ind2
            swap(arr,ind1,ind2);
            //reverse the numbers from ind+1---->N-1
            reverse(arr,ind1+1);
        }
    }
    public static void reverse(int[] arr,int start){
        int i=start;
        int j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void main(String[] args){
        int[] arr={2,1,5,4,3,0,0};
        Next_Permutation(arr);
        System.out.print("The Next Permutation of the given array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
*/




/*
//Find the Next Permutation by using List data type
import java.util.*;
 class Solution {
    public static List< Integer > nextGreaterPermutation(List< Integer > A) {
        int N=A.size();
        int ind1=-1;
        int ind2=-1;
        for(int i=N-2;i>=0;i--){
            if(A.get(i)<A.get(i+1)){
                ind1=i;
                break;
            }
        }
        if(ind1==-1){
            reverse(A,0);
        }
        else{
            for(int j=N-1;j>ind1;j--){
                if(A.get(j)>A.get(ind1)){
                    ind2=j;
                    break;
                }
            }
            swap(A,ind1,ind2);
            reverse(A,ind1+1);
        }return A;
    }
    public static void reverse(List<Integer> A, int start){
        int i=start;
        int j=A.size()-1;
        while(i<j){
            swap(A,i,j);
            i++;
            j--;
        }
    }
    public static void swap(List<Integer> A,int i,int j){
        int temp=A.get(i);
        A.set(i,A.get(j));
        A.set(j,temp);
    }
    public static void main(String[] args){
        List<Integer> A=Arrays.asList(new Integer[]{1,3,2});
        List<Integer> ans=nextGreaterPermutation(A);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+ " ");
        }
    }
}

*/






/*
//Find the Next Permutation by using ArrayList data type
import java.util.* ;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

 class Solution
{
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation)
    {
        int N=permutation.size();
        int breakPoint=-1;
        for(int i=N-2;i>=0;i--){
            if(permutation.get(i)<permutation.get(i+1)){
                breakPoint=i;
                break;
            }
        }
        if(breakPoint==-1){
            Collections.reverse(permutation);
            return permutation;
        }

        for(int i=N-1;i>breakPoint;i--){
            if(permutation.get(breakPoint)<permutation.get(i)){
                //swap
                int temp=permutation.get(i);
                permutation.set(i,permutation.get(breakPoint));
                permutation.set(breakPoint,temp);
                break;
            }
        }
        List<Integer> subList=permutation.subList(breakPoint+1,N);
        Collections.reverse(subList);
        return permutation;
    }
    public static void main(String[] args){
        ArrayList<Integer> permutation=new ArrayList<>(Arrays.asList(new Integer[]{2,1,3,4}));
        ArrayList<Integer> ans= nextPermutation(permutation);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+ " ");
        }
    }
}
*/








/*
//Find the Superior elements[that means the elements i.e a[i] which is greater than a[i+1]] last element will always be superior element by brute force approach
import java.util.*;
class FindSuperior{
    static List<Integer> Superior_Element(int[] a) {
        int N = a.length;
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            boolean leader = true;
            for (int j = i + 1; j < N; j++) {
                if (a[j] > a[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader) {
                num.add(a[i]);
            }

        }return num;
    }
    public static void main(String[] args){
    int[] a={10, 22, 12, 3, 0, 6};
    List<Integer> ans=Superior_Element(a);
    for(int i=0;i<ans.size();i++){
        System.out.print(ans.get(i)+ " ");
    }
    }
}

*/




/*
//Find the Superior elements[that means the elements i.e a[i] which is greater than a[i+1]] last element will always be superior element by optimal approach
import java.util.*;
class FindSuperior{
   static List<Integer> Superior_Element(int[] a) {
       int N = a.length;
       List<Integer> num = new ArrayList<>();
       int max = a[N - 1];
       num.add(a[N - 1]);
       for (int i = N - 2; i >= 0; i--) {
           if (a[i] > max) {
               num.add(a[i]);
               max = a[i];
           }
       } return num;
   }
   public static void main(String[] args){
   int[] a={1,3,2,1};
   List<Integer> ans=Superior_Element(a);
   Collections.sort(ans);
   for(int i=0;i<ans.size();i++){
       System.out.print(ans.get(i)+ " ");
   }
   }
}

*/







/*
//Find the number of successive elements whose diff is -1 in the decreasing sequence by using brute force method
import java.util.*;
class SuccessiveElement{
    static boolean LinearSearch(int[] arr, int num) {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            if (arr[i] == num)
                return true;
        }
        return false;
    }
    static int SuccessiveNumber(int[] arr){
    int N=arr.length;
    int longest=1;
    for(int i=0;i<N;i++){
    int x=arr[i];
    int cnt=1;
    while(LinearSearch(arr,x+1)==true) {
        x += 1;
        cnt += 1;
    }
    longest=Math.max(longest,cnt);

        }return longest;
    }
    public static void main(String[] args){
        int[] arr={3,2,1,4,5,8};
        int ans=SuccessiveNumber(arr);
        System.out.println(ans);
    }
}
*/








/*
//Find the number of successive elements whose diff is -1 in the decreasing sequence by using optimal 1 approach
import java.util.*;
class SuccessiveElement{
    static int Successive_Element(int[] a){
        int N=a.length;
        int last_number=Integer.MIN_VALUE;
        int longest=1;
        int cnt=1;
        if(N==0)return 0;
        Arrays.sort(a);
        for(int i=0;i<N;i++){
            if(a[i]-1==last_number) {
                cnt += 1;
                last_number = a[i];
            }
            else if(a[i]!=last_number) {
                cnt = 1;
                last_number = a[i];
            }
            longest=Math.max(longest,cnt);
            }return longest;
        }
        public static void main(String[] args){
        int[] a={2,3,1,5,4,9};
        int ans=Successive_Element(a);
            System.out.println(ans);

    }
}


*/







/*
//Find the successive elements[the elements which are increasing by +1 to previous number] length by optimal approach 2
import java.util.*;
class SuccessiveElement{
    static int Successive_Element(int[] a){
        int N=a.length;
        int longest=1;
        Set<Integer> data= new HashSet<>();
        for(int i=0;i<N;i++) {
            data.add(a[i]);
        }
        if(N==0)return 0;
        for(int info:data){
            if(!data.contains(info-1)){
                int cnt=1;
                int x=info;
                while(data.contains(x+1)) {
                    cnt = cnt + 1;
                    x = x + 1;
                }
                longest=Math.max(longest,cnt);
                }
            }return longest;
        }
        public static void main(String[] args){
        int[] a={1,3,2,4,5,6,8};
        int ans=Successive_Element(a);
            System.out.println(ans);
    }
}

*/









/*
//Set the given matrix as Zero matrix [that means if any row or column contain any zero number then convert that row and column as zero by using Brute force approach
import java.util.*;
class SetZeroMatrix{
    //set all non-zero elements at row i as -1
    public static void markRow(ArrayList<ArrayList<Integer>> matrix,int n, int m, int i) {
        for (int j = 0; j < m; j++) {
            if (matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1);
            }
        }
    }
    //set all non-zero elements at column j as -1
    public static void markColumn(ArrayList<ArrayList<Integer>> matrix,int n, int m,int j) {
        for (int i = 0; i < n; i++) {
            if (matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1);
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> Set_ZeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m){
       //set all 0 containing row & column as -1 and please do not convert 0 to -1
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).get(j)==0){
                    markRow(matrix, n, m, i);
                    markColumn(matrix,n,m,j);
                }
            }
        }
        //Finally set -1 as 0
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).get(j)==-1){
                    matrix.get(i).set(j,0);
                }
            }
        } return matrix;
    }
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,0,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        int n=matrix.size();
        int m=matrix.get(0).size();
        ArrayList<ArrayList<Integer>> ans=Set_ZeroMatrix(matrix,n,m);
        for(ArrayList<Integer> val:ans){
            for(Integer info:val){
                System.out.print(info+ " ");
            }
            System.out.println();
        }
    }
}


*/








/*
//Set the given matrix as Zero matrix [that means if any row or column contain any zero number then convert that row and column as zero by using two marker(row & column)
import java.util.*;
class SetZeroMatrix{
static ArrayList<ArrayList<Integer>> Set_ZeroMatrix(ArrayList<ArrayList<Integer>> matrix,int n,int m){
    int[] row=new int[n];
    int[] column=new int[m];
    //if any row or column contain any 0 then mark it as 1 in row[i] & column[j]
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(matrix.get(i).get(j)==0){
                row[i]=1;
                column[j]=1;
            }
        }
    }
    //If 1 is marked in row[i] & column[j] then set them as 0
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(row[i]==1 || column[j]==1){
                matrix.get(i).set(j,0);
            }
        }
    } return matrix;
}
public static void main(String[] args){
    ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
    matrix.add(new ArrayList<>(Arrays.asList(2,3,4)));
    matrix.add(new ArrayList<>(Arrays.asList(8,0,0)));
    int n=matrix.size();
    int m=matrix.get(0).size();
    ArrayList<ArrayList<Integer>> ans=Set_ZeroMatrix(matrix,n,m);
    for(ArrayList<Integer> val:ans){
        for(Integer info:val){
            System.out.print(info+ " ");
        }
        System.out.println();
    }
}
}

*/








/*
//set Zero Matrix if any zero available in any row or column by using optimal approach
import java.util.*;
class ZeroMatrix{
    static ArrayList<ArrayList<Integer>> Zero_Matrix(ArrayList<ArrayList<Integer>> matrix, int n, int m){
        int col0=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).get(j)==0){
                    matrix.get(i).set(0,0);
                    if(j!=0){
                        matrix.get(0).set(j,0);
                    }
                    else{
                        col0=0;
                    }
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix.get(i).get(j)!=0){
                    if(matrix.get(i).get(0)==0 || matrix.get(0).get(j)==0){
                        matrix.get(i).set(j,0);
                    }
                }
            }
        }
        if(matrix.get(0).get(0)==0){
            for(int j=0;j<m;j++){
                matrix.get(0).set(j,0);
            }
        }
        if(col0==0){
            for(int i=0;i<n;i++){
                matrix.get(i).set(0,0);
            }
        }return matrix;
    }
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(2,3,4)));
        matrix.add(new ArrayList<>(Arrays.asList(8,0,0)));
        int n=matrix.size();
        int m=matrix.get(0).size();
        ArrayList<ArrayList<Integer>> ans=Zero_Matrix(matrix,n,m);
        for(ArrayList<Integer> val:ans){
            for(Integer info:val){
                System.out.print(info+ " ");
            }
            System.out.println();
        }
    }
}

*/









/*
//set the zero matrix [that means if any row or column contains 0 then that whole row or column will set as 0 by using void function & Integer data type brute force approach
import java.util.*;
class SetZeroMatrix{
    public static void Set_ZeroMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] matrix2 = new int[n][m];
        //copy matrix[i][j] into matrix2[i][j]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix2[i][j] = matrix[i][j];
            }
        }
        //if matrix[i][j]==0 then set matrix2[i][k]=0 & matrix2[k][j]=0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < n; k++) {
                        matrix2[i][k] = 0;
                        matrix2[k][j] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = matrix2[i][j];
            }
        }
    }
        public static void main(String[] args){
        int[][] matrix={{1,2,3},{1,0,0}};
        int n=matrix.length;
        int m=matrix[0].length;
        Set_ZeroMatrix(matrix);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }}


*/







/*
//set the zero matrix [that means if any row or column contains 0 then that whole row or column will set as 0 by using void function & Integer data type better approach
import java.util.*;
class SetZeroMatrix {
    public static void Set_ZeroMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] row = new int[n];
        int[] column = new int[m];
        Arrays.fill(row, 1);
        Arrays.fill(column, 1);
        //if matrix[i][j]==0 then mark row[i]=0 & column[j]=0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 0;
                    column[j] = 0;
                }
            }
        }

        //if row[i]==0 || column[j]==0 then matrix[i][j]==0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 0 || column[j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {2, 0, 9, 0}};
        Set_ZeroMatrix(matrix);
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

*/











/*
//set the zero matrix [that means if any row or column contains 0 then that whole row or column will set as 0 by using void function & Integer data type by optimal approach
import java.util.*;
class SetZeroMatrix {
    public static void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean isrow0=false;
        boolean iscol0=false;
        for(int j=0;j<m;j++){
            if(matrix[0][j]==0){
                isrow0=true;
            }
        }

        for(int i=0;i<n;i++){
            if(matrix[i][0]==0){
                iscol0=true;
            }
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }

        if(isrow0){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }
        if(iscol0){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }

    }
    public static void main(String[] args){
        int[][] matrix={{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

    }
}


*/








/*
//Rotate the matrix into 90 degree angle by using another dummy matrix [Brute force approach]
import java.util.*;
class Rotate_Matrix{
    static int[][] Rotate_90degreeMatrix(int[][] matrix){
        int n=matrix.length;
        int[][] Rotate=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                Rotate[j][n-1-i]=matrix[i][j];
            }
        }return Rotate;
    }
    public static void main(String[] args){
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int[][] ans=Rotate_90degreeMatrix(matrix);
        System.out.println("The matrix after Rotating to 90 degree angle is:");
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans.length;j++){
                System.out.print(ans[i][j]+ " ");
            }
            System.out.println();
        }
    }
}


*/





/*

//Rotate the matrix by 90-degree angle by using optimal approach
import java.util.*;
class RotateMatrix{
    static int[][] Rotate_90degreeMatrix(int[][] matrix){
        int n=matrix.length;
        //1st row swapped to 1st column , 2nd row swapped to 2nd column , 3rd row swapped to 3rd column
        for(int i=0;i<n;i++){
            for(int j=i;j<matrix.length;j++){
                int  temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //Reversing the all rows
        for(int i=0;i<n;i++){
            for(int j=0;j<matrix.length/2;j++){
                int  temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        } return matrix;

    }
    public static void main(String[] args){
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int[][] ans=Rotate_90degreeMatrix(matrix);
        System.out.println("The matrix after Rotating to 90-degree angle is:");
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans.length;j++){
                System.out.print(ans[i][j]+ " ");
            }
            System.out.println();
        }
    }
}*/









/*
//Return the all elements of matrix in spiral by using order optimal approach

import java.util.*;
class ReturnSpriralOrder {
    static List<Integer> Return_SpiralOrder(int[][] matrix) {
        List<Integer> data = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0, right = m - 1, top = 0, bottom = n - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                data.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                data.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    data.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    data.add(matrix[i][left]);
                }
            } left++;
        }
        return data;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 7}, {4, 5, 6, 9}, {3, 2, 1, 4}};
        List<Integer> ans = Return_SpiralOrder(matrix);
        System.out.println("The array elements in spiral order:");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}

*/





/*
//Return Spiral order number from the given matrix into array by using int data type function
import java.util.*;
 class Solution {
    public static int[] spiralMatrix(int [][]MATRIX) {
        // Write your code here.
        int n=MATRIX.length;
        int m=MATRIX[0].length;
        int[] ans=new int[n*m];
        int k=0;
        int left=0,top=0,right=m-1,bottom=n-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                ans[k++]=MATRIX[top][i];
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans[k++]=MATRIX[i][right];
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans[k++]=MATRIX[bottom][i];
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans[k++]=MATRIX[i][left];
                }
                left++;
            }

        }return ans;
    }

    public static void main(String[] args){
        int[][] MATRIX={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int[] ans=spiralMatrix(MATRIX);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+ " ");
        }
    }
}

*/







/*
//Find the number of sub-arrays whose sum is equal to k by using three loop[Brute force approach]
import java.util.*;
class NumberOfSubArray {
    static int Number_OfSubArray(int[] nums, int k) {
        int N = nums.length;
        int  count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int sum = 0;
                for (int m = i; m <= j; m++) {
                    sum += nums[m];
                }
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,2,4};
        int ans=Number_OfSubArray(nums,6);
        System.out.println(ans);

    }
}

*/







/*
//Find the number of sub-arrays whose sum is equal to k by using two loop[Better force approach]
import java.util.*;
class NumberOfSubArray {
    static int Number_OfSubArray(int[] nums, int k) {
        int N = nums.length;
        int count = 0;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2};
        int ans = Number_OfSubArray(nums, 6);
        System.out.println(ans);
    }
}


*/









/*
//Find the number of sub-arrays whose sum is equal to k by using HashMap[Optimal Approach]
import java.util.*;
import java.util.HashMap;
class FindSubArray{
    static int Number_OfSubArray(int[] nums, int k){
        int N=nums.length;
        Map<Integer,Integer> data=new HashMap<>();
        int count=0,preSum=0;
        data.put(0,1);
        for(int i=0;i<N;i++){
            preSum+=nums[i];

            int remove=preSum-k;

          count+=  data.getOrDefault(remove,0);
            data.put(preSum,data.getOrDefault(preSum,0)+1);
        }return count;

    }
    public static void main(String[] args){
        int[] nums={1,2,3,2,2,4};
        int ans=Number_OfSubArray(nums,6);
        System.out.println(ans);
    }
}


*/









/*
//Find the particular (row, column) array element in pascal triangle
import java.util.*;
class PascalTriangle{
    static long nCr(int row,int column){
        long res=1;
        for(int i=0;i<column;i++) {
            res = res * (row - i);
            res = res / (i+1);
        }
        return  res;
    }
    static int PascalTriangle(int row,int column){
        int element=(int) nCr(row-1,column-1);
        return element;
    }
    public static void main(String[] args){
        int row=5,column=3;
        int ans=PascalTriangle(row,column);
        System.out.println(ans);
    }
}


*/








/*
//Find Nth row elements in pascal triangle by using brute force approach
import java.util.*;
class Pascal_Triangle{
    static long nCr(int row , int column){
        long res=1;
        for(int i=0;i<column;i++){
            res=res*(row-i);
            res=res/(i+1);
        }
        return res;
    }
    static void PascalTriangle(int N){
        for(int column=1;column<=N;column++){
            System.out.print((int) nCr(N-1,column-1)+ " ");
        }
        System.out.println();

    }
    public static void main(String[] args){
        int N=5;
        PascalTriangle(N);
    }
}


*/








/*
//Find Nth Row elements in pascal Triangle by using optimal approach
import java.util.*;
class Pascal_Triangle{
    static void PascalTriangle(int N){
        int ans=1;
        System.out.print(ans+ " ");
        for(int i=1;i<N;i++){
            ans=ans*(N-i);
            ans=ans/i;
            System.out.print(ans+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int N=5;
        PascalTriangle(N);
    }
}
*/









/*
//Return  the full pascal Triangle of Nth row by using brute force approach
import java.util.*;
class PascalTriangle{
    static int nCr(int row,int column){
        long res=1;
        for(int i=0;i<column;i++){
            res=res*(row-i);
            res=res/(i+1);
        }
        return(int) res;
    }
    static List<List<Integer>> Pascal_Triangle(int N){
        List<List<Integer>> ans=new ArrayList<>();
        for(int row=1;row<=N;row++){
            List<Integer> tempList=new ArrayList<>();
            for(int column=1;column<=row;column++){
                tempList.add(nCr(row-1,column-1));
            }
            ans.add(tempList);
        }return ans;
    }
    public static void main(String[] args){
        int N=5;
        List<List<Integer>> ans=Pascal_Triangle(N);
        for(List<Integer> info:ans){
            for(int val:info){
                System.out.print(val+ " ");
            }
            System.out.println();
        }
    }
}


*/







/*
//Return the full Pascal Triangle of Nth Row by using optimal Approach
import java.util.*;
class PascalTriangle{
    static List<Integer> generateRow(int row){
        long res=1;
        List<Integer> ans=new ArrayList<>();
        ans.add(1);
        for(int column=1;column<row;column++){
            res=res*(row-column);
            res=res/column;
            ans.add((int)res);
        } return ans;
    }
    static List<List<Integer>> Pascal_Triangle(int N){
        List<List<Integer>> ans=new ArrayList<>();
        for(int row=1;row<=N;row++){
            ans.add(generateRow(row));
        } return ans;
    }
    public static void main(String[] args){
        int N=5;
        List<List<Integer>> element=Pascal_Triangle(N);
        for(List<Integer> info:element){
            for(int val:info){
                System.out.print(val+ " ");
            }
            System.out.println();
        }
    }
}



*/







/*
//Return Full Pascal Triangle by using Integer data type 2-D array function
import java.util.*;
class PascalTriangle{
    static int[] generateRow(int row){
        int[] arr=new int[row];
        int res=1;
        arr[0]=1;
        for(int i=1;i<row;i++){
            res=res*(row-i);
            res=res/i;
            arr[i]=res;
        }
        return arr;
    }
    static int[][] Pascal_Triangle(int N){
        int[][] ans =new int[N][];
        for(int i=0;i<N;i++){
            ans[i]=generateRow(i+1);
        }
        return ans;
    }
    public static void main(String[] args){
        int N=5;
        int[][] ans=Pascal_Triangle(N);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans.length;j++){
                System.out.print(ans[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

*/







/*
//Find the array elements(Majority elements) which appears more than N/3 times by using hashing
import java.util.*;
class MajorityElement {
    static List<Integer> Majority_Element(int[] arr) {
        int N = arr.length;
        List<Integer> ans = new ArrayList<>();
        int[] Hash = new int[N + 1];
        for (int i = 0; i < N; i++) {
            Hash[arr[i]]++;
        }
        for (int i = 0; i < N; i++) {
            if (Hash[i] > N / 3) {
                ans.add(i);
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 7,7};
        List<Integer> ans = Majority_Element(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}


*/








/*
//Find the numbers which appears more than N/3 times of the array by using HashMap
import java.util.*;
class MajorityElement{
    static List<Integer> Majority_Element(int[] arr){
        int N=arr.length;
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> data=new HashMap<>();
        for(int i=0;i<N;i++){
            int value=data.getOrDefault(arr[i],0);
            data.put(arr[i],value+1);
        if(data.get(arr[i])>=N/3){
            ans.add(arr[i]);
        }
        if(ans.size()==2)break;
    }return ans;
}
public static void main(String[] args){
        int[] arr={11,33,2,11,33,11};
        List<Integer> ans=Majority_Element(arr);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+ " ");
        }
    System.out.println();
}

}

*/










/*
//Find the majority element by using count method (Brute Force Approach)
import java.util.*;
class MajorityElement{
    static List<Integer> Majority_Element(int[] arr){
        int N=arr.length;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<N;i++){
        if(ans.size()==0 || ans.get(0)!=arr[i]){
            int cnt=0;
            for(int j=0;j<N;j++){
                if(arr[j]==arr[i]) {
                    cnt++;
                }

            }
            if(cnt>=N/3)
                ans.add(arr[i]);
        }
        if(ans.size()==2)break;
    }return ans;
}
public static void main(String[] args){
    int[] arr={13,33,33,13,33};
    List<Integer> ans=Majority_Element(arr);
    for(int i=0;i<ans.size();i++){
        System.out.print(ans.get(i)+ " ");}
    System.out.println();
}
}


*/






/*
//Find the  number which appears more than N/3 times by using optimal approach
import java.util.*;
class MajorityElement {
    static List<Integer> Majority_Element(int[] arr) {
        int N = arr.length;
        List<Integer> ans = new ArrayList<>();
        int cnt1 = 0, cnt2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (cnt1 == 0 && el2 != arr[i]) {
                cnt1 = 1;
                el1 = arr[i];
            } else if (cnt2 == 0 && el1 != arr[i]) {
                cnt2 = 1;
                el2 = arr[i];
            } else if (el1 == arr[i]) cnt1++;
            else if (el2 == arr[i]) cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for (int i = 0; i < N; i++) {
            if (el1 == arr[i]) cnt1++;
            if (el2 == arr[i]) cnt2++;
        }
        int majority=(int) (N/3)+1;
        if (cnt1 >= majority) {
            ans.add(el1);
        }
        if (cnt2 >= majority){
            ans.add(el2);}
        return ans;

    }

    public static void main(String args[]) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = Majority_Element(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}

*/







/*
//Find out the unique triplets whose sum of arr[i]+arr[j]+arr[k]=0 and i!=j,j!=k,k!=i by using three loops (brute force approach)
import java.util.*;
class FindUniqueTriplets {
    static List<List<Integer>> UniqueTriplets(int N, int[] arr) {
        Set<List<Integer>> data = new HashSet<>();
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        temp.sort(null);
                        data.add(temp);

                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(data);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        int N = arr.length;
        List<List<Integer>> element = UniqueTriplets(N, arr);
        for (List<Integer> val : element) {
            System.out.print("[");
            for (Integer info : val) {
                System.out.print(info + " ");
            }
            System.out.print("]");
        }
        System.out.println();
    }
}

*/







/*
//Find the Triplets numbers(arr[i],arr[j],arr[k]) whose sum=arr[i]+arr[j]+arr[k]=0 (if i!=j,j!=k, k!=i) by using two for loop (Better approach)
import java.util.*;
class TripletsNum{
    static List<List<Integer>> TripletsNumber(int N,int[] arr){
        Set<List<Integer>> data=new HashSet<>();
        for(int i=0;i<N;i++){
            Set<Integer> info=new HashSet<>();
            for(int j=i+1;j<N;j++){
                int third=-(arr[i]+arr[j]);
                if(info.contains(third)){
                    List<Integer> temp=Arrays.asList(arr[i],arr[j],third);
                    temp.sort(null);
                    data.add(temp);
                }
                info.add(arr[j]);
            }
        }
        List<List<Integer>> ans=new ArrayList<>(data);
        return ans;
    }
    public static void main(String[] args){
        int[] arr={-1, 0, 1, 2, -1, -4};
        int N=arr.length;
        List<List<Integer>> element=TripletsNumber(N,arr);
        for(List<Integer> it:element){
            System.out.print("[");
            for(Integer val:it){
                System.out.print(val+ " ");
            }
            System.out.print("]");
        }
        System.out.println();
    }
}


*/







/*
//Find the Triplets numbers(arr[i],arr[j],arr[k]) whose sum=arr[i]+arr[j]+arr[k]=0 (if i!=j,j!=k, k!=i) by using optimal approach
import java.util.*;
class TripletsNum{
    static List<List<Integer>> TripletsNumber(int N,int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < N; i++) {
            if (i != 0 && arr[i] == arr[i - 1]) continue;
            //moving other two pointers
            int j = i + 1;
            int k = N - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    ans.add(temp);
                    j++;
                    k--;


                    //avoid duplicates
                    while (j < k && arr[j] == arr[j - 1]) j--;
                    while (j < k && arr[k] == arr[k + 1]) k++;

                }
            }
        } return ans;
    }
    public static void main(String[] args){
        int[] arr={-1, 0, 1, 2, -1, -4};
        int N=arr.length;
        List<List<Integer>> element=TripletsNumber(N,arr);
        for(List<Integer> it:element){
            System.out.print("[");
            for(Integer val:it){
                System.out.print(val+ " ");
            }
            System.out.print("]");
        }
        System.out.println();
    }
}


*/






/*
//Find the Triplets numbers(arr[i],arr[j],arr[k]) whose sum=arr[i]+arr[j]+arr[k]=0 (if i!=j,j!=k, k!=i) by using optimal approach No:2
import java.util.*;
class TripletsNum{
    static List<List<Integer>> TripletsNumber(int N,int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < N - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = N - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == 0) {
                    ans.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    while (j < k && arr[j] == arr[j + 1]) {
                        j++;
                    }
                    while (j < k && arr[k] == arr[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }return ans;
    }
    public static void main(String[] args){
        int[] arr={-1, 0, 1, 2, -1, -4};
        int N=arr.length;
        List<List<Integer>> element=TripletsNumber(N,arr);
        for(List<Integer> it:element){
            System.out.print("[");
            for(Integer val:it){
                System.out.print(val+ " ");
            }
            System.out.print("]");
        }
        System.out.println();
    }
}



*/








/*
//Find out the how many numbers of  different four array elements sum equal to target value by using brute force approach
import java.util.*;
class FourSum{
    static List<List<Integer>> Four_Sum(int[] arr,int target){
        int N=arr.length;
        Set<List<Integer>> data=new HashSet<>();
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                for(int k=j+1;k<N;k++){
                    for(int m=k+1;m<N;m++){
                        long sum=(long)arr[i]+arr[j];
                        sum+=arr[k];
                        sum+=arr[m];
                        if(sum==target){
                            List<Integer> temp=Arrays.asList(arr[i],arr[j],arr[k],arr[m]);
                            Collections.sort(temp);
                            data.add(temp);
                        }
                    }
                }
            }
        }List<List<Integer>> ans=new ArrayList<>(data);
        return ans;
    }
    public static void main(String[] args){
        int[] arr={4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        List<List<Integer>> ans=Four_Sum(arr,9);
        for(List<Integer> it:ans){
            System.out.print("[");
            for(Integer val:it){
                System.out.print(val+ " ");
            }
            System.out.print("]");
        }
        System.out.println();
    }
}





*/




/*
//Find the Longest Sub-array elements whose sum==0
import java.util.*;
 class Solution {
    public static int getLongestZeroSumSubarrayLength(int []arr){
        // Write your code here.
        int n=arr.length;
        int sum=0,maxi=0;
//HashMap declared
        HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
//If sum==0 then maxi will increase by 1
            if(sum==0){
                maxi=i+1;
            }
//else  (if sum in data HashMap is not equal to null or 0 then maxi will update as given below
            else{
                if(data.get(sum)!=null){
                    maxi=Math.max(maxi,i-data.get(sum));
                }
//else sum and array element index i.e ith will be added to data HashMap
                else{
                    data.put(sum,i);
                }
            }
        } return maxi;
    }
    public static void main(String[] args){
        int[] arr={1,-1,0,0,1};
        int ans=getLongestZeroSumSubarrayLength(arr);
        System.out.print(ans);

    }
}

*/






/*
//Find the Number of Sub-arrays whose Xor is equal to b value by using brute force approach
import java.util.*;
class Sub_Arrays{
    static int Num_Sub_Arrays(int[] arr, int b) {
        int N = arr.length;
        Map<Integer, Integer> data = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int xor = 0;
                for (int k = i; k <= j; k++) {
                    xor = xor ^ arr[k];
                }
                if (xor == b) cnt++;

            }
        }return cnt;
        }
    public static void main(String[] args){
        int[] arr={4, 2, 2, 6, 4};
        int ans=Num_Sub_Arrays(arr,6);
        System.out.println(ans);
    }
}

*/





/*
//Find the number of Sub-arrays whose XOR equal to b value by using better approach(two for loop)
import java.util.*;
class Sub_Arrays{
    static int NumberOf_Sub_Array(int[] arr, int b){
        int N=arr.length;
        int cnt=0;
        for(int i=0;i<N;i++){
            int xor=0;
            for(int j=i;j<N;j++) {
                xor = xor ^ arr[j];
                if (xor == b) cnt++;
            }
        }return cnt;
    }
    public static void main(String[] args){
        int[] arr={4, 2, 2, 6, 4};
        int ans=NumberOf_Sub_Array(arr,6);
        System.out.println(ans);
    }
}


*/




/*

//Find the Number of Sub-arrays whose xor is equal to b value by using HashMap(Optimal approach)
import java.util.*;
class Sub_Arrays{
    static int NumberOf_Sub_Arrays(int[] arr,int b){
        int N=arr.length;
        Map<Integer,Integer> data=new HashMap<>();
        int cnt=0;
        int xor=0;
        data.put(xor,1);
        for(int i=0;i<N;i++){
            xor=xor^arr[i];
            int x=xor^b;
            if(data.containsKey(x)){
                cnt+=data.get(x);
            }
            if(data.containsKey(xor)){
                data.put(xor,data.get(xor)+1);
            }
            else{
                data.put(xor,1);
            }
        }return cnt;
    }
    public static void main(String[] args){
        int[] arr={4,2,2,6,4};
        int ans=NumberOf_Sub_Arrays(arr,6);
        System.out.println(ans);
    }
}


*/














/*
//Merge the given Intervals by using Brute Force Approach
import java.util.*;
class MergeIntervals{
    static List<List<Integer>> Merge_Intervals(int[][] arr){
        int N=arr.length;
        Arrays.sort(arr,new Comparator<int[]>(){
            public int compare(int a[],int b[]){
                return a[0]-b[0];
            }
        });

        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<N;i++){
            int start=arr[i][0];
            int end=arr[i][1];

            if(!ans.isEmpty() && end<=ans.get(ans.size()-1).get(1)){
                continue;
            }

            for(int j=i+1;j<N;j++){
                if(arr[j][0]<=end){
                    end=Math.max(end,arr[j][1]);
                }
            }ans.add(Arrays.asList(start,end));
        }return ans;
    }
    public static void main(String[] args){
        int[][] arr={{1,3},{8,10},{2,6},{2,4},{13,18}};
        List<List<Integer>> ans=Merge_Intervals(arr);
        for(List<Integer> info:ans){
            System.out.print("["+info.get(0)+","+info.get(1)+ "]");
        }
        System.out.println();
    }
}
*/





/*
//Merge the given Intervals by using Optimal approach
import java.util.*;
class MergeIntervals{
    static List<List<Integer>> Merge_Intervals(int[][] arr){
        int N=arr.length;
        Arrays.sort(arr,new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]-b[0];
            }
        });

        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<N;i++){
            if(ans.isEmpty()||arr[i][0]>ans.get(ans.size()-1).get(1)){
                ans.add(Arrays.asList(arr[i][0],arr[i][1]));
            }
            else{
                ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1),arr[i][1]));
            }

        }return ans;
    }
    public static void main(String[] args){
        int[][] arr={{1,3},{2,6},{2,4},{8,10},{12,14}};
        List<List<Integer>> ans=Merge_Intervals(arr);
        for(List<Integer> info:ans){
            System.out.print("["+info.get(0)+ "," +info.get(1)+ "]");
        }
        System.out.println();
    }
}


*/






/*
//Merge the Given Intervals with Integer data type function
import java.util.*;
class MergeIntervals {
    static int[][] Merge_Intervals(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        int N = intervals.length;
        if (N != 0 || intervals != null) {
            Arrays.sort(intervals, (int[] a, int[] b) -> a[0] - b[0]);
            int start = intervals[0][0];
            int end = intervals[0][1];
            for (int[] i : intervals) {
                if (i[0] <= end) {
                    end = Math.max(end, i[1]);
                } else {
                    ans.add(new int[]{start, end});
                    start = i[0];
                    end = i[1];
                }
            }
            ans.add(new int[]{start, end});
        }
        return ans.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {2, 4}, {7, 9}, {10, 12}};
        int[][] ans = Merge_Intervals(intervals);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[i][j]);
            }
        }
    }
}

*/





/*
//Merge the two sorted array into one sorted array by using brute force approach
import java.util.*;
class MergeArray{
    static void MergeSortedArray(long[] nums1,long[] nums2,int n,int m){
        long[] nums3=new long[n+m];
        int left=0,right=0,index=0;
        while(left<n && right<m) {
            if (nums1[left] <= nums2[right]) {
                nums3[index] = nums1[left];
                left++;
                index++;
            } else {
                nums3[index] = nums1[right];
                right++;
                index++;
            }
        }
        while(left<n){
            nums3[index++]=nums1[left++];
        }
        while(right<m){
            nums3[index++]=nums1[right++];
        }
        for(int i=0;i<n+m;i++){
            if(i<n){
                nums1[i]=nums3[i];
            }
            else{
                nums2[i-n]=nums3[i];
            }
        }

    }
    public static void main(String[] args){
        long[] nums1={1,2,3,0,0,0};
        int m=nums1.length;
        long[] nums2={2,4,5};
        int n=nums2.length;
        MergeSortedArray(nums1,nums2,n,m);
        for(int i=0;i<n;i++){
            System.out.print(nums1[i]+ ",");
        }
        for(int j=0;j<m;j++){
            System.out.print(nums2[j]+ " ");
  }
  }
  }
 */






/*
//Merge the two sorted array into one sorted array by using optimal  approach:1
import java.util.*;
class MergeArray{
    static void MergeSortedArray(long[] nums1,long[] nums2,int n,int m){
    int left=n-1,right=0;
    while(left>=0 && right<m){
    if(nums1[left]>nums2[right]){
        long temp=nums1[left];
        nums1[left]=nums2[right];
        nums2[right]=temp;
        left--;
        right++;
    }
    else{
        break;
    }
    }
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    }
    public static void main(String[] args){
        long[] nums1={1,2,3,0,0,0};
        int n=nums1.length;
        long[] nums2={2,4,5};
        int m=nums2.length;
        MergeSortedArray(nums1,nums2,n,m);
        for(int i=0;i<n;i++){
            System.out.print(nums1[i]+ ",");
        }
        for(int j=0;j<m;j++){
            System.out.print(nums2[j]+ " ");
        }
    }
}

*/







/*
//Merge the two sorted array into one sorted array by using optimal  approach:2
import java.util.*;

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];
            }
            else{
                nums1[k--]=nums2[j--];
            }
        }

    }
    public static void main(String[] args){
        int[] nums1={1,2,3,7,8,9};
        int[] nums2={2,5,6};
        merge(nums1,3,nums2,3);
        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+ " ");
        }

    }
}


*/










/*
//Find the Repeating & missing number from the given array by using Linear Search (Brute Force Approach)
import java.util.*;
class MissingNum {
    public static int[] findMissingRepeatingNumbers(int[] a) {
        int N = a.length;
        int repeating_num = -1, missing_num = -1;
        for (int i = 1; i <= N; i++) {
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                if (a[j] == i) cnt++;
            }
                if (cnt == 2)
                    repeating_num = i;
                else if (cnt == 0)
                    missing_num = i;
                if (repeating_num != -1 && missing_num != -1)
                    break;
            }
        int[] ans = {repeating_num, missing_num};
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
        int[] ans = findMissingRepeatingNumbers(a);

            System.out.println(+ans[0]+ ","+ans[1]+ " ");
    }
}

*/







/*
//Find the Repeating & missing number from the given array by using Array Hashing Method (Better  Approach)
import java.util.*;
class MissingNum {
    public static int[] findMissingRepeatingNumbers(int[] a) {
        int N = a.length;
        int[] hash = new int[N + 1];
        for (int i = 0; i < N; i++) {
            hash[a[i]]++;
        }
            int repeating_num = -1, missing_num = -1;
        for (int i = 1; i <= N; i++) {
            if (hash[i] == 2) repeating_num = i;
            else if (hash[i] == 0) missing_num = i;
            if (repeating_num != -1 && missing_num != -1)
                break;
        }
        int[] ans = {repeating_num, missing_num};
        return ans;

    }

    public static void main(String[] args) {
        int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
        int[] ans = findMissingRepeatingNumbers(a);
        System.out.println(+ans[0] + "," + ans[1]);
    }
}


*/







/*
//Find repeating & missing number by using maths methods (optimal solutions)
import java.util.*;
class Solutions{
    static int[] RepeatingMissing_Number(int[] a){
        long N=a.length;
        long s1=0,s2=0;
        long sn=(N*(N+1))/2;
        long s2n=(N*(N+1)*(2*N+1))/6;
        for(int i=0;i<N;i++) {
            s1 += a[i];
            s2 += (long) a[i] * (long) a[i];
        }
        long val1=s1-sn;
        long val2=s2-s2n;
        val2=val2/val1;
        long X=(val1+val2)/2;
        long Y=X-val1;
        int[] ans={(int)X,(int)Y};
        return ans;
        }
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
        int[] ans = RepeatingMissing_Number(a);
        System.out.println(+ans[0] + "," + ans[1]);
    }


    }
*/






/*
//Number of Inversion(means number of pairs of i,j such that i<j and arr[i]>arr[j] by using brute force solution
import java.util.*;
 class Solution {
    public static int numberOfInversions(int []a, int n) {
        // Write your code here.
        int cnt1=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>[j])cnt1++;
            }

        }
        return cnt1;
    }
    public static void main(String[] args){
        int[] a={5,4,3,2,1};
        int n=a.length;
        int ans=numberOfInversions(a, n);
        System.out.println(ans);
    }
}
*/











/*
//Number of Inversion(means number of pairs of i,j such that i<j and arr[i]>arr[j] by using Merge Sort Algorithm(Optimal Approach)
import java.util.*;
class Solution {
    public static int merge(int []a,int low ,int mid,int high) {
        // Write your code here.
        int cnt=0;
        int left=low,right=mid+1;
        ArrayList<Integer> temp=new ArrayList<>();
        while(left<=mid && right<=high) {
            if (a[left] <= a[right]) {
                temp.add(a[left]);
                left++;
            } else {
                temp.add(a[right]);
                cnt += (mid - left + 1);
                right++;
            }
        }
        while(left<=mid){
            temp.add(a[left]);
            left++;
        }
        while(right<=high){
            temp.add(a[right]);
            right++;
        }
        for(int i=low;i<high;i++){
            a[i]=temp.get(i-low);
        }
        return cnt;
        }
        public static int mergeSort(int[] a,int low , int high){
        int cnt=0;
        if(low>=high)return cnt;
        int mid=(low+high)/2;
        cnt+=mergeSort(a,low,mid);
        cnt+=mergeSort(a,mid+1,high);
        cnt+=merge(a,low,mid,high);
        return cnt;
        }
        public static int inversionNumber(int[] a, int n){
        return mergeSort(a,0,n-1);
        }
        public static void main(String[] args){
        int[] a={4,1,2,3,1};
        int n=a.length;
        int cnt=inversionNumber(a,n);
            System.out.println(cnt+ " ");

        }
    }
*/








/*
//Number of Reverse pairs(means number of pairs of i,j such that i<j and arr[i]>2*arr[j] by using brute force solution
import java.util.*;
class Solution {
    public static int numberOfInversions(int []a, int n) {
        // Write your code here.
        int cnt1=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>2*a[j])cnt1++;
            }

        }
        return cnt1;
    }
    public static void main(String[] args){
        int[] a={4,1,2,3,1};
        int n=a.length;
        int ans=numberOfInversions(a, n);
        System.out.println(ans);
    }
}


*/






/*
//Number of Reverse pairs(means number of pairs of i,j such that i<j and arr[i]>2*arr[j] by using Merge Sort algorithm(Optimal Approach)
import java.util.*;
class Solution {
    public static void merge(int[] a,int low,int mid,int high){
        int left=low,right=mid+1;
        int n=a.length;
        ArrayList<Integer> temp=new ArrayList<>();
        while(left<=mid && right<=high){
            if(a[left]<=a[right]){
                temp.add(a[left]);
                left++;
            }
            else{
                temp.add(a[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(a[left]);
            left++;
        }
        while(right<=high){
            temp.add(a[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            a[i]=temp.get(i-low);
        }
    }
    public static int countPairs(int[] a,int low,int mid,int high){
        int cnt=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++){
            while(right<=high && a[i]>2*(long)a[right])right++;
            cnt+=right-(mid+1);
        }
        return cnt;
    }
    public static int mergeSort(int[] a,int low,int high){
        int cnt=0;
        if(low>=high)return cnt;
        int mid=(low+high)/2;
        cnt+=mergeSort(a,low,mid);
        cnt+=mergeSort(a,mid+1,high);
        cnt+=countPairs(a,low,mid,high);
        merge(a,low,mid,high);
        return cnt;
    }
    public static int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
    public static void main(String[] args){
        int[] nums={1,3,2,3,1};
        int ans=reversePairs(nums);
        System.out.print(ans);
    }
}


*/







/*
//Find the maximum product of sub-array(that means find the maximum result of multiplication of sub-arrays with each other ) by using brute force approach(3 for loop)
import java.util.*;
class Solution{
    static int MaximumProduct(int[] a){
        int n=a.length;
        int result=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++){
                int prod=1;
                for(int k=i;k<=j;k++)
                    prod*=a[k];
                    result=Math.max(result,prod);
            }
        return result;
    }
    public static void main(String[] args){
        int[] a={1,2,-3,0,-4,-5};
        int ans=MaximumProduct(a);
        System.out.print(ans);
    }
}

*/






/*
//Find the maximum product of sub-array(that means find the maximum result of multiplication of sub-arrays with each other ) by using better approach(two for loop)
import java.util.*;
class Solution{
    static int MaximumProduct(int[] a){
        int n=a.length;
        int result=a[0];
        for(int i=0;i<n-1;i++){
            int prod=a[i];
            for(int j=i+1;j<n;j++){
                result=Math.max(result,prod);
                prod*=a[j];
            }
                result=Math.max(result,prod);
            }
        return result;
    }
    public static void main(String[] args){
        int[] a={1,2,-3,0,-4,-5};
        int ans=MaximumProduct(a);
        System.out.print(ans);
    }
}

*/






/*
//Find the maximum product of sub-array(that means find the maximum result of multiplication of sub-arrays with each other ) by using Optimal Approach
import java.util.*;
class Solution {
    public static int maxProduct(int[] nums) {
        int n=nums.length;
        int pre=1,suff=1;
        int result=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(pre==0)pre=1;
            if(suff==0)suff=1;
            pre*=(long)nums[i];
            suff*=(long)nums[n-i-1];
            result=Math.max(result,Math.max(pre,suff));
        } return result;
    }
    public static void main(String[] args){
        int[] nums={2,3,-2,4};
        int ans=maxProduct(nums);
        System.out.println(ans);
    }

}

*/








/*
//Find the given Target value is present at which array index ith position by using brute force approach(Binary Search)
import java.util.*;
class Solution{
    static int BinarySearch(int[] nums,int Target){
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(Target==nums[mid])return mid;
            else if(Target>nums[mid])low=mid+1;
            else{
                high=mid-1;
            }
        } return -1;
    }
    public static void main(String[] args){
        int[] nums={3, 4, 6, 7, 9, 12, 16, 17};
        int Target=6;
        int ans=BinarySearch(nums,Target);
        System.out.println(ans);
    }
}

*/






/*
//Find the given Target value is present at which array index ith position by using Optimal approach(Binary Search)
import java.util.*;
class Solution{
    static int BinarySearch(int[] nums,int low,int high,int Target){
            if(low>high)return -1;
            int mid=(low+high)/2;
            if(Target==nums[mid])return mid;
            else if(Target>nums[mid])
                return BinarySearch(nums,mid+1,high,Target);
            return BinarySearch(nums,low,mid-1,Target);

        }
        public static int Search(int[] nums,int Target){
    return BinarySearch(nums,0,nums.length-1,Target);
    }
    public static void main(String[] args){
        int[] nums={3, 4, 6, 7, 9, 12, 16, 17};
        int Target=6;
        int ans=Search(nums,Target);
        System.out.println(ans);
    }
}

*/








/*
//Implement Lower Bound(means Find the array element index who is slightly greater than given x value by using linear search) (Brute force approach)
import java.util.*;
class Solution{
    static int lowerBound(int[] arr,int n,int x){
        for(int i=0;i<n;i++){
            if(arr[i]>=x)
                return i;
        } return n;

    }
    public static void main(String[] args){
        int[] arr={1,2,2,4,5,6};
        int n=arr.length;
        int ans=lowerBound(arr,n,3);
        System.out.println(ans);
    }
}

*/








/*
//Implement Lower Bound(means Find the array element index who is slightly greater than given x value by using linear search) by using two pointer approach(Optimal Approach)
import java.util.*;
class Solution{
    static int lowerBound(int[] arr,int n,int x){
        int low=0,high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
            high=mid-1;}
            else{
                low=mid+1;
            }


            }return ans;
        }
        public static void main(String[] args){
        int[] arr={1,2,3,4,5,5,6,7};
        int n=arr.length;
        int ans=lowerBound(arr,n,6);
            System.out.println(ans);
        }

    }

*/






/*
//Implement upper Bound(means Find the array element index who is slightly greater than given x value by using linear search) (Brute force approach)
import java.util.*;
class Solution{
    static int lowerBound(int[] arr,int n,int x){
        for(int i=0;i<n;i++){
            if(arr[i]>x)
                return i;
        } return n;

    }
    public static void main(String[] args){
        int[] arr={1,2,2,4,5,6};
        int n=arr.length;
        int ans=lowerBound(arr,n,3);
        System.out.println(ans);
    }
}

*/








/*
//Implement Lower Bound(means Find the array element index who is slightly greater than given x value by using linear search) by using two pointer approach(Optimal Approach)
import java.util.*;
class Solution{
    static int lowerBound(int[] arr,int n,int x){
        int low=0,high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
            high=mid-1;}
            else{
                low=mid+1;
            }


            }return ans;
        }
        public static void main(String[] args){
        int[] arr={1,2,3,4,5,5,6,7};
        int n=arr.length;
        int ans=lowerBound(arr,n,6);
            System.out.println(ans);
        }

    }
*/









/*
//Find the floor and ceiling of the given x [ floor of x : the arr[i]<=x  and ceiling of x: the arr[i]>=x] by using optimal approach
import java.util.* ;
import java.io.*;
 class Solution {
    public static int FindFloor(int n,int x,int[] arr){

        int low=0,high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high);
            if(arr[mid]<=x){
                ans=arr[mid];
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        } return ans;

    }


    public static int ceilingInSortedArray(int n, int x, int[] arr) {
        // Write your code here.

        int low=0,high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=arr[mid];
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static int[] FindOutput(int n ,int x,int[] arr){
        int f=FindFloor(n, x, arr);
        int c=ceilingInSortedArray(n, x, arr);
        int[] ans={f,c};
        return ans;
    }
    public static void main(String[] args){
        int[] arr={4 ,3, 8, 4, 7, 10};
        Arrays.sort(arr);
        int n=arr.length;
        int x=5;
        int[] ans=FindOutput(n, x, arr);
        System.out.println(+ans[0]+ " "+ans[1]);
    }
}


*/





/*
//Find the First Occurrence & Last Occurrence in ArrayList data type array by using optimal approach
import java.util.*;
 class Solution {
    public static int First(ArrayList<Integer> arr,int n,int k){
        int start=0,end=n-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(k==arr.get(mid)){
                ans=mid;
                end=mid-1;
            }
            else if(k>arr.get(mid)){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        } return ans;
    }
    public static int Last(ArrayList<Integer> arr,int n,int k){
        int start=0,end=n-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(k==arr.get(mid)){
                ans=mid;
                start=mid+1;
            }
            else if(k<arr.get(mid)){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int f=First(arr, n, k);
        int l=Last(arr, n, k);
        int[] ans={f,l};
        return ans;

    }
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(new Integer[]{0,1,1,5}));
        int[] ans=firstAndLastPosition(arr,arr.size(),1);
        System.out.print(+ans[0]+ " "+ans[1]);
    }

}

*/





/*
//Find the First Occurrence & Last Occurrence in Array data type array by using optimal approach
import java.util.*;
class Solution {
    public static int First(int[] nums,int target){
        int n=nums.length;
        int start=0,end=n-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                ans=mid;
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        } return ans;
    }
    public static int Last(int[] nums,int target){
        int n=nums.length;
        int start=0,end=n-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                ans=mid;
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        } return ans;
    }
    public static int[] searchRange(int[] nums, int target) {
        int f=First(nums,target);
        int l=Last(nums,target);
        int[] ans={f,l};
        return ans;
    }
    public static void main(String[] args){
        int[] nums={5,7,7,8,8,10};
        int target=8;
        int[] ans=searchRange(nums,target);
        System.out.print(+ans[0]+ "," +ans[1]);
    }
}

*/





/*
//Find the number of Occurrences by using binary search algorithm (Optimal Approach)
import java.util.*;
class Solution {
    public static int First(int[] arr,int n,int x){
        int start=0,end=n-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(x==arr[mid]){
                ans=mid;
                end=mid-1;
            }
            else if(x>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }return ans;
    }
    public static int Last(int[] arr,int n, int x){
        int start=0,end=n-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(x==arr[mid]){
                ans=mid;
                start=mid+1;
            }
            else if(x>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }return ans;
    }
    public static int[] Output(int[] arr,int n,int x){
        int f=First(arr, n, x);
        int l=Last(arr, n, x);
        int[] ans={f,l};
        return ans;
    }

    public static int count(int arr[], int n, int x) {
        //Your code goes here
        int[] ans=Output(arr, n, x);
        if(ans[0]==-1)return 0;
        return(ans[1]-ans[0]+1);
    }
    public static void main(String[] args){
        int[] arr={1,1,1,2,2,3,3};
        int n=arr.length;
        int ans=count(arr, n, 3);
        System.out.print(ans);
    }
}

*/






/*
//Search k value in Rotated sorted array with ArrayList array by using Binary Search algorithm(Optimal approach)
import java.util.ArrayList;
import java.util.*;
 class Solution {
    public static int search(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(k==arr.get(mid))
                return mid;
            if(arr.get(low)<=arr.get(mid)){
                if(arr.get(low)<=k && k<=arr.get(mid)){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else {
                if(arr.get(mid)<=k && k<=arr.get(high)){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }

        }return -1;
    }
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(new Integer[]{12,15,18,2,4}));
        int n=arr.size();
        int ans=search(arr, n, 2);
        System.out.println(ans);
    }
}


*/




/*
//Search target value index position in Rotated sorted array with normal array by using Binary Search algorithm(Optimal approach)
import java.util.*;
class Solution {
    public static int search(int[] nums, int target) {
        int n=nums.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(target==nums[mid])
                return mid;
            //If left side array is sorted
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    high=mid-1;

                }else{
                    low=mid+1;
                }
            }
            //Right side array is sorted
            else{
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        } return -1;

    }
    public static void main(String[] args){
        int[] nums={4,5,6,7,0,1,2};
        int ans=search(nums,0);
        System.out.print(ans);


    }
}

*/








/*
//Search target in Rotated sorted array II and if target found in array then return true else return false(by using binary search) optimal approach
import java.util.*;
class Solution {
    public static boolean search(int[] nums, int target) {
        int n=nums.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(target==nums[mid])
                return true;
            if(nums[low]==nums[mid]){
                low++;
                continue;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1;

                }
                else{
                    high=mid-1;
                }
            }
        } return false;
    }
    public static void main(String[] args){
        int[] nums={2,5,6,0,0,1,2};
        boolean ans=search(nums,0);
        System.out.println(ans);
    }
}


*/






/*
//Find the minimum array elements Rotated Sorted Arrays by using binary search(Optimal approach)
import java.util.*;
class Solution {
    public static int findMin(int[] nums) {
        int n=nums.length;
        int low=0,high=n-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;

            if(nums[low]<=nums[mid]){
                ans=Math.min(ans,nums[low]);
                low=mid+1;
            }
            else{
                ans=Math.min(ans,nums[mid]);
                high=mid-1;
            }
        }return ans;
    }
    public static void main(String[] args){
        int[] nums={3,4,5,1,2};
        int ans=findMin(nums);
        System.out.println(ans);
    }
}

*/




/*

//Find the minimal array element from the given Rotated sorted array by using binary search algorithm (more optimal search)
class Solution {
    public static int findMin(int []arr) {
        // Write your code here.
        int n=arr.length;
        int low=0,high=n-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[high]){
                ans=Math.min(ans,arr[low]);
                break;
            }
            if(arr[low]<=arr[mid]){
                ans=Math.min(ans,arr[low]);
                low=mid+1;
            }
            else{
                ans=Math.min(ans,arr[mid]);
                high=mid-1;
            }
        }return ans;
    }
    public static void main(String[] args){
        int[] arr={3,4,5,1,2};
        int ans=findMin(arr);
        System.out.println(ans);

    }
}


*/



/*
//Find the how many times array rotated by finding minimum array element index as a number of times array rotated by using binary search(optimal approach)
import java.util.*;
 class Solution {
    public static int findKRotation(int []arr){
        // Write your code here.
        int n=arr.length;
        int low=0,high=n-1;
        int ans=Integer.MAX_VALUE;
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[high]){
                if(arr[low]<ans){
                    index=low;
                    ans=arr[low];
                }
                break;
            }

            if(arr[low]<=arr[mid]){
                if(arr[low]<ans){
                    index=low;
                    ans=arr[low];
                }
                low=mid+1;
            }
            else{
                if(arr[mid]<ans){
                    index=mid;
                    ans=arr[mid];
                }
                high=mid-1;
            }
        }return index;
    }
    public static void main(String[] args){
        int[] arr={2,3,4,1};
        int ans=findKRotation(arr);
        System.out.println(ans);
    }
}

*/






/*
//Find the number which is non-repeatative or its frequency is 1 by using binary search algorithm(Optimal approach) with Integer data type array
import java.util.*;
class Solution {
    public static int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int start=0,end=n-1;
        while(start<end){
            int mid=(start+end)/2;
            if((mid%2==0 && nums[mid]==nums[mid+1])|| (mid%2==1 && nums[mid]==nums[mid-1])){
                start=mid+1;

            }
            else{
                end=mid;
            }
        } return nums[start];


    }
    public static void main(String[] args){
        int[] nums={1,1,2,3,3,4,4,8,8};
        int ans=singleNonDuplicate(nums);
        System.out.println(ans);
    }
}

*/








/*
//Find the number which is non-repeatative or its frequency is 1 by using binary search algorithm(Optimal approach) with ArrayList data structure array
import java.util.ArrayList;
import java.util.*;
 class Solution
{
    public static int singleNonDuplicate(ArrayList<Integer> arr){
        int n=arr.size();
        int start=0,end=n-1;
        while(start<end){
            int mid=(start+end)/2;
            if((mid%2==0 && (long)arr.get(mid)==(long)arr.get(mid+1))||(mid%2==1 && (long)arr.get(mid)==(long)arr.get(mid-1))){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return arr.get(start);
    }
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,1,2,2,4,5,5));
        int ans=singleNonDuplicate(arr);
        System.out.println(ans);
    }
}

*/







/*
//Find the number which is non-repeatative or its frequency is 1 by using binary search algorithm(Optimal approach No:2) with ArrayList data structure array
import java.util.*;
class Solution{
    static int Non_Repeatattive(ArrayList<Integer> arr){
        int n=arr.size();
        if(n==1)
            return arr.get(0);
        if(!arr.get(0).equals(arr.get(1)))
            return arr.get(0);
        if(!arr.get(n-1).equals(arr.get(n-1)))
            return arr.get(n-1);
        int low=1,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(!arr.get(mid).equals(arr.get(mid-1)) && !arr.get(mid).equals(mid+1))
                return arr.get(mid);
            if((mid%2==0 && arr.get(mid).equals(arr.get(mid+1))) || (mid%2==1 && arr.get(mid).equals(arr.get(mid-1)))){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        } return -1;
}
public static void main(String[] args){
    ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6));
    int ans=Non_Repeatattive(arr);
    System.out.println(ans);
    }
}
*/





/*
//Find the peak element(peak element means the array element which is greater than his immediate right & immediate left side array element) by using binary search (optimal approach)
import java.util.ArrayList;
import java.util.*;
 class Solution {
    public static int findPeakElement(ArrayList<Integer> arr) {
        // Write your code here.
        int n=arr.size();
        if(n==1)return 0;
        if(arr.get(0)>arr.get(1))return 0;
        if(arr.get(n-1)>arr.get(n-2))return n-1;
        int low=1,high=n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr.get(mid)>arr.get(mid-1) && arr.get(mid)>arr.get(mid+1)){
                return mid;
            }
            if(arr.get(mid)>arr.get(mid-1)){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,8,1,5,3));
        int ans=findPeakElement(arr);
        System.out.println(ans);
    }
}
*/










/*
//Find the peak element(peak element means the array element which is greater than his immediate right & immediate left side array element) by using binary search (optimal approach)
class Solution {
    public static int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n==1)return 0;
        if(nums[0]>nums[1])return 0;
        if(nums[n-1]>nums[n-2])return n-1;
        int low=1,high=n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(nums[mid]>nums[mid-1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        } return -1;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,1};
        int ans=findPeakElement(nums);
        System.out.println(ans);

    }
}
*/







/*
//Find the Square root of the given n value by using brute force approach
import java.util.*;
class Solution{
    static int SquareRoot(long n){
        int ans=0;
        for(long i=1;i<=n;i++){
            long val=i*i;
            if(val<=n){
                ans=(int)i;
            }
            else{
                break;
            }
        }return ans;
    }
    public static void main(String[] args){
        int ans=SquareRoot(7);
        System.out.println(ans);
    }
}
*/





/*
//Find the Square root of the given n value by using Optimal approach(Math.sqrt method)
import java.util.*;
class Solution{
    static int SquareRoot(long n){
        int ans=(int)Math.sqrt(n);
        return ans;
    }
    public static void main(String[] args){
    int ans=SquareRoot(7);
        System.out.println(ans);
    }
}
*/



/*
//Find the Square root of the given n value by using Optimal approach(Binary Search Method)
import java.util.* ;
import java.io.*;

 class Solution {

    public static int sqrtN(long N) {
        int ans=0;
        long low=1,high=N;
        while(low<=high){
            long mid=(low+high)/2;
            long val=mid*mid;
            if(val<=N){
                ans=(int)mid;
                low=(int)mid+1;
            }
            else{
                high=(int)mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int ans=sqrtN(7);
        System.out.println(ans);
    }
}

*/




/*
//Find the nth root of M[means find the val-->val^n=m  if n and m is given] by using brute force approach
import java.util.*;
 class Solution {
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int low=1,high=m/n;
        while(low<high){
            if(Math.pow(low,n)==m){
                return low;
            }
            low++;
        }
        return -1;
    }
    public static void main(String[] args){
        int ans=NthRoot(3, 64);
        System.out.println(ans);
    }
}

*/







/*
//Find the nth root of M[means find the val-->val^n=m  if n and m is given] by using Binary search method (Optimal approach)
import java.util.*;
 class Solution {
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int low=1,high=m/n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(Math.pow(mid,n)==m){
                return mid;
            }
            else if(Math.pow(mid,n)>m){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int ans=NthRoot(4, 69);
        System.out.println(ans);
    }
}

*/














/*
//Find minimum rate to eat bananas in given h hours by using binary search(optimal solution)
import java.util.*;
 class Solution {
    public static int minimumRateToEatBananas(int []v, int h) {
        int left=1;
        int right=Integer.MAX_VALUE;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(canEatInTime(v,mid,h)){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }return left;
    }
    public static boolean canEatInTime(int[] v,int k,int h){
        int hours=0;
        for(int pile:v){
            int div=pile/k;
            hours+=div;
            if(pile%k!=0)hours++;
        }return hours<=h;
    }
    public static void main(String[] args){
        int[] v={3,6,2,8};
        int ans=minimumRateToEatBananas(v, 7);
        System.out.println(ans);
    }
}

*/







/*
//Find the minimum rate to eat bananas per hour in given h hours by using brute force approach
import java.util.*;
class Solution{
    static int maxiVal(int[] v){
        int maxi=Integer.MIN_VALUE;
        int n=v.length;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,v[i]);

        }
        return maxi;
    }
    static int calculateHours(int[] v,int hourly){
        int n=v.length;
        int hours=0;
        for(int i=0;i<n;i++){
            hours+=Math.ceil((double)v[i]/(double)hourly);

        } return hours;
    }
    static int minimumRateToEatBananas(int[] v, int h){
        int maxi=maxiVal(v);
        for(int i=1;i<=maxi;i++){
            int reqTime=calculateHours(v,i);
            if(reqTime<=h){
                return i;
            }
        } return maxi;

    }
    public static void main(String[] args){
        int[] v={7, 15, 6, 3};
        int ans=minimumRateToEatBananas(v,8);
        System.out.println(ans);
    }
}

*/





/*

//Find the Minimum number of days to make M bouquets with k value equal alternative bloom days
import java.util.*;
class Solution{
    static boolean possible(int[] bloomday,int day,int m,int k){
        int n=bloomday.length;
        int cnt=0,NoBQ=0;
        for(int i=0;i<n;i++){
            if(bloomday[i]<=day){
                cnt++;
            }
            else{
                NoBQ+=cnt/k;
                cnt=0;
            }
        }
        NoBQ+=cnt/k;
        return NoBQ>=m;
    }
    public static int minDays(int[] bloomday,int m,int k){
        int n=bloomday.length;
        int maxi=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,bloomday[i]);
            min=Math.min(min,bloomday[i]);
        }
        for(int i=min;i<=maxi;i++){
            if(possible(bloomday,i,m,k)){
                return i;
            }
        }return -1;
    }
    public static void main(String[] args){
        int[] bloomday={1,10,3,10,2};
        int ans=minDays(bloomday,3,1);
        System.out.println(ans);
    }
}

*/






/*
//Find the Minimum number of days to make M bouquets with k value equal alternative bloom days
import java.util.*;
class Solution {
    public static boolean possible(int[] bloomDay,int day,int m,int k){
        int n=bloomDay.length;
        int cnt=0,NoBQ=0;
        for(int i=0;i<n;i++){
            if(bloomDay[i]<=day){
                cnt++;
            }
            else{

                NoBQ+=cnt/k;
                cnt=0;
            }
        }
        NoBQ+=cnt/k;
        return NoBQ>=m;
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        long val=(long)m*k;
        int n=bloomDay.length;
        if(val>n)return -1;
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mini=Math.min(mini,bloomDay[i]);
            maxi=Math.max(maxi,bloomDay[i]);

        }
        int low=mini,high=maxi;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(bloomDay,mid,m,k)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args){
        int[] bloomDay={1,10,3,10,2};
        int ans=minDays(bloomDay,3,1);
        System.out.println(ans);
    }
}

*/





/*
//Find smallest divisor<=threshold by using Binary Search Algorithm(Optimal Approach)
import java.util.*;
class Solution {
    public static int sumByD(int[] arr,int div){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.ceil((double)arr[i]/(double)div);
        }return sum;
    }
    public static int smallestDivisor(int arr[], int limit) {
        // Write your coder here
        int n=arr.length;
        if(n>limit)return 0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,arr[i]);
        }
        int low=1,high=maxi;
        while(low<=high){
            int mid=(low+high)/2;
            if(sumByD(arr,mid)<=limit){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }return low;
    }
    public static void main(String[] args){
        int[] arr={8,4,2,3};
        int ans=smallestDivisor(arr, 10);
        System.out.println(ans);
    }
}

*/








/*
//Find smallest divisor<=threshold by using Brute force approach
import java.util.*;
class Solution {
    public static int sumByD(int[] arr,int div) {
        int n = arr.length;
       int sum=0;
       for(int i=0;i<n;i++){
           sum+=Math.ceil((double)arr[i]/(double)div);

       }return sum;
    }
    public static int minDiv(int[] arr,int threshold){
    int n=arr.length;
    int maxi=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        maxi=Math.max(maxi,arr[i]);
    }
    for(int i=1;i<=maxi;i++){
        if(sumByD(arr,i)<=threshold){
            return i;
        }
    }return -1;
}
public static void main(String[] args){
    int[] arr={8,4,2,3};
    int ans=minDiv(arr,10);
    System.out.println(ans);}
}

*/





/*
//Find the Minimum Capacity to ship weight packages within D days by using brute force approach
import java.util.*;
class Solution{
    static int requiredDays(int[] weight,int cap){
        int n=weight.length;
        int load=0;
        int days=1;
        for(int i=0;i<n;i++){
            if(load+weight[i]>cap){
                days+=1;
                load=weight[i];
            }
            else{
                load+=weight[i];
            }
        }return days;
    }
    public static int minCapacity(int[] weight,int d){
        int n=weight.length;
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,weight[i]);
            sum+=weight[i];
        }
        for(int i=maxi;i<=sum;i++){
        if(requiredDays(weight,i)<=d){
            return i;
        }
    }return -1;
}
public static void main(String[] args){
    int[] weight={5, 4, 5, 2, 3, 4, 5, 6};
    int ans=minCapacity(weight,5);
    System.out.println(ans);}
}


*/





/*
//Find the minimum capacity to ship weight packages within d days
import java.util.*;
class Solution {
    public static int requiredDays(int[] weights,int cap){
        int n=weights.length;
        int load=0,days=1;
        for(int i=0;i<n;i++){
            if(load+weights[i]>cap){
                days+=1;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }return days;
    }
    public static int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<n;i++){
            low=Math.max(low,weights[i]);
            high+=weights[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(requiredDays(weights,mid)<=days){
                high=mid-1;

            }
            else{
                low=mid+1;
            }
        }return low;

    }
    public static void main(String[] args){
        int[] weights={1,2,3,4,5,6,7,8,9,10};
        int ans=shipWithinDays(weights,5);
        System.out.print(ans);
    }
}

*/








/*
//Find kth missing positive number by using brute force approach
import java.util.*;
class Solution{
    static int missingNum(int[] arr,int k){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<=k){
                k++;
            }
        }return k;
    }
    public static void main(String[] args){
        int[] arr={2,3,4,7,11};
        int ans=missingNum(arr,5);
        System.out.println(ans);
    }
}


*/




/*
//Find kth missing positive number by using Binary Search algorithm(Optimal approach)
import java.util.*;
 class Solution {
    public static int missingK(int[] vec, int n, int k) {
        // Write your code here.

        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            int missing_num=vec[mid]-(mid+1);
            if(missing_num<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high+k+1;
    }
    public static void main(String[] args){
        int[] vec={4, 7, 9, 10};
        int n=vec.length;
        int ans=missingK(vec,n,1);
        System.out.println(ans);
    }
}

*/






/*
//Find the maximum possible minimum distance on which given number of cows are placed by using brute force approach
import java.util.*;
class Solution {
    static boolean canWePlace(int[] stalls, int dis, int cow) {
        int n = stalls.length;
        int cntCow = 1;
        int last = stalls[0];
        for (int i = 1; i < n; i++) {
            if (stalls[i] - last >= dis) {
                cntCow++;
                last = stalls[i];
            }
            if (cntCow >= cow) {
                return true;
            }
        }
        return false;
    }

    public static int minDis(int[] stalls, int cow) {
        int n = stalls.length;
        Arrays.sort(stalls);
        int limit = stalls[n - 1] - stalls[0];
        for (int i = 1; i <= limit; i++) {
            if (canWePlace(stalls, i, cow) == false) {
                return (i - 1);


            }
        }
        return limit;

    }

    public static void main(String[] args) {
        int[] stalls = {0, 3, 4, 7, 10, 9};
        int ans = minDis(stalls, 4);
        System.out.println(ans);
    }
}


*/






/*
//Find the maximum possible minimum distance on which given number of cows are placed by using binary search algorithm(optimal approach)
import java.util.*;
 class Solution {
    public static boolean canWePlace(int[] stalls,int dis,int k){
        int n=stalls.length;
        int cntCow=1;
        int last=stalls[0];
        for(int i=1;i<n;i++){
            if(stalls[i]-last>=dis){
                cntCow++;
                last=stalls[i];
            }
            if(cntCow>=k){
                return true;
            }
        }return false;
    }
    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
        int n=stalls.length;
        Arrays.sort(stalls);
        int low=1,high=stalls[n-1]-stalls[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(canWePlace(stalls, mid, k)==true){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }return high;

    }
    public static void main(String[] args){
        int[] stalls={0, 3, 4, 7, 10, 9};
        int ans=aggressiveCows(stalls, 4);
        System.out.println(ans);
    }
}

*/






/*
//Find the maximum number of pages in any 1 student after distributing books to m students by using brute force approach
import java.util.*;
class Solution{
    static int countStudent(ArrayList<Integer> arr,int pages ){
        int student=1;
        int n=arr.size();
        int studentPages=0;
        for(int i=0;i<n;i++){
            if(arr.get(i)+studentPages<=pages){
                studentPages+=arr.get(i);
            }
            else{
                //take another student
                student++;
                studentPages=arr.get(i);
            }

        } return student;
    }
    public static int countMaxPages(ArrayList<Integer> arr,int n,int m){
        if(m>n)return -1;
        int low=Collections.max(arr);
        int high=arr.stream().mapToInt(Integer::intValue).sum();
        for(int pages=low;pages<=high;pages++){
            if(countStudent(arr,pages)==m){
                return pages;

            }
        }return low;
    }
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(12 ,34, 67, 90));
        int n=arr.size();
        int ans=countMaxPages(arr,n,2);
        System.out.println(ans);
    }
}



*/






/*
//Find the maximum pages of 1 student after distributing given nth number of books to m value students by using optimal approach(Binary method)
import java.util.ArrayList;
import java.util.*;
 class Solution {
    public static int findStudents(ArrayList<Integer> arr,int pages){
        int student=1;
        int n=arr.size();
        int studentPages=0;
        for(int i=0;i<n;i++){
            if(arr.get(i)+studentPages<=pages){
                studentPages+=arr.get(i);
            }
            else{
                student++;
                studentPages=arr.get(i);
            }
        }return student;
    }
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        if(m>n)return -1;
        int low=Collections.max(arr);
        int high=arr.stream().mapToInt(Integer::intValue).sum();
        while(low<=high){
            int mid=(low+high)/2;
            int student=findStudents(arr,mid);
            if(student>m){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        } return low;

    }
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(12,34,67,90));
        int n=arr.size();
        int ans=findPages(arr, n, 2);
        System.out.println(ans);
    }
}

*/






/*
//Painters Partition Problem[ find the maximum board length that painter can paint but distribute all board equally to k value painter by using optimal approach
import java.util.ArrayList;
import java.util.*;

class Solution
{
    public static int requiredPainter(ArrayList<Integer> boards,int boardSize){
        int n=boards.size();
        int reqPainter=1;
        int sumBoardSize=0;
        for(int i=0;i<n;i++){
            if(boards.get(i)+sumBoardSize<=boardSize){
                sumBoardSize+=boards.get(i);
            }
            else{
                reqPainter++;
                sumBoardSize=boards.get(i);
            }
        }return reqPainter;
    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k){
        //    Write your code here.
        int n=boards.size();
        int low=Collections.max(boards);
        int high=boards.stream().mapToInt(Integer::intValue).sum();
        while(low<=high){
            int mid=(low+high)/2;
            int reqPainter=requiredPainter(boards, mid);
            if(reqPainter>k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }return low;
    }
    public static void main(String[] args){
        ArrayList<Integer> boards=new ArrayList<>(Arrays.asList(2,1,5,6,2,3));
        int ans=findLargestMinDistance(boards, 2);
        System.out.println(ans);
    }
}


*/








/*
//Minimise Maximum distance between gas station by adding new k value gas station and then find maximise minimum difference between this gas station by using brute force approach
import java.util.*;
class Solution{
    static double minimiseMaxDistance(int[] arr,int k){
        int n=arr.length;
        int[] howMany=new int[n-1];
        for(int gasStation=1;gasStation<=k;gasStation++) {
            double maxSection = -1;
            int maxInd = -1;
            for (int i = 0; i < n - 1; i++) {
                double diff = arr[i + 1] - arr[i];
                double SectionLength = diff / (double) (howMany[i] + 1);
                if (SectionLength > maxSection) {
                    maxSection = SectionLength;
                    maxInd = i;
                }
            }
            howMany[maxInd]++;
        }
            double maxAns=-1;
            for(int i=0;i<n-1;i++){
                double diff=arr[i+1]-arr[i];
                double SectionLength=diff/(double)(howMany[i]+1);
                maxAns=Math.max(maxAns,SectionLength);
            }
            return maxAns;

        }
        public static void main(String[] args){
        int[] arr={1, 2, 3, 4, 5};
        double ans=minimiseMaxDistance(arr,4);
            System.out.println(ans);
    }
}


*/




/*
//Minimise Maximum distance between gas station by adding new k value gas station and then find maximise minimum difference between this gas station by using optimal approach

import java.util.*;
 class Solution {
    public static int requiredGasStation(int[] arr,double dist){
        int n=arr.length;
        int cnt=0;
        for(int i=1;i<n;i++){
            int numberInBetween=(int)((arr[i]-arr[i-1])/dist);
            if((arr[i]-arr[i-1])==(dist*numberInBetween)){
                numberInBetween--;
            }
            cnt+=numberInBetween;
        }
        return cnt;
    }
    public static double MinimiseMaxDistance(int []arr, int K){
        // Write your code here.
        int n=arr.length;
        double low=0,high=0;
        for(int i=0;i<n-1;i++){
            high=Math.max(high,(double)(arr[i+1]-arr[i]));
        }
        double diff=1e-6;
        while((high-low)>diff){
            double mid=(low+high)/2.0;
            int cnt=requiredGasStation(arr, mid);
            if(cnt>K){
                low=mid;
            }
            else{
                high=mid;
            }
        }return high;

    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        double ans=MinimiseMaxDistance(arr, 4);
        System.out.println(ans);
    }
}

*/






/*
//Minimise Maximum distance between gas station by adding new k value gas station and then find maximise minimum difference between this gas station by using Priority Queue(Better approach)

import java.util.*;
class Solution{
    public static class Pair{
        double first;
        int second;
        Pair(double first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public static double minimiseMaximumDistance(int[] arr,int k){
        int n=arr.length;
        int[] howMany=new int[n-1];
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b) ->Double.compare(b.first,a.first));
        for(int i=0;i<n-1;i++){
            pq.add(new Pair(arr[i+1]-arr[i],i));
        }
        for(int gasStation=1;gasStation<=k;gasStation++){
            Pair tp=pq.poll();
            int secInd=tp.second;
            howMany[secInd]++;

            double inidiff=arr[secInd+1]-arr[secInd];
            double secLength=inidiff/(double)(howMany[secInd]+1);
            pq.add(new Pair(secLength,secInd));
        }
        return pq.peek().first;
    }
    public static void main(String[] args){
        int[] arr={1, 2, 3, 4, 5};
        double ans=minimiseMaximumDistance(arr,4);
        System.out.println(ans);
    }
}

*/





/*
//Find the median of two sorted array by using brute force approach
import java.util.*;
class Solution{
    static double findMedian(int[] nums1,int[] nums2){
        int n=nums1.length;
        int m=nums2.length;
        int[] merge=new int[n+m];
        int k=0;

        for(int i=0;i<n;i++){
            merge[k++]=nums1[i];
        }
        for(int j=0;j<m;j++){
            merge[k++]=nums2[j];
        }
        Arrays.sort(merge);
        int total=merge.length;
        if(total%2==1){
            return (double) merge[total/2];
        }
        else{
            int middle1=merge[total/2-1];
            int middle2=merge[total/2];
            return ((double)middle1+(double)middle2)/2.0;
        }

    }
    public static void main(String[] args){
        int[] nums1={1,3};
        int[] nums2={2};
        double ans=findMedian(nums1,nums2);
        System.out.println(ans);
    }
}

*/






/*
//Find the median number of two sorted array by using better approach
import com.sun.security.jgss.GSSUtil;

import java.util.*;
class Solution{
    static double findMedian(int[] nums1,int[] nums2){
        int n=nums1.length;
        int m=nums2.length;
        int i=0,j=0,m1=0,m2=0;
        for(int count=0;count<=(n+m)/2;count++){
            m2=m1;
            if(i!=n && j!=m){
                if(nums1[i]>nums2[j]){
                    m1=nums2[j++];
                }
                else{
                    m1=nums1[i++];
                }
            }
            else if(i<n){
                m1=nums1[i++];
            }
            else{
                m1=nums2[j++];
            }
        }
        if((n+m)%2==1){
            return (double)m1;
        }
        else{
            double ans=(double)m1+(double)m2;
            return ans/2.0;
        }
    }
    public static void main(String[] args){
        int[] nums1={1,3};
        int[] nums2={2};
        double ans=findMedian(nums1,nums2);
        System.out.println(ans);
    }
}

*/










/*
//Find the median number of two sorted array by using binary search algorithm (Optimal Approach)
import java.util.*;

 class tUf {
    public static double median(int[] a, int[] b) {
        int n1 = a.length, n2 = b.length;
        //if n1 is bigger swap the arrays:
        if (n1 > n2) return median(b, a);

        int n = n1 + n2; //total length
        int left = (n1 + n2 + 1) / 2; //length of left half
        //apply binary search:
        int low = 0, high = n1;
        while (low <= high) {
            int mid1 = (low + high) / 2;
            int mid2 = left - mid1;
            //calculate l1, l2, r1 and r2;
            int l1 = (mid1 > 0) ? a[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? b[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n1) ? a[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < n2) ? b[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                if (n % 2 == 1) return Math.max(l1, l2);
                else return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
            } else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0; //dummy statement
    }

    public static void main(String[] args) {
        int[] a = {2,4,6};
        int[] b = {1,3};
        System.out.println("The median of two sorted arrays is " + median(a, b));
    }
}

*/









/*
//Merge given arr1 & arr2 and find out the kth position array element by using two pointer method (Naive Approach)
import java.util.*;
class Solution{
    static int findkthElement(ArrayList<Integer> arr1,ArrayList<Integer> arr2,int n, int m, int k){
        int p1=0,p2=0,counter=0,ans=0;
        while(p1<n && p2<m){
            if(counter==k) break;
            else if(arr1.get(p1)<arr2.get(p2)){
                ans=arr1.get(p1);
                ++p1;
            }
            else{
                ans=arr2.get(p2);
                        ++p2;
            }
            ++counter;
        }

        if(counter!=k){
            if(p1!=n){
                ans=arr1.get(k-counter);
            }
            else{
                ans=arr2.get(k-counter);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        ArrayList<Integer> arr1=new ArrayList<>(Arrays.asList(2,3,6,7,9));
        ArrayList<Integer> arr2=new ArrayList<>(Arrays.asList(1,4,8,10));
        int n=arr1.size();
        int m=arr2.size();
        int ans=findkthElement(arr1,arr2,n,m,5);
        System.out.println(ans);
    }
}


*/






/*
//Find the  row index which has the maximum 1s by using Naive Approach(2 for loop approach)
import java.util.*;
class Solution{
    static int find1sRow(int[][] matrix,int n,int m){
        int cnt_max=0;
        int index=-1;
        for(int i=0;i<n;i++){
            int cnt_ones=0;
            for(int j=0;j<m;j++){
                cnt_ones+=matrix[i][j];
            }
            if(cnt_ones>cnt_max){
                cnt_max=cnt_ones;
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args){
        int[][] matrix={{0,0,0},{0,0,1},{0,1,1}};
        int n=matrix[0].length;
        int m=matrix.length;
        int ans=find1sRow(matrix,n,m);
        System.out.println(ans);
    }
}

*/




/*
//Find the row index number which has maximum 1s by using binary search algorithm (optimal approach)
import java.util.ArrayList;
import java.util.*;
 class Solution
{
    public static int lowerBound(ArrayList<Integer> matrix,int n,int x){
        int low=0,high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(matrix.get(mid)>=x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        } return ans;
    }
    public static int maximumOnesRow(ArrayList<ArrayList<Integer>> matrix, int n, int m){
        //	  Write your code here.
        int cnt_max=0;
        int index=-1;
        for(int i=0;i<n;i++){
            int cnt_ones=m-lowerBound(matrix.get(i), m, 1);
            if(cnt_ones>cnt_max){
                cnt_max=cnt_ones;
                index=i;
            }
        }
        return index;

    }
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
        matrix.add(new ArrayList<Integer>(Arrays.asList(0,0,0)));
        matrix.add(new ArrayList<Integer>(Arrays.asList(0,0,1)));
        matrix.add(new ArrayList<Integer>(Arrays.asList(0,1,1)));
        int n=3,m=3;
        int ans=maximumOnesRow(matrix, n, m);
        System.out.println(ans);
    }
}

*/








/*
//check whether target value is available in given matrix or not and If available return true else return false (if matrix[0][0]--->matrix[n-1][m-1] is in increasing order(better approach)
import java.util.*;
class Solution{
    static boolean binarySearch(int[] matrix,int target){
        int n=matrix.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(matrix[mid]==target){
                return true;
            }
            else if(matrix[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        } return false;
    }
    public static boolean searchMatrix(int[][] matrix,int target){
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            if(matrix[i][0]<=target && target<=matrix[i][m-1]){
                return binarySearch(matrix[i],target);
            }
    }
        return false;
}
public static void main(String [] args){
    int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
    boolean ans=searchMatrix(matrix,60);
    System.out.println(ans);
}
}

*/
















/*
//check whether target value is available in given matrix or not and If available return true else return false (if matrix[0][0]--->matrix[n-1][m-1] is in increasing order(Optimal approach)
import java.util.*;
class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int low=0,high=n*m-1;
        while(low<=high){
            int mid=(low+high)/2;
            int row=mid/m,col=mid%m;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        } return false;
    }
    public static void main(String[] args){
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        boolean ans=searchMatrix(matrix,3);
        System.out.println(ans);
    }
}

*/








/*
//check whether target value is available in given matrix or not and If available return true else return false (if matrix[i][0]--->matrix[i][m-1] is in increasing order(better approach)
import java.util.*;
class Solution{
    static boolean binarySearch(int[] matrix,int target){
        int n=matrix.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(matrix[mid]==target){
                return true;
            }
            else if(matrix[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        } return false;
    }
    public static boolean searchMatrix(int[][] matrix,int target){
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
           boolean flag=binarySearch(matrix[i],target);
           if(flag==true){
               return true;
            }
        }
        return false;
    }
    public static void main(String [] args){
        int[][] matrix={{1,3,5,7},{2,8,16,20},{15,30,34,60}};
        boolean ans=searchMatrix(matrix,60);
        System.out.println(ans);
    }
}



*/






/*
//check whether target value is available in given matrix or not and If available return true else return false (if matrix[i][0]--->matrix[i][m-1] is in increasing order(optimal approach)
import java.util.*;
class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int row=0,col=m-1;
        while(row<n && col>=0){
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                row++;
            }
            else {
                col--;
            }
        } return false;
    }
    public static void main(String[] args){
        int[][] matrix={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        boolean ans=searchMatrix(matrix,5);
        System.out.println(ans);
    }
}

*/





/*
//Find a peak element matrix index position  (peak element means an element who is greater than his surrounding top/bottom & left/right array element by using optimal approach
import java.util.*;
 class Solution {
    public static int[] findPeakGrid(int [][]G){
        // Write your code here.
        int startcol=0,endcol=G[0].length-1;
        while(startcol<=endcol){
            int maxrow=0;
            int midcol=startcol+(endcol-startcol);
            for(int row=0;row<G.length;row++){
                maxrow=G[row][midcol]>=G[maxrow][midcol]?row:maxrow;
            }
            boolean leftIsBig=(midcol-1)>=startcol && G[maxrow][midcol-1]>G[maxrow][midcol];
            boolean rightIsBig=(midcol+1)<=endcol && G[maxrow][midcol+1]>G[maxrow][midcol];
            if(!leftIsBig && !rightIsBig){
                return new int[]{maxrow,midcol};
            }
            else if(rightIsBig){
                startcol=midcol+1;
            }
            else {
                endcol=midcol-1;
            }
        }
        return null;
    }
    public static void main(String[] args){
        int[][] G={{1,2,3},{4,5,6},{7,8,9}};
        int[] ans=findPeakGrid(G);
        System.out.print(+ans[0]+ ","+ans[1]);
    }
}


*/







/*
//Find the median of given matrix by using two for loop approach (Brute force approach)
import java.util.*;
class Solution {
    public static int findMedian(int[][] matrix, int m, int n) {
        int[] median = new int[m * n];
        int index = 0;
        for (int i = 0; i < m-1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (matrix[i][j] <= matrix[i + 1][j + 1]) {

                    median[index++] = matrix[i][j];
                }
                else{
                    median[index++]=matrix[i+1][j+1];
                }
            }
        }
        return median[(m * n) / 2];
    }

    public static void main(String[] args) {
        int[][] matrix = {{2, 3, 1}, {4, 1, 2}, {6, 8, 7}};
        int m=matrix.length;
        int n=matrix[0].length;
    int ans =findMedian(matrix,m,n);
        System.out.println(ans);
}
}

*/






/*
//Find the median of given matrix by using two for loop approach (optimal approach)
import java.util.*;
 final class Solution {
    static int countSmallerThanMid(int[] matrix,int mid,int n){
        int l=0,h=n-1;
        while(l<=h){
            int md=(l+h)>>1;
            if(matrix[md]<=mid){
                l=md+1;
            }
            else{
                h=md-1;
            }
        }
        return l;
    }
    public static int findMedian(int matrix[][], int m, int n) {
        // Write your code here
        int low=1,high=1000000000;
        while(low<=high){
            int mid=(low+high)>>1;
            int cnt=0;
            for(int i=0;i<m;i++){
                cnt+=countSmallerThanMid(matrix[i], mid, n);
            }
            if(cnt<=(m*n)/2){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        } return low;
    }

    public static void main(String[] args){
        int[][] matrix={{1,5,7,9,11},{2,3,4,8,9},{4,11,14,19,20}};
        int m=matrix.length;
        int n=matrix[0].length;
        int ans=findMedian(matrix, m, n);
        System.out.println(ans);
    }
}

*/





/*
class Solution {
    public static void main(String[] args) {
        try {
            Float f1 = new Float("3.0");
            int x = f1.intValue();
            byte b = f1.byteValue();
            double d = f1.doubleValue();
            System.out.println(x + b + d);
        } catch (NumberFormatException e) {
            System.out.println("bad number");
        }
    }
}
*/






















































































/*
//Merge given arr1 & arr2 and find out the kth position array element by using binary search algorithm (Optimal approach)
import java.util.ArrayList;
import java.util.*;
 class Solution {
    public static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m, int k) {
        // Write your coder here
        if(n>m){
            return kthElement(arr2, arr1, m, n, k);
        }
        int low=Math.max(0,k-m);
        int high=Math.min(k,n);
        while(low<=high){
            int cut1=(low+high)>>1;
            int cut2=k-cut1;
            int l1=cut1==0?Integer.MIN_VALUE:arr1.get(cut1-1);
            int l2=cut2==0?Integer.MIN_VALUE:arr2.get(cut2-1);
            int r1=cut1==n?Integer.MAX_VALUE:arr1.get(cut1);
            int r2=cut2==m?Integer.MAX_VALUE:arr2.get(cut2);
            if(l1<=r2 && l2<=r1){
                return Math.max(l1,l2);
            }
            else if(l1>r2){
                high=cut1-1;
            }
            else{
                low=cut1+1;
            }

        }
        return 0;
    }
    public static void main(String[] args){
        ArrayList<Integer> arr1=new ArrayList<>(Arrays.asList(2,3,6,7,9));
        ArrayList<Integer> arr2=new ArrayList<>(Arrays.asList(1,4,8,10));
        int n=arr1.size();
        int m=arr2.size();
        int ans=kthElement(arr1, arr2, n, m, 4);
        System.out.println(ans);
    }
}

*/





/*
//remove the outermost parenthesis (optimal approach)
import java.util.*;
class Solution{
    static String removeOutermostParenthesis(String s){
        int len=s.length();
        StringBuilder sb=new StringBuilder();
        char[] ch=s.toCharArray();
        int open=1;
        for(int i=1;i<len;i++){
             if(ch[i]=='('){
                 open++;
                 if(open>1)sb.append(ch[i]);
             }
             else{
                 if(open>1)sb.append(ch[i]);
                 open--;
             }
        } return sb.toString();
    }
    public static void main(String[] args){
        String s="(()())(())";
        String ans=removeOutermostParenthesis(s);
        System.out.println(ans);
    }
}

*/






/*
//Find the number of Valid Parenthesis by using Optimized solution
import java.util.*;
class Solution{
    static int  findValidParenthesis(String s){
        int len=s.length();
        int currentDepth=0;
        int maxDepth=Integer.MIN_VALUE;

        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                currentDepth++;
                maxDepth=Math.max(maxDepth,currentDepth);
            }
            else if(ch==')'){
                currentDepth--;
            }
        }
        return maxDepth;
    }
    public static void main(String[] args){
        String s="(((()))))";
        int ans=findValidParenthesis(s);
        System.out.println(ans);
    }
}

*/





/*
//Reverse String words e.g Input :String s="India is a world Champion Nation" O/P:"Nation Champion world a is India"
import java.util.*;
class Solution{
    static String reverseStringWords(String s){
        int n=s.length();
     String[] str=s.trim().split("\\s+");
     StringBuffer ans=new StringBuffer();
     for(int i=str.length-1;i>=0;i--){
         ans.append(str[i]);
         ans.append(' ');
       }
     return ans.toString().trim();
}
public static void main(String[] args){
    String s="I am a star";
    String ans=reverseStringWords(s);
    System.out.println(ans);
    }
}
*/







/*
//Return the Largest odd Number from the given string(Optimized solution)
import java.util.*;
class Solution{
    static String findLargestOddNum(String s){
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)%2==1){
                return s.substring(0,i+1);
            }
        } return "";
    }
    public static void main(String [] args){
        String s="3542";
        String ans=findLargestOddNum(s);
        System.out.print(ans);
    }
}

*/




/*
//Return Common Prefix from the given String array (optimized solution)
import java.util.*;
class Solution{
    static String longestCommonPrefix(String[] strs){
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int strCom=0;
        while(strCom<s1.length() && strCom<s2.length()){
            if(s1.charAt(strCom)==s2.charAt(strCom)){
                strCom++;
            }
            else{
                break;
            }
        }
        return s1.substring(0,strCom);
    }
    public static void main(String[] args){
        String[] strs={"flower","fly","flight"};
        String ans=longestCommonPrefix(strs);
        System.out.print(ans);
    }
}

*/




/*
//Check whether the given strings are isomorphic or not (by using Array hashing method)
import java.util.*;
class Solution{
    static boolean isIsomorphic(String s,String t){
        if(s.length()!=t.length())return false;
        int[] map1=new int[26];
        int[] map2=new int[26];
        for(int i=0;i<s.length();i++){
            map1[s.charAt(i)-'a']++;
            map2[t.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(map1[s.charAt(i)-'a']!=map2[t.charAt(i)-'a']){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s="added";
        String t="error";
        boolean ans=isIsomorphic(s,t);
        System.out.println(ans);
    }
}

*/






/*
//check whether the given string  is isomorphic or not by using HashMap
import java.util.*;
class Solution{
    static boolean isIsomorphic(String s,String t){
        Map m=new HashMap();
        for(int i=0;i<s.length();++i){
            if(!Objects.equals(m.put(s.charAt(i),i),m.put(t.charAt(i)+ "", i))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s="added";
        String t="error";
        boolean ans=isIsomorphic(s,t);
        System.out.println(ans);
    }
}
*/







/*
//Check whether the given strings are anagrams(anagram means if the alphabets in both given strings are similar but these alphabets placing positions are diff)  pair or not
import java.util.*;
class Solution{
    static boolean isAnagram(String str1, String str2){
        if(str1.length()!=str2.length()) return false;
        char[] s1=str1.toCharArray();
        char[] s2=str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(Arrays.equals(s1,s2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        String str1="anagram";
        String str2="nagaram";
        boolean ans=isAnagram(str1,str2);
        System.out.println(ans);
    }
}

*/






/*
//check whether string s after some rotation can become String goal or not (Naive approach)
import java.util.*;
 class Solution {
    public static int isCyclicRotation(String p, String q)  {

        if(p.length()!=q.length()){
            return 0;
        }
        if(p.length()==0){
            return 1;
        }
        for(int i=0;i<p.length();i++){
            if(rotateString(p,q,i)){
                return 1;
            }
        }
        return 0;

    }
    private static boolean rotateString(String p,String q,int rotation){
        for(int i=0;i<p.length();i++){
            if(p.charAt(i)!=q.charAt((i+rotation)%q.length())){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String p="abfyg";
        String q="gabfy";
        int ans=isCyclicRotation(p, q);
        System.out.println(ans);
    }
}
*/





/*
//check whether the given String s after some rotation can become a String goal or not by using optimal approch
import java.util.*;
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
        return((s+s).indexOf(goal)>=0);
    }
    public  void main(String[] args){
        String s="abcde";
        String goal="cdeab";
        boolean ans=rotateString(s,goal);
        System.out.println(ans);
    }
}
*/





/*
//return the given String character in decreasing order of their frequencies (Naive approach)
import java.util.*;
class Solution{
    static String sortStringInDecreasingOrder(String s){
      int n=s.length();
      HashMap<Character,Integer> data=new HashMap<>();
      for(int i=0;i<n;i++){
          char c=s.charAt(i);
          data.put(c,data.getOrDefault(c,0)+1);
      }
      List<Map.Entry<Character,Integer>> freq=new ArrayList<>(data.entrySet());
      Collections.sort(freq,(a,b)-> b.getValue()-a.getValue());
      StringBuffer sb=new StringBuffer();
      for(Map.Entry<Character,Integer> sort:freq){
          char ch=sort.getKey();
          int frequency=sort.getValue();
          for(int i=0;i<frequency;i++){
              sb.append(ch);
          }
      } return sb.toString();
    }

    public static void main(String[] args){
        String s = "tree";
        String ans = sortStringInDecreasingOrder(s);
        System.out.println(ans);
    }
}
*/










/*
//return the given String character in decreasing order of their frequencies (Optimized Solution)
import java.util.*;
class Solution {
    static String sortStringInDecreasingOrder(String s) {
        int n = s.length();
        HashMap<Character,Integer> data=new HashMap<>();
        for(char c:s.toCharArray()) {
            data.put(c, data.getOrDefault(c, 0) + 1);
        }
        List<Character> chars=new ArrayList<>(data.keySet());
        Collections.sort(chars,(a,b)-> data.get(b)-data.get(a));
        StringBuilder sb=new StringBuilder();
        for(Object ch:chars){
            for(int i=0;i<data.get(ch);i++){
                sb.append(ch);
            }

        } return sb.toString();

    }

    public static void main(String[] args) {
        String s = "tree";
        String ans = sortStringInDecreasingOrder(s);
        System.out.println(ans); // This should now produce the correct output: "eert"
    }
}


*/






/*
//Find the sum of the given roman number string (Optimized solution)
import java.util.*;
 class Solution {
    public static int romanToInt(String s) {
        // Write your code here
        int n=s.length();
        Map<Character,Integer> m=new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        int ans=0;
        for(int i=0;i<n;i++){
            if(i<n-1 && m.get(s.charAt(i)) < m.get(s.charAt(i+1))){
                ans-=m.get(s.charAt(i));
            }
            else{
                ans+=m.get(s.charAt(i));
            }
        } return ans;
    }
    public static void main(String[] args){
        String s="XII";
        int ans=romanToInt(s);
        System.out.println(ans);
    }
}

*/


























































































































































































































































































































































































































































































































































































































































































































