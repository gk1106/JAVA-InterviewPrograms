package practice;
import  java.util.Scanner;

public class operators {
	public static void main(String[] args) {
		
		Scanner placestore=new Scanner(System.in);
		System.out.println("Wellcome !!!!!!!!!!!!!");
	String place="";
	do
	{
		System.out.println("pls enter your destinganation");
		place =placestore.nextLine();
		
	}
	while(place.isBlank());
	
	System.out.println("your destignation has been confirmated"+"     "+ place);
	
	
	}
}
