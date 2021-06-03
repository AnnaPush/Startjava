public class Cycle {
	
	public static void main(String[] args) {
		for (int i = 0; i < 21; i++) {
			System.out.println(i);
		}

		int j = 6;
		while (j >= -6) {
			System.out.println(j);
			j -= 2;
		}

		int m = 10;
		int sumOdd = 0;
			do {
				if (m % 2 != 0) {
					sumOdd += m;
				}
				m++;
			} while (m <= 20);

			System.out.println(result);
		}
	}