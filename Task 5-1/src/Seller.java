public class Seller 
{
	private String surname;
	private String name;
	private String patronymic;
	private String number;
	private String city;
	
	public void init(String surname, String name, String patronymic, String number, String city) 
	{
		this.surname = surname; //фамилия
		this.name = name; //имя
		this.patronymic = patronymic; //отчество
		this.number = number; //телефон
		this.city = city; //город
		System.out.println("Продавец " + surname + " " + name + " " + patronymic + " добавлен");
	}
	
	public void getInformation()
	{
		System.out.println("\n                     Информация о продавце:" );
		System.out.println("Фамилия: " + surname);
		System.out.println("Имя: " + name);
		System.out.println("Отчество: " + patronymic);
		System.out.println("Телефон: " + number);
		System.out.println("Город: " + city);
	}
	
	public String getSurname() 
	{
		return surname;
	}

	public String getName() 
	{
		return name;
	}

	public String getPatronymic() 
	{
		return patronymic;
	}

	public String getNumber() 
	{
		return number;
	}

	public String getCity() 
	{
		return city;
	}
}
