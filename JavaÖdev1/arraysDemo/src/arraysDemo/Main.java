package arraysDemo;

public class Main {

	public static void main(String[] args) {
		
		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Salih";
		String ogrenci4 = "Ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		
		// Yukar�da t�m bilgiler println ile tek tek yazd�r�yoruz. Ama burada 4 bilgi var ya 1000 olsayd� ne olacakd�?
		
		System.out.println("------------------------------");
		
		// -------------------------------------
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		// println ile 1000 tane kod olursa nas�l yazcaz diye d���nm��t�k. Bu noktada bir dizi tan�ml�yoruz ve i�ine dizinin hangi eleman�nda hangi bilginin sakl� oldu�unu yaz�yoruz. Daha sonra for d�ng�s� i�erisinde int bir i de�eri tan�ml�yoruz ve bunu 0 dan ba�lat�p bizim dizimizin uzunlugunun 1 eksik de�erine kadar 1 er 1 er art�r�yoruz. Dizimizin uzunlugunu length komutu ile buluyoruz. Bu kurallara g�re for d�ng�s�n�n i�erisine giriyor ve s�ras�yla dizimizin elemanlar�n� yazd�r�yoruz. 
		
		System.out.println("------------------------------");
		
		// -------------------------------------
		// Alttaki �ekilde de �grenciler dizisi i�erisindeki ��rencileri gez ve bunlar� yazd�r demek istiyoruz.
		
		for(String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		
		
	}

}
