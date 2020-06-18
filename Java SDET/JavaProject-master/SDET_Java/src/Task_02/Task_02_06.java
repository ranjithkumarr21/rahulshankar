package Task_02;

public class Task_02_06 {

	public static void main(String[] args) {
		String sentence = "T    his is b  ett     er.";
		System.out.println("Original sentence: " + sentence);

		sentence = sentence.replaceAll("\\s", "");
		System.out.println("After replacement: " + sentence);
	}

}
