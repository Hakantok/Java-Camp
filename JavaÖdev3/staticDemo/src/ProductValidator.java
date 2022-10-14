
public class ProductValidator {

	static {
		System.out.println("Satic yapýcý blok çalýþtý");
	}

	public ProductValidator() {
		System.out.println("Yapýcý blok çalýþtý");
	}

	public static boolean isValid(Product product) { // static dersek ProductValidator bir kez oluþturulur ve sadece bu
														// kullanýlýr.
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	// Yukardaki iþlemlerde biz ana class ý static yapamayýz. Ama aþaðýda ki
	// kullanýmda yapabiliriz.

	// inner class
//	public static class BaskaBirClass{
//		public static void Sil() {
//			
//		}
//	}

}
