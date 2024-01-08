package string;

import java.util.Scanner;

public class reverse {
	
	
	
	
	
	private static  void reversemethod(String word )
	{

		
		
		String s2="";
		
		
		
		//for(int i=0;i<s1.length()-1;i++)
		
		
		for(int i=word.length()-1;i>=0;i--)
		{
			s2=s2+word.charAt(i);
			
			
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the word");
		String word=sc.next();
		reversemethod(word);
		
		
	}

}
