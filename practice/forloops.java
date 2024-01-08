package practice;
import java.util.Scanner;
public class forloops {
public static void main(String[] args) {
	 //for loop statement 
	/* for (int i=100;i<=1000;i=i*2)
	{
		System.out.println(i);
	}
System.out.println("wellcome to utube channel"); */
	
	
	
	//nested loops
	
	
	Scanner sc=new Scanner(System.in);
	
	int height;
	int width;
	String symbol;
	
	
	System.out.println("enter the height");
	height =sc.nextInt();
	System.out.println("enter the width");
	width=sc.nextInt();
			System.out.println("enter the sysmbol");
	symbol=sc.next();
	
	
	for(int i=1;i<=height;i++) {
		System.out.println();
	for(int j=1;j<=width;j++)
	{
		System.out.print(symbol);
	}
}
}
}
