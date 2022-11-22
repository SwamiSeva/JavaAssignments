package com.soulsoft;

public class CheckConsoVowls {

public static void main(String[] args) {

String str ="Welcome To Java \"World\" Shraddha";

int cntVowel=0;
int cntConsonant=0;

int cntSpecialChar=0;

String s=str.replace(" ","");
String s1=s.toUpperCase();
System.out.println(s1);
char[]c=s1.toCharArray();

for(int i=0;i<c.length;i++) {
	if(c[i]=='B'||c[i]=='C'||c[i]=='D'||c[i]=='J'||c[i]=='K'||c[i]=='M'||c[i]=='N'||c[i]=='P'||c[i]=='Q'
			||c[i]=='S'||c[i]=='T'||c[i]=='V'||c[i]=='X'|| c[i]=='Z') {
		cntConsonant=cntConsonant+1;
	}
	
	if(c[i]=='O'||c[i]=='A'||c[i]=='E'||c[i]=='G'||c[i]=='H'||c[i]=='I'||c[i]=='L'||c[i]=='R'||c[i]=='U'||c[i]=='W'||c[i]=='Y') {
		cntVowel=cntVowel+1;
	}
	if(c[i]=='\''||c[i]=='\"'||c[i]=='\\'||c[i]=='\t'||c[i]=='\b'||c[i]=='\f'||c[i]=='\n') {
		cntSpecialChar=cntSpecialChar+1;
	}
}
		

   System.out.println("No of Vowels= "+cntVowel);
   System.out.println("No of Consonants= "+cntConsonant);
   System.out.println("No of Special Characters= "+cntSpecialChar);

	}

}
