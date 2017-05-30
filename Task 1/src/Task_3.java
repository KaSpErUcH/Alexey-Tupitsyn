import java.util.Random;

public class Task_3 
{
	public static void main(String[] args) 
	{
		Random random = new Random(System.currentTimeMillis());
		int[][] a = new int[8][5];
		for (int i = 0; i<8; i++)
		{
			for (int j = 0; j<5; j++)
			{
				a[i][j] = 10 + random.nextInt(90);
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}