
public class ProductValidator {

	static {
		System.out.println("Satic yap�c� blok �al��t�");
	}

	public ProductValidator() {
		System.out.println("Yap�c� blok �al��t�");
	}

	public static boolean isValid(Product product) { // static dersek ProductValidator bir kez olu�turulur ve sadece bu
														// kullan�l�r.
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	// Yukardaki i�lemlerde biz ana class � static yapamay�z. Ama a�a��da ki
	// kullan�mda yapabiliriz.

	// inner class
//	public static class BaskaBirClass{
//		public static void Sil() {
//			
//		}
//	}

}
