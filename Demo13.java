package Pattern;

public class Demo13 {

	public static void main(String[] args) {
		int space = 5;
		int no = 1;
		for (int i = 1; i < 6; i++) {

			for (int k = 0; k < space; k++) {
				System.out.print(" ");
			}
			for (int l = 0; l < no; l++) {
				System.out.print(" " + (i + l));
			}
			space--;
			no++;
			System.out.println();
		}
	}

}
