package Pattern1;

public class Demo18 {

	public static void main(String[] args) {
		int space = 0;
		int num = 6;
		for (int i = 0; i <= 6; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= num; k++) {
				System.out.print(" " + (i + k) + " ");
			}
			space++;
			num--;
			System.out.println();
		}
	}

}
