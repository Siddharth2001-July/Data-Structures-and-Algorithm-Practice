// Question

/*Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything. More precisely… rewrite small numbers from input to output. Stop processing input after reading in the number 42. All numbers at input are integers of one or two digits.

Sample Input:
1
2
88
42
99
Sample Output:
1
2
88*/

//Solution

import java.util.*;
import java.lang.*;
import java.io.*;

class Sol
{
	public static void main (String[] args) throws java.lang.Exception
	{try{
	    	Scanner scan = new Scanner(System.in);
			while(true){
		    int value = scan.nextInt();
		    if(value == 42 ){
		        break;
		    }
		    System.out.println(value);
		}
		}catch(Exception e){
			return;
		}
	}
}
