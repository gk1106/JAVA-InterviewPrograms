package practice;

public class sumofnextvalue {

	public static void main(String[] args) 
	{
		String s1 = "progRAMMING@123.COM ";
		int upper =0;
		int lower =0;
		int digit =0;
		int special =0;
		for(int i=0;i<s1.length();i++)
		{
			char ch =s1.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				digit++;
			}
			else if(ch>='A'&&ch<='Z')
			{
				upper++;
			}
			else if(ch>='a'&&ch<='z')
			{
				lower++;
			}
			else 
			{
				special++;
			}


		}
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(digit);
		System.out.println(special);

	}

}
