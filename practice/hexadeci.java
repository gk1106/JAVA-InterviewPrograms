package practice;

public class hexadeci {

	public static void main(String[] args) {
		int num =960;
		
		char[] ch= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
	String result=" ";
		
		while (num>0) {
			int rem =num%16;
			result=result+ch[rem];
			num=num/16;
			
		}
		System.out.println(result);
	}
}
