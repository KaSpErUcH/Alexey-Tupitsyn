import java.util.Scanner;

public class Task_2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a, b, c;
		System.out.println("������� ������������ a, b, c. ������� ����� ����� ��������� ax^2+bx+c=0 ��� ��������� � ���, ��� ������ ���");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		if (b*b - (4*a*c) < 0)
			System.out.println("������ ���");
		else
		{
			if (b*b - (4*a*c) == 0)
				System.out.println("�����: " + (-b/(2*a)));
			else 
			{
				System.out.println("����� 1: " + ((-b + Math.sqrt(b*b - (4*a*c)))/(2*a)));
				System.out.println("����� 2: " + ((-b - Math.sqrt(b*b - (4*a*c)))/(2*a)));
			}
		}
		s.close();
	}
}
