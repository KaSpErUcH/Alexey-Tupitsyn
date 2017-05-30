public class Task_5 {

	public static void main(String[] args) {
		Seller men1 = new Seller();
		men1.init("Петрова", "Жанна", "Семеновна", "88005553535", "Москва");
		men1.getInformation();
		Car mers = new Car();
		mers.init("Mersedes-Benz", "2014", "Седан", "Автоматическая", "Полный", "2550000", "52000");
		mers.getInformation();
		Buyer men2 = new Buyer();
		men2.init("", "2014", "", "", "", "", "");
		men2.result(men1,mers);
	}

}
