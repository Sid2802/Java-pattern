package Pattern1;

public class Demo21 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j)
					System.out.print("o");
				else
					System.out.print("x");
			}
			System.out.println();
		}

	}

}
