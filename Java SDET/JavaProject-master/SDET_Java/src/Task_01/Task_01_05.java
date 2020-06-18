package Task_01;

import java.util.Scanner;

public class Task_01_05 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T;
		int a[]=new int[100];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of test cases\n");
		T=input.nextInt();
		for(int i=0;i<T;i++)
		{
			a[i]=input.nextInt();
		}
		
		for(int i=0;i<T;i++)
		{
			int x=a[i]/2;
			if(x%2==0)
			{
				System.out.println("YES");
			}
			else
				System.out.println("NO");
		}
	}

}
