public class Buyer 
{
	private String brand1;
	private String year1;
	private String body1;
	private String box1;
	private String drive1;
	private String price1;
	private String mileage1;
	
	public void init(String brand1, String year1, String body1, String box1, String drive1, String price1, String mileage1) 
	{
		this.brand1 = brand1; //�����
		this.year1 = year1;
		this.body1 = body1; //�����
		this.box1 = box1; //�������
		this.drive1 = drive1; //������
		this.price1 = price1; //����
		this.mileage1 = mileage1; //������
	}
	
	public void result(Seller men1, Car mers)
	{
		if (((brand1.equals(mers.getBrand()))||((brand1.equals(""))))&((year1.equals(mers.getYear()))||((year1.equals(""))))&((body1.equals(mers.getBody()))||((body1.equals(""))))&((box1.equals(mers.getBox()))||((box1.equals(""))))&((drive1.equals(mers.getDrive()))||((drive1.equals(""))))&((price1.equals(mers.getPrice()))||((price1.equals(""))))&((mileage1.equals(mers.getMileage()))||((mileage1.equals("")))))
		{
			System.out.println("\n                      ���������� ������:");
			System.out.println("�������: " + men1.getSurname());
			System.out.println("���: " + men1.getName());
			System.out.println("��������: " + men1.getPatronymic());
			System.out.println("�������: " + men1.getNumber());
			System.out.println("�����: " + men1.getCity());
			System.out.println("�����: " + mers.getBrand());
			System.out.println("��� �������: " + mers.getYear());
			System.out.println("�����" + mers.getBody());
			System.out.println("�������: " + mers.getBox());
			System.out.println("������: " + mers.getDrive());
			System.out.println("����: " + mers.getPrice() + " ���");
			System.out.println("������: " + mers.getMileage() + " ��");
		}
		else System.out.println("\n������ �� �������");
	}
}
