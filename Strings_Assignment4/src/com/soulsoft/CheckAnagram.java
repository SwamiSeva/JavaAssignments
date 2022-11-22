package com.soulsoft;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		//Anagram: anagram is phrase or word which is made by rearranging the another  word
		
		
		//bus-sub,race-care
		
		String str1="race";
		String str2="care";
		
		//logic to make the string lower case
		/*
		 * char ch1[]=new char[10]; for(int i=0;i<str1.length();i++) {
		 * 
		 * char s=str1.charAt(i); if(s>=65&&s<=90) { s=(char) (s+32); ch1[i]=s; } else {
		 * ch1[i]=s; } }
		 */
		
		
		
		//logic to check anagram or not
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		
		int n1=ch1.length;
		int n2=ch2.length;
		
		/*
		 * if(n1!=n2) { System.out.println("Both String are not annagram"); }
		 */
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
	  
	    
	    for(int i=0;i<ch1.length;i++) {
	    	if(ch1[i]==ch2[i]) {
	    		
	    		System.out.println("Both String are anangram");
	    	}
	    	else {
	    		System.out.println("both strings are not anagram");
	    	}
	    }
	    
	    
	    
	    
	    
		
		
		
		
		

	}

}
