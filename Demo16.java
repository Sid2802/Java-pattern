package Pattern1;

public class Demo16 {

	public static void main(String[] args) {
		int space = 0;
		int star = 5;
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < star; k++) {
				System.out.print("*");
			}
			space++;
			star--;
			System.out.println();
		}
	}

}
