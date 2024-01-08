package practice;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
	String car =s.nextLine();
	switch (car) {
	case "BMW": System.out.println("BMW is the fastest car");
	break;
	case "audi": System.out.println("audi is the fastest car");
	break;
	case "hyndai": System.out.println("hyndai is the fastest car");
	break;
	case "woswakan": System.out.println("woswokan is the fastest car");
	break;
	case "tata": System.out.println("tata is the fastest car");
	break;
	default:System.out.println("bike is best!!!!!!!!!!!!!");
	}
	
	s.close();

	}

}
