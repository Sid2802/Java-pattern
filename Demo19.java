package Pattern1;

public class Demo19 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2 || j == 2)
					System.out.print("x");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
