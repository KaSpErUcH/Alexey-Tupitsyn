import java.util.Random;

public class Task_4 
{
	public static void main(String[] args) 
	{
		Random random = new Random(System.currentTimeMillis());
		int[][] a = new int[5][8];
		int max = -100;
		for (int i = 0; i<5; i++)
		{
			for (int j = 0; j<8; j++)
			{
				a[i][j] = -99 + random.nextInt(199);
				if (a[i][j] > max)
					max = a[i][j];
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Максимальный элемент массива:" + max);
	}
}