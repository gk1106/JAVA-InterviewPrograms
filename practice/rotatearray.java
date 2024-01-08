package practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class rotatearray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
		int n=1;
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<a.length-1;j++)
			{
				int f=a[j];
				a[j]=a[j+1];
				a[j+1]=f;
			}
		}
		
		
   System.out.println(Arrays.toString(a));
	}

}
