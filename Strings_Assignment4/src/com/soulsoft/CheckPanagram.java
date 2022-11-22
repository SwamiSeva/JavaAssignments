package com.soulsoft;

import java.util.Scanner;

public class CheckPanagram {

		public static void main(String args[])  
		{  
			

			//Panagram is the word or sentence which contains every letter of alphabet at least once.
			//e.g: abcdefghijklmnopqrstuvwxyz
			
		Scanner scan = new Scanner(System.in);  
		System.out.print("Enter the string: ");  
		
		String str = scan.nextLine();  
		
		int strLen=str.length(); 
		
		int arr[] = new int[26];  
		
		for(int i=0;i<26;i++)  
		{  
		   
		arr[i]=0;  
		}  
		
		for(int i=0;i<strLen;i++)  
		{  
		if(str.charAt(i)!=' ')  
		{  
		
		arr[str.charAt(i)-'a']++;  
		} }
		
		int temp=0;  
		for(int i=0;i<26;i++)  
		{  
		   
		if(arr[i]==0)  
		{  
		     
		temp=1;  
		break;  
		}  
		}    
		if(temp==1)  
		{  
		System.out.println("The string is not a pangram string.");  
		}  
		else  
		{  
		System.out.println("The string is a pangram string.");  
		}  
		}  
		
	}


