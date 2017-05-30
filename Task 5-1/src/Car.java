public class Car 
{
	private String brand;
	private String year;
	private String body;
	private String box;
	private String drive;
	private String price;
	private String mileage;
	
	public void init(String brand, String year, String body, String box, String drive, String price, String mileage) 
	{
		this.brand = brand; //марка
		this.year = year;
		this.body = body; //кузов
		this.box = box; //коробка
		this.drive = drive; //привод
		this.price = price; //цена
		this.mileage = mileage; //пробег
		System.out.println("\nАвтомобиль " + brand + " выставлен на продажу");
	}
	
	public void getInformation()
	{
		System.out.println("\n                      Информация об автомобиле:" );
		System.out.println("Марка: " + brand);
		System.out.println("Год выпуска: " + year);
		System.out.println("Кузов" + body);
		System.out.println("Коробка: " + box);
		System.out.println("Привод: " + drive);
		System.out.println("Цена: " + price + " руб");
		System.out.println("Пробег: " + mileage + " км");
	}
	
	public String getBrand() 
	{
		return brand;
	}

	public String getYear() 
	{
		return year;
	}

	public String getBody() 
	{
		return body;
	}

	public String getBox() 
	{
		return box;
	}

	public String getDrive() 
	{
		return drive;
	}

	public String getPrice() 
	{
		return price;
	}

	public String getMileage() 
	{
		return mileage;
	}
}