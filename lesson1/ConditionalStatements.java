public class ConditionalStatements {

	public static void main(String[] args) {
		int age = 25;
		if (age > 20) {
			System.out.println("adult");
		}

		boolean isMale = true;
		if (isMale) {
			System.out.println ("man");
		}
		if (!isMale) {
			System.out.println ("woman");
		}

		float height = 1.95f;
		if (height < 1.80) {
			System.out.println ("short");
		} else {
			System.out.println ("tall");
		}

		char firstLetterName = 'K';
		if (firstLetterName == 'M') {
			System.out.println ("Max?");
		} else if (firstLetterName == 'I') {
			System.out.println ("Ivan?");
		} else {
			System.out.println ("Не угадали");
		}
	}
}