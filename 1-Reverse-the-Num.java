// Question
/*Given an Integer N, write a program to reverse it.

Input
The first line contains an integer T, total number of testcases. Then follow T lines, each line contains an integer N.

Output
For each test case, display the reverse of the given number N, in a new line.

Constraints
1 ≤ T ≤ 1000
1 ≤ N ≤ 1000000

Example

Input
4
12345
31203
2123
2300

Output
54321
30213
3212
32  */


//Solution

import java.util.*;
import java.lang.*;
import java.io.*;

class Sol
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int i=0; i<test; i++){
		try{
		
		long num=scan.nextLong();
		long rev=0;
		while(num!=0){
		    long rem=num%10;
		    rev=rev*10+rem;
		    num=num/10;
		}
		System.out.println(rev);
		}
		catch(Exception e){return;}
	}	    
	}
}
