package practice;

import java.util.Arrays;
import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		int[] arr= {10,1,6,5,3,2,7};
	     int	n1=arr.length;
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j>n1/2;j++)
					
			{
				if (arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
			
			for(int k=n1/2;k<n1-1;k++)
			{
				
				if(arr[k]>arr[k+1])
				{
					int temp=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
