public class Task_5 {

	public static void main(String[] args) {
		Seller men1 = new Seller();
		men1.init("�������", "�����", "���������", "88005553535", "������");
		men1.getInformation();
		Car mers = new Car();
		mers.init("Mersedes-Benz", "2014", "�����", "��������������", "������", "2550000", "52000");
		mers.getInformation();
		Buyer men2 = new Buyer();
		men2.init("", "2014", "", "", "", "", "");
		men2.result(men1,mers);
	}

}
