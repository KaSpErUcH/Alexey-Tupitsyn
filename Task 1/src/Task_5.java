import java.util.Scanner;

public class Task_5 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		short a, b;
		char c;
		System.out.println("������� 2 ��������������� ����� ���, ����� ������ ���� ������ �������. ��������� ������� ��� ������� � ��������� ����������");
		a = s.nextShort();
		b = s.nextShort();
		if ((a > b) || (a<0) || (b<0))
			System.out.println("������");
		else
			for (int i = a; i < b; i++)
			{
				c = (char) i;
				System.out.println(c);
			}
		s.close();
	}
}