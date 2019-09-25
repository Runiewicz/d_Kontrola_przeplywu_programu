

public class Main6 {

	public static void main(String[] args) {
		int n = 10;
		boolean parzysta = true;
		boolean nieparzysta = false;
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " - parzysta");
			} else {
				System.out.println(i + " - nieparzysta");
			}
		}
		int i = 0;
		while (i < 10) {
			i++;
			if (i % 2 == 0) {
				System.out.println(i + " - parzysta");
			} else {
				System.out.println(i + " - nieparzysta");
			}
		}

	}
}
