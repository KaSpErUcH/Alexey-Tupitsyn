public class Task_2 
{
	public static void main(String[] args) 
	{
		String text = "Из природных аномалий \nЭта всех других странней... \nВ старину не  понимали: \nКак берётся это в ней?\n \nКоромысла и оглобли \nШлемы, палицы, мечи…\nЭй, вы там вверху оглохли? \nВсё давай на стол мечи!\n \nВек от века проверялось\nИ доказано давно: \nГДЕ бы ЧТО не потерялось -\nЗДЕСЬ находится оно.\n \nГайки, брошки, изумруды, \nПрошлогодний бутерброд…\nЭто, братцы, не Бермуды! \nЭто вам - наоборот!\n \nДаже то, что потерялось\nВ треугольнике Бермуд, \nЗдесь вам - раз! - отковырялось?! \nЗдесь чужого не берут.\n \nЗнай, растяпы и тетери: \nПотеряли кошелек -\nНе горюйте о потере, \nОтправляйтесь в путь далёк!\n \nПоторапливайтесь ходко, \nПрекращайте злой бубнёж -\nВ чудном городе Находка\nЧто посеял, то пожнёшь!";
		int n=0,prob=0,maxprob=0;
		for (int i = 0;i<text.length();i++)
		{
			if (text.charAt(i)==' ')
				prob++;
			if (text.charAt(i)=='\n')
				{
					n++;
					if (prob>maxprob)
						maxprob = prob;
					prob = 0;
				}
		}
		String[][] words = new String[n+1][maxprob];
		String[] stroki = text.split("\n");
		for (int i=0; i<stroki.length;i++)
			words[i] = stroki[i].split(" ");
		for (int i=0; i<stroki.length; i++)
			{
				for (int j=0; j<words[i].length; j++)
				{
					System.out.print(words[i][j]+" ");
				}
				System.out.println();
			}
		System.out.println();
		System.out.println("Слова, в которых есть подстрока 'на'");
		for (int i=0; i<stroki.length; i++)
		{
			for (int j=0; j<words[i].length; j++)
				if (words[i][j].indexOf("на") != -1)
			System.out.print(words[i][j]+" ");
		}
	}
}