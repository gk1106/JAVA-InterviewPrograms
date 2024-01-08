package practice;
import java.util.ArrayList;
public class wrapperclass {
  public static void main(String[] args) {
	
	  
	  
	  ArrayList<String> money=new ArrayList<String>();
	  money.add("1 ruppe");
	  money.add("5 rupee");
	  money.add("10 rupee");
	  money.add("100 rupee");
	  money.add("2000 rupee");
	  
	  money.set(3, "500 ruppess");

	 // for(int i =0;i<money.size();i++)
	  for (String i : money)
	  {
		  System.out.println((i));
	  }
  }
}
