package Task_01;

import java.util.Scanner;

public class Task_01_02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str[] = new String[100];
		int dig[] = new int[100];
		int choice;
		int n = 0, m = 0;

		System.out.println("Press 1 for String Array or Press 2 for Integer Array\n");

		Scanner input1 = new Scanner(System.in);

		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		Scanner input4 = new Scanner(System.in);
		Scanner input5 = new Scanner(System.in);

		choice = input3.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Enter the length of string array\n");
			n = input4.nextInt();
			System.out.println("Enter the string array\n");
			for (int i = 0; i < n; i++) {
				Str[i] = input1.nextLine();
			}
			break;
		case 2:
			System.out.println("Enter the length of integer array\n");
			m = input5.nextInt();
			System.out.println("Enter the integer array\n");
			for (int i = 0; i < m; i++) {
				dig[i] = input2.nextInt();
			}
			break;
		default:
			System.out.println("Invalid Input");
		}

		if (choice == 1) {
			for (int i = n - 1; i >= 0; i--) {
				System.out.println(Str[i]);
			}
		}

		else if (choice == 2) {
			for (int i = m - 1; i >= 0; i--) {
				System.out.println(dig[i]);
			}
		}
	}

}
