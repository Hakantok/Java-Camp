public class Main {

	// Polymorphism demek �ok bi�imlilik demektir.
	// Belirlenen ana class yani BaseLogger'da olu�turdu�umuz mesaj b�l�m�n� BaseLogger ile extends olan class lar�n i�erisinde farkl� mesajlar verebilmek i�in kullanabiliriz. Bu duruma Override denir.  
	// BaseLogger olarak bir dizi olu�turabiliriz bu dizinin elemanlar� i�erisine ba�ka Loggerlar yaz�yoruz ama hata vermiyor. ��nk� biz di�er Loggerlar� BaseLogger ile extends etmi�tik.
	
	public static void main(String[] args) {
//		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
//		for (BaseLogger logger: loggers) {
//			logger.Log("Log mesaj�");
//		}
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
