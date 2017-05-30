package com.myproject;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Task_5Servlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException 
	{
		resp.setContentType("text/html;charset=UTF-8");
		//String[] mas = new String[12]; 
		String surname, name, patronymic, number, city, brand, year, body, box, drive, price, mileage, brand1, year1, body1, box1, drive1, price1, mileage1;
		int task = Integer.parseInt(req.getParameter("task"));
		surname = req.getParameter("surname");
		name = req.getParameter("name");
		patronymic = req.getParameter("patronymic");
		number = req.getParameter("number");
		city = req.getParameter("city");
		brand = req.getParameter("brand");
		year = req.getParameter("year");
		body = req.getParameter("body");
		box = req.getParameter("box");
		drive = req.getParameter("drive");
		price = req.getParameter("price");
		mileage = req.getParameter("mileage");
		Seller men1 = new Seller();
		men1.init(surname, name, patronymic, number, city);
		Car mers = new Car();
		mers.init(brand, year, body, box, drive, price, mileage);
		brand1 = req.getParameter("brand1");
 		year1 = req.getParameter("year1");
 		body1 = req.getParameter("body1");
 		box1 = req.getParameter("box1");
 		drive1 = req.getParameter("drive1");
 		price1 = req.getParameter("price1");
 		mileage1 = req.getParameter("mileage1");
		Buyer men2 = new Buyer();
		men2.init(brand1, year1, body1, box1, drive1, price1, mileage1);
		switch (task)
		{
		
			case 1:
			{
				resp.getWriter().println(mers.result(men1));
				while (task == 2)
				{
					task = 0;
					Seller men11 = new Seller();
					men11.init(surname, name, patronymic, number, city);
					Car mers11 = new Car();
					mers11.init(brand, year, body, box, drive, price, mileage);
					Buyer men21 = new Buyer();
					men21.init(brand1, year1, body1, box1, drive1, price1, mileage1);
					resp.getWriter().println(men21.result(men11, mers11));
				}
				break;
			}
			case 2:
			{
				
				resp.getWriter().println(men2.result(men1, mers));
				break;
			}
		}
	}
}
