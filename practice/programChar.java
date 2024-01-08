package practice;

public class programChar {

	public static void main(String[] args) {
		String s1="javasql";
				String s2= "";
				for (int i=0;i<s1.length();i++)
				{ 
					char ch = s1.charAt(i);
					if(ch>='a'&&ch<='z')
					{
						s2 = s2+(char)(ch+32);
					}
				}
				System.out.println(s2);
	}

}
