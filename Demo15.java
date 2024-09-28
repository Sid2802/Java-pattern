package Pattern1;

public class Demo15 {

	public static void main(String[] args) {
		for (int i = 4; i >= 0; i--) // for rows
		{
			for (int j = 0; j <= i; j++) // for columns
			{
				System.out.print(" * ");

			}

			System.out.println();
		}
	}

}
