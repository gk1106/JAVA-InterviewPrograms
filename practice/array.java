package practice;
//import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		
 //  String[] names= sc.hasNext(names);
   
/* String[] names=new String[4];
 names[0]="vijay";
 names[1]="ajith";
 names[2]="rajini";
 names[3]="kamal";

 
               for(int i=0;i<names.length;i++)
                {
	              System.out.println("the best actors   "+names[i]);
                  }*/
		
		
		String[][] bikes ={ 
				            {"dio","activa","tvs"},
				            {"aprila","ntorque","bullet"},
				            {"susuki","r15","z500"}
				          };
	/*	bikes[0][0]="dio";
		bikes[0][1]="activa";
		bikes[0][2]="tvs";
		bikes[1][0]="aprila";
		bikes[1][1]="ntorque";
		bikes[1][2]="susuki";
		bikes[2][0]="bullet";
		bikes[2][1]="rl5";
		bikes[2][2]="z500";
		*/
	
		for(int i=0;i<bikes.length;i++)
		{
			 System.out.println();
		        for(int j=0;j<bikes[i].length;j++)
		        {
		        	System.out.print(bikes[i][j]+" ");
		        	
		        	
		        	
		        	
		        }
			
		}
	}

}
