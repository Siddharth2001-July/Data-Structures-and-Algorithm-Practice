// Question
/*Lapindrome is defined as a string which when split in the middle, gives two halves having the same characters and same frequency of each character. If there are odd number of characters in the string, we ignore the middle character and check for lapindrome. For example gaga is a lapindrome, since the two halves ga and ga have the same characters with same frequency. Also, abccab, rotor and xyzxy are a few examples of lapindromes. Note that abbaab is NOT a lapindrome. The two halves contain the same characters but their frequencies do not match.
Your task is simple. Given a string, you need to tell if it is a lapindrome.

Input:
First line of input contains a single integer T, the number of test cases.
Each test is a single line containing a string S composed of only lowercase English alphabet.
Output:
For each test case, output on a separate line: "YES" if the string is a lapindrome and "NO" if it is not.
Constraints:
1 ≤ T ≤ 100
2 ≤ |S| ≤ 1000, where |S| denotes the length of S
Example:
Input:
6
gaga
abcde
rotor
xyzxy
abbaab
ababc


Output:
YES
NO
YES
YES
NO
NO  */


//Solution

import java.util.*;
import java.lang.*;
import java.io.*;

class Sol
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0){
		String term= scan.next();
		char[] ch=new char[term.length()];
		boolean ans=false;
		for(int i=0; i<ch.length; i++){
		    ch[i]=term.charAt(i);
		}
		if(ch.length%2==0){
		    char[] ch1=Arrays.copyOfRange(ch,0,ch.length/2);
		    char[] ch2=Arrays.copyOfRange(ch,ch.length/2,ch.length);
		    Arrays.sort(ch1);
		    Arrays.sort(ch2);
		    ans=Arrays.equals(ch1, ch2);
		    if(ans==true)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
         }
		else{
		    char[] ch1=Arrays.copyOfRange(ch,0,ch.length/2);
		    char[] ch2=Arrays.copyOfRange(ch,(ch.length/2)+1,ch.length);
		    Arrays.sort(ch1);
		    Arrays.sort(ch2);
		    ans=Arrays.equals(ch1, ch2);
		    if(ans==true)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}	    
		}
	}
}
