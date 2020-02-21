/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    public static int sum=0;
	public static void main (String[] args) {
    	  int n=253;
    	  rec(n);
	}
	static int rec(int n){
	    if(n==0)
	    {
	        System.out.println("The output is "+sum);
	        return 0;
	    }
	    sum=sum+n%10;
	    return(rec(n/10));
	}
}
