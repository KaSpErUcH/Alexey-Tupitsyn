public class Task_1
{
	public static void main(String[] args) 
	{
		String str=new String ("����-���� ���� � ���������. ������� ���� � ��� ���� ����� ��������, ���� ���� ��������. ��� ������ ����� - �������� ������ ������� � ���� ������ �� �������. ��������� ����, ���������� � ����� � ������: - ��������, ���������! ����������, ����������! ���� ���� ������ - ������ ��������; ����� ������ �� �������, �� ������� �� ����������, �� ���������� �� ���� �����! �������� ������� ����� � ������� ����. ��� �� ��������, ������ � ����� ����� � ���, �������� �������� ������-��������. ���� ���������, ��� ���� ����. ��� ��� ���� ����, ���� ������� � ������� � �������� ������� ��������: - ��, �������! �� ��������! ����������, ����������! ���� ���� ������, ������ ��������. ����� ������� ������!");
		str=str.toLowerCase(); 
		String tmp=new String();
		tmp = str.replace(".", ""); 
		str = tmp;
		tmp = str.replace(",", ""); 
		str = tmp;
		tmp = str.replace(":", ""); 
		str = tmp;
		tmp = str.replace("-", " "); 
		str = tmp;
		tmp = str.replace("!", ""); 
		str = tmp;
		tmp = str.replace(";", ""); 
		str = tmp;
		tmp = str.replace("  ", " "); 
		str = tmp;
		System.out.println(str);
		String[] strParts;
		strParts = str.split(" ");
		for (int n=0; n<strParts.length;n++)
		{
			strParts[n].trim(); 
		}
	
		for (int i=0; i<strParts.length;i++)
		{
			int sum=0;
			if (strParts[i]!=" ")
			{
				System.out.print(strParts[i]+":"); 
				int k=0;
				int[] number=new int[104]; 
				for(int j=0;j<strParts.length;j++)
				{
					if (strParts[i].equals(strParts[j]))
					{ 
						sum=sum+1; 
						number[k]=j;
						k++;
					}
				}
				System.out.print(sum);
				System.out.println();
				for (k=0;k<104;k ++) 
				{
					strParts[number[k]]=" ";
				} 
			}
		}
	}
}