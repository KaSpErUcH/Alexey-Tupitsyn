package com.myproject;

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
