package com.myproject;

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
	}
	
	public String result(Seller men1)
	{
		if ((men1.getSurname()==(""))||(men1.getName()==(""))||(men1.getPatronymic()==(""))||(men1.getNumber()==(""))||(men1.getCity()==(""))||(brand==(""))||(year==(""))||(body==(""))||(box==(""))||(drive==(""))||(price==(""))||(mileage==("")))
		{
			return "��������� ��� ����";
		}
		else 
		{
			return "������ ���������� �� �������";
		}
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
