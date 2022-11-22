package com.soulsoft;

public class CheckPalindrome {

	public static void main(String[] args) {
		int num=2552;
		int rev=0;
		int original=num;
		int rem;
		
		while(num!=0) {
			
			 rem=num%10;
			 rev=rev*10+rem;
			 num=num/10;
		
		}
		if(original==rev) 
	     
			System.out.println("no is palindrome");
			
		else 
			System.out.println("no is not palindrome");
		
			
	}

}
