package loopDemo;

public class Main {

	public static void main(String[] args) {
		
		// 1 den 10'a kadar olan say�lar� yazd�rmak i�in
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
			System.out.println("D�ng� Bitti");
			
		// ----------------------------------------------------------
		
		// 1 ile 10 aras�ndaki tek say�lar� yazd�rmak i�in
		
		for (int i = 1; i < 10; i+=2) {
			System.out.println(i);
		}
			System.out.println("D�ng� Bitti");
			
		// ----------------------------------------------------------
			
		
		// 1 ile 10 aras�ndaki �ift say�lar� yazd�rmak i�in ( <= i�areti yerine sadece < yazd�g�m�z i�in 10 dahil olmaz )
		
		for (int i = 2; i < 10; i+=2) {
			System.out.println(i);
		}
			System.out.println("D�ng� Bitti");
			
		// ----------------------------------------------------------
			
		// While D�ng�s�
			
		int i=1;
		
		while(i<10) {
			System.out.println(i);
			i++; // i+=2 yazarsak 1 ile 10 aras�ndaki tek say�lar�, ba�lang��taki i de�erimizi 1 de�ilde 2 yaparsak ve burayada i+=2 dersek bu seferde 1 ile 10 aras�ndaki �ift say�lar� yazd�rm�� oluruz 
		}
		System.out.println("While d�ng�s� bitti");
		
		// ----------------------------------------------------------
		
		// Do-While D�ng�s�
		
		int j=100;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("Do-While d�ng�s� bitti");
		
		// While ile Do-While d�ng�s� aras�ndaki fark : �ki d�ng�dede kodlar s�rayla yukardan a�ag�ya do�ru �al���r. While d�ng�s�nde �nce ilk while �art�na bakar sa�lamazsa while i�indeki hi� bir kodu yazmaz. Ama Do-While d�ng�s�nde ilk �nce Do �al���r orada herhangi bir �art olmad��� i�in i�indeki kod 1 kez �al���r daha sonra While a gelir ve �art uymad�g� i�in bir daha �al��maz.
	}

}
