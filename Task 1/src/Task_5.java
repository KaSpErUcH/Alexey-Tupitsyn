import java.util.Scanner;

public class Task_5 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		short a, b;
		char c;
		System.out.println("Введите 2 неотрицательных числа так, чтобы второе было больше первого. Программа выведет все символы в указанном промежутке");
		a = s.nextShort();
		b = s.nextShort();
		if ((a > b) || (a<0) || (b<0))
			System.out.println("Ошибка");
		else
			for (int i = a; i < b; i++)
			{
				c = (char) i;
				System.out.println(c);
			}
		s.close();
	}
}