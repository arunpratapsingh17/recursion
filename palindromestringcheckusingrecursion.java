/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		String str="abhinav";
		recu(str);
	}
	static int recu(String str){
	    if(str.length()==0||str.length()==1){
	        System.out.println("Yes a palindrome");
	        return 0;
	    }
	    if(str.charAt(0)==str.charAt(str.length()-1))
	    {
	        return(recu(str.substring(1,str.length()-1)));
	    }
	    else {
	        System.out.println("Not a palindrome string");
	        return 0;
	    }
	}
}
