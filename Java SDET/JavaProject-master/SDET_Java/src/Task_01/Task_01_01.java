package Task_01;

import java.util.Scanner;

public class Task_01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;
		StringBuilder input1 = new StringBuilder();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The String\n");
		s = input.nextLine();
		input1.append(s);
		input1 = input1.reverse();
		System.out.println(input1);
	}

}
