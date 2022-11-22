package com.soulsoft;

import java.util.HashSet;
import java.util.Set;

public class CheckUniqueChar {

	
	public static void main(String[] args) {
		
		String str="kinaraajamare";
	
		//set does not accept dupliactes so used set here
		Set<Character> set=new HashSet<Character>();
		
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
			
		}
		
		System.out.println(set);
	}
}
