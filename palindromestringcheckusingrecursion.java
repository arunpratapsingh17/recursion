/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	  String str="aabaa";
	  int b=str.length();
	  int a=0;
	  rec(str,a,b);
	}
	static int rec(String str,int a,int b)
	{
	    if((a==b)&&(str.charAt(a)==str.charAt(b)))
	    {
	        System.out.println("Yes a palindrome string");
	        return 0;
	    }
	    else if(a>b)
	    {
	        System.out.println("NOt a palindrome");
	        return 0;
	    }
	    else{
	        return(rec(str,a+1,b-1));
	    }
	}
}