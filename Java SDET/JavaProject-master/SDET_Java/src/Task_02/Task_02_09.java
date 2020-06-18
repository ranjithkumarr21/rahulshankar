package Task_02;

public class Task_02_09 {

	public static void main(String[] args) {

		// Converting Character into String
		char ch = 'c';
		String st = Character.toString(ch);
		System.out.println("The string is: " + st);

		// Converting String into Character
		String str = "Hello";
		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			System.out.println("Character at " + i + " Position: " + ch1);
		}

	}

}
