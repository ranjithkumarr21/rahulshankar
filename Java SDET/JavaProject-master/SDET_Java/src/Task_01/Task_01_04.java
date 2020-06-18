package Task_01;

import java.util.Scanner;

public class Task_01_04 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[100];
		int b[]=new int[100];
		int n;

		System.out.println("Enter The number of test cases\n");
		Scanner input =new Scanner(System.in);
		n=input.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
			b[i]=input.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			a[i]=a[i]+b[i];
			b[i]=a[i]-b[i];
			a[i]=a[i]-b[i];
			
			System.out.println(a[i]+" "+b[i]);
		}

	}

}
