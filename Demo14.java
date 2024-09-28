package Pattern;

public class Demo14 {

	public static void main(String[] args) {
		int space = 5;
		int a = 1;
		for (int i = 0; i < 6; i++) {

			for (int k = 0; k < space; k++) {
				System.out.print(" ");

				for (int j = 0; j < i; j++) {
					System.out.print(" " + (i + j));

				}
				space--;
				a++;
				System.out.println();
			}
		}
	}
}
