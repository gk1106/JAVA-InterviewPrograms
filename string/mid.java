package string;

public class mid {

	public static void main(String[] args)
	{
		int[] arr= {10,20,30,40,50,60};
		
		for(int i=0,j=arr.length-1;j>=i;i++,j--)
		{
		System.out.println(arr[i]+"...>"+arr[j]);	
		}
	}

}
