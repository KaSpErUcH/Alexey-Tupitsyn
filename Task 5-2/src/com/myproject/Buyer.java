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
		this.brand1 = brand1; //марка
		this.year1 = year1;
		this.body1 = body1; //кузов
		this.box1 = box1; //коробка
		this.drive1 = drive1; //привод
		this.price1 = price1; //цена
		this.mileage1 = mileage1; //пробег
	}
	public String result(Seller men1, Car mers)
	{
		String s1;
		if (((brand1.equals(mers.getBrand()))||((brand1.equals(""))))&((year1.equals(mers.getYear()))||((year1.equals(""))))&((body1.equals(mers.getBody()))||((body1.equals(""))))&((box1.equals(mers.getBox()))||((box1.equals(""))))&((drive1.equals(mers.getDrive()))||((drive1.equals(""))))&((price1.equals(mers.getPrice()))||((price1.equals(""))))&((mileage1.equals(mers.getMileage()))||((mileage1.equals("")))))
		{
			s1 = "<br> Фамилия: " + men1.getSurname()+" <br> Имя: " + men1.getName()+" <br> Отчество: " + men1.getPatronymic()+" <br> Телефон: " + men1.getNumber()+" <br> Город: " + men1.getCity()+" <br> Марка: " + mers.getBrand()+" <br> Год выпуска: " + mers.getYear()+" <br> Кузов: " + mers.getBody()+" <br> Коробка: " + mers.getBox()+" <br> Привод: " + mers.getDrive()+" <br> Цена: " + mers.getPrice() + " руб <br> Пробег: " + mers.getMileage() + " км";
			return s1;
		}
		else return "Ничего не найдено";
	}
}
