package com.myproject;

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
	public String result(Seller men1, Car mers)
	{
		String s1;
		if (((brand1.equals(mers.getBrand()))||((brand1.equals(""))))&((year1.equals(mers.getYear()))||((year1.equals(""))))&((body1.equals(mers.getBody()))||((body1.equals(""))))&((box1.equals(mers.getBox()))||((box1.equals(""))))&((drive1.equals(mers.getDrive()))||((drive1.equals(""))))&((price1.equals(mers.getPrice()))||((price1.equals(""))))&((mileage1.equals(mers.getMileage()))||((mileage1.equals("")))))
		{
			s1 = "<br> �������: " + men1.getSurname()+" <br> ���: " + men1.getName()+" <br> ��������: " + men1.getPatronymic()+" <br> �������: " + men1.getNumber()+" <br> �����: " + men1.getCity()+" <br> �����: " + mers.getBrand()+" <br> ��� �������: " + mers.getYear()+" <br> �����: " + mers.getBody()+" <br> �������: " + mers.getBox()+" <br> ������: " + mers.getDrive()+" <br> ����: " + mers.getPrice() + " ��� <br> ������: " + mers.getMileage() + " ��";
			return s1;
		}
		else return "������ �� �������";
	}
}
