import java.util.Scanner;

public class Task_1
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a, b, aout, bout;
		System.out.println("������� 2 �����. ������� ����� �� �����, ������� ����� � 10");
		a = s.nextInt();
		b = s.nextInt();
		aout = Math.abs(a - 10);
		bout = Math.abs(b - 10);
		if (aout > bout)
			System.out.println("�����: " + b);
		else
			System.out.println("�����: " + a);
		s.close();
	}
}