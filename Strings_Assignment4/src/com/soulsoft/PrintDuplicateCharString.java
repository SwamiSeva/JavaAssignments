package com.soulsoft;

public class PrintDuplicateCharString {

	public static void main(String[] args) {
		String str="shraddha";
		
		//char tempChar=' ';
		
		int count=0;
	    char[] c=str.toCharArray();
	    char[] dup= new char[10];
	    
	    for(int i=0;i<=c.length-1;i++) {
	        	count =1;
	        	for(int j=i+1;j<=c.length-1;j++) {
	        	if(c[i]==c[j]) {
	        		count++;
	        		dup[i]=c[i];
	        	}
	          	
	        	}
	        	if(count>0) {
	   	    	 System.out.println(dup[i]);
	   	     }
	}
	     
	}
}
