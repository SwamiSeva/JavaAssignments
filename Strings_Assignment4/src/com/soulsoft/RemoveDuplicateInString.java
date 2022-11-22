package com.soulsoft;

public class RemoveDuplicateInString {

	public static void main(String[] args) {
		
		String str="Shraddha";
		
       char[] c=str.toCharArray();
        
        for(int i=0;i<c.length-1;i++) {
        	
        		if(c[i]==c[i+1]) {
        			continue;
        		}
        		 System.out.print(c[i]);
        	}
     
	}

}

