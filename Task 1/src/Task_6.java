import java.util.Scanner;

public class Task_6 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int ten;
		short six;
		char c = 0;
		String answer = "";
		System.out.println("������� ���������� �����. ������� ����� ��� ����� � 16-������ ������� ���������");
		ten = s.nextInt();
		if (ten == 0)
			System.out.println("�����: 0");
		else
			while (ten > 0)
			{
				six = (short) (ten % 16);
				if ((six >= 10) && (six <=15))
					switch (six)
					{
					case 10:
						c = 'A';
						break;
					case 11:
						c = 'B';
						break;
					case 12:
						c = 'C';
						break;
					case 13:
						c = 'D';
						break;
					case 14:
						c = 'E';
						break;
					case 15:
						c = 'F';
						break;
					}			
				else
					c = (char) (six + 48); 
				answer = c + answer;
				ten = ten / 16;
			}
		System.out.println("�����: " + answer);
		s.close();
	}
}