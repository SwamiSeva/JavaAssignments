package com.soulsoft;

import java.util.Scanner;

class Maxoccur{

	char tempChar=' ', retChar=' ';
	int preCount=0 , count=0;
	
	char getMaxChar(String str) {
  
		for(int i=0;i<str.length();i++) {
			tempChar=str.charAt(i);
			count=1;
			
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
		}
		
		if(preCount<count) {
			retChar=tempChar;
			preCount=count;
			
		}
		return retChar;
	   }
}

public class MaxOccuringChar {

	public static void main(String[] args) {
		
		Maxoccur mx=new Maxoccur();
		
		System.out.println("Enter the input string");
		Scanner scan=new Scanner(System.in);
		
		String str=scan.next();		
		
		char char1=mx.getMaxChar(str);
		System.out.println("The maximum occurance of character is ="+char1);
		
}

	
	
}
