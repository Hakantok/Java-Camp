
// Aynı isimde ve aynı işlemi yapan 2 adet durum oluştururuz. Ama ilk durumda 2 adet parametre varken ikinci durumda 3 adet parametre vardır. Program bu durumda hata vermez ve çalışır bu duruma Method Overloading deriz.

public class DortIslem {
	public int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}
	
	public int topla(int sayi1, int sayi2, int sayi3) {
		return sayi1+sayi2;
	}
}
