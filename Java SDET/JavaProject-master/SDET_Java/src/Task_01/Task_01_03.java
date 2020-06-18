package Task_01;

import java.util.Scanner;

public class Task_01_03 {

@SuppressWarnings("resource")
public static void main(String[] args) {
		
		int A[]=new int[100];
		int q[]=new int[100];
		int b[]=new int[100];
		int k=0;
		int n,query;
		System.out.println("Enter the number of elements and number of queries\n");
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		query=input.nextInt();
		System.out.println("Enter the elements\n");
		for(int i=0;i<n;i++)
		{
			A[i]=input.nextInt();
		}
		System.out.println("Enter the Queries\n");
		for(int i=0;i<query;i++)
		{
			q[i]=input.nextInt();
		}
		
		
		for(int j=0;j<query;j++)
		{
			int nextLarge=0;
			int c=0;
		  for(int i=0;i<n;i++) 
		  {
			if(q[j]>A[i])
			{	
				c++;
				b[k]=A[i];
				if(nextLarge<b[k])
				{
					nextLarge=b[k];
				}
				k++;
			}
			
		  }
		  
		  if(c==0) {
			  nextLarge=q[j];
		  }
		  System.out.println("The Greatest Number That is Smaller Than "+q[j]+" is "+nextLarge);
		}
	}
}
