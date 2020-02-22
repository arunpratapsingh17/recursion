/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	String str="abc";
	String cur="";
	int index=0;
	rec(str,cur,index);
	}
	static int rec(String str,String cur,int index){
	    if(index==str.length()){
	        System.out.println(cur);
	        return 0;
	    }
	    else{
	        rec(str,cur,index+1);
	        rec(str,cur+str.charAt(index),index+1);
	        return 0;
	    }
	}
}