package practice;
import java.util.*;
public class method {
	public static void main(String[] args) {
	//gk();	
/*		int age=21;
		String name="ganeshkumar";
	gk(name,age);
	}
	static void gk(String name,int age)
	{
		System.out.println("wellcome to our world");
		System.out.println("hello"+name);
		System.out.println("you are "+age+"years old");
		*/
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the fname");
		String fname=sc.next();
		System.out.println("enter the lname");
		String lname=sc.next();
		
	//	String name =uname(fname,lname);
		System.out.println(uname(fname,lname));
		
	}
	static String uname(String fname,String lname)
	{
		
	String	name = fname+lname;
		return name;
	}

}
