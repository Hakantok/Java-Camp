
// Ayn� isimde ve ayn� i�lemi yapan 2 adet durum olu�tururuz. Ama ilk durumda 2 adet parametre varken ikinci durumda 3 adet parametre vard�r. Program bu durumda hata vermez ve �al���r bu duruma Method Overloading deriz.

public class DortIslem {
	public int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}
	
	public int topla(int sayi1, int sayi2, int sayi3) {
		return sayi1+sayi2;
	}
}
