package loopDemo;

public class Main {

	public static void main(String[] args) {
		
		// 1 den 10'a kadar olan sayýlarý yazdýrmak için
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
			System.out.println("Döngü Bitti");
			
		// ----------------------------------------------------------
		
		// 1 ile 10 arasýndaki tek sayýlarý yazdýrmak için
		
		for (int i = 1; i < 10; i+=2) {
			System.out.println(i);
		}
			System.out.println("Döngü Bitti");
			
		// ----------------------------------------------------------
			
		
		// 1 ile 10 arasýndaki çift sayýlarý yazdýrmak için ( <= iþareti yerine sadece < yazdýgýmýz için 10 dahil olmaz )
		
		for (int i = 2; i < 10; i+=2) {
			System.out.println(i);
		}
			System.out.println("Döngü Bitti");
			
		// ----------------------------------------------------------
			
		// While Döngüsü
			
		int i=1;
		
		while(i<10) {
			System.out.println(i);
			i++; // i+=2 yazarsak 1 ile 10 arasýndaki tek sayýlarý, baþlangýçtaki i deðerimizi 1 deðilde 2 yaparsak ve burayada i+=2 dersek bu seferde 1 ile 10 arasýndaki çift sayýlarý yazdýrmýþ oluruz 
		}
		System.out.println("While döngüsü bitti");
		
		// ----------------------------------------------------------
		
		// Do-While Döngüsü
		
		int j=100;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("Do-While döngüsü bitti");
		
		// While ile Do-While döngüsü arasýndaki fark : Ýki döngüdede kodlar sýrayla yukardan aþagýya doðru çalýþýr. While döngüsünde önce ilk while þartýna bakar saðlamazsa while içindeki hiç bir kodu yazmaz. Ama Do-While döngüsünde ilk önce Do çalýþýr orada herhangi bir þart olmadýðý için içindeki kod 1 kez çalýþýr daha sonra While a gelir ve þart uymadýgý için bir daha çalýþmaz.
	}

}
