package Pattern;

public class Demo3 {

	public static void main(String[] args) {
		int num = 1;
		for (int i = 0; i < 5; i++) // for rows
		{
			for (int j = 0; j < 5; j++) // for columns
			{
				System.out.print(num + " ");
			}
			num++;
			System.out.println();
		}

	}

}
