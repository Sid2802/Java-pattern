package Pattern;

public class Demo10 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) // for rows
		{
			for (int j = 0; j < i; j++) // for columns
			{
				System.out.print(" " + (i % 2));

			}
			System.out.println();
		}

	}

}
