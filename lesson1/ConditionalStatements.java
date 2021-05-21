public class ConditionalStatements {

	public static void main(String[] args) {
		int age = 25;
		boolean isMale = true;
		float height = 1.95f;
		char nameFirstLetter = 'K';
	if (age > 20) {
		System.out.println("adult");
	}
	if (isMale == true) {
		System.out.println ("man");
	}
	if (isMale == false) {
		System.out.println ("woman");
	}

	if (height < 1.80) {
		System.out.println ("short");
	} else {
		System.out.println ("tall");
	}

	if (nameFirstLetter == 'M') {
		System.out.println ("Max?");
	} else if (nameFirstLetter == 'I') {
		System.out.println ("Ivan?");
	} else {
		System.out.println ("Не угадали");
	}

	}
}