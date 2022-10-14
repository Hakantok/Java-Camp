public class Main {

	// Polymorphism demek çok biçimlilik demektir.
	// Belirlenen ana class yani BaseLogger'da oluþturduðumuz mesaj bölümünü BaseLogger ile extends olan class larýn içerisinde farklý mesajlar verebilmek için kullanabiliriz. Bu duruma Override denir.  
	// BaseLogger olarak bir dizi oluþturabiliriz bu dizinin elemanlarý içerisine baþka Loggerlar yazýyoruz ama hata vermiyor. Çünkü biz diðer Loggerlarý BaseLogger ile extends etmiþtik.
	
	public static void main(String[] args) {
//		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
//		for (BaseLogger logger: loggers) {
//			logger.Log("Log mesajý");
//		}
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
