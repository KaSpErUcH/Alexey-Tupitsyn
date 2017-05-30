import java.util.Arrays;

public class Task_7 
{
	public static void main(String[] args) 
	{
		String[] s = {"Большая", "Абра", "Кадабра"};
		Arrays.sort(s);
		for (int i=0; i<s.length;i++)
			System.out.println(s[i]);
	}
}