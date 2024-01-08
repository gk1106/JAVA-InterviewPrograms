package practice;

import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		
		
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		System.out.println("ENTER THE NUMBER");
		
		if(num%2==1) {
			
			System.out.println("The number is odd"+num);
		}
		else
		{
			System.out.println("The Number is even"+num);
		
	}
sc.close();

}
}
