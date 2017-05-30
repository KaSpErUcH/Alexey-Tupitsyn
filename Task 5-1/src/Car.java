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
		this.brand = brand; //�����
		this.year = year;
		this.body = body; //�����
		this.box = box; //�������
		this.drive = drive; //������
		this.price = price; //����
		this.mileage = mileage; //������
		System.out.println("\n���������� " + brand + " ��������� �� �������");
	}
	
	public void getInformation()
	{
		System.out.println("\n                      ���������� �� ����������:" );
		System.out.println("�����: " + brand);
		System.out.println("��� �������: " + year);
		System.out.println("�����" + body);
		System.out.println("�������: " + box);
		System.out.println("������: " + drive);
		System.out.println("����: " + price + " ���");
		System.out.println("������: " + mileage + " ��");
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