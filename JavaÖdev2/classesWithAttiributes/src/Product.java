public class Product {
	
	// Solid Prensibi => Tek sorumluluk prensibidir. Burada bir class sadece bir i�i yapar, bir metod sadece bir i�i yapar.
	// int id, String name gibi de�erlerin ba��na herhangi bir �ey yazmazsak public olarak atam�� oluruz. Public demek her yerden eri�ilebilir olmakt�r.
	// Biz de�erlerin ba��na private yazarsak public olmaktan ��kar ve bu de�erler sadece bulundu�u blokta ge�erli olur.
	// Getter ve Setter i�leminden sonra Set olan k�sm� silersek kullan�c�n�n o bilgiyi degi�tirememesini sa�lar�z.
	// Belirledi�imiz de�erlerimize attiribute veya field diyebiliriz.
	// "public Product()" olarak belirlersek e�er burada constructor yapm�� oluruz. Bu constructor'a Main.java i�erisinde olu�turdu�umuz "new Product()" dan eri�im sa�lar�z.
	// "public Product()" daki parantezin i�erisine biz de�erler girersek e�er parametreli constructor olu�turmu� oluruz. Bu de�erleri Main.java i�erisindeki "new Product()" k�sm�ndaki parantez i�erisinde kullanmaksa hata al�r�z. 
	// Biz iki adet constructor olu�turabiliriz. Birisi parametreli birisi parametresiz olur. Bu �ekilde yapt���m�z i�leme Overloading yani a��r� y�kleme diyoruz.
	
	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		System.out.println("Yap�c� blok �al��t�");
		this.id = id;
		this.renk = renk;
		this.name = name;
		this.price = price;
		this.description = description;
		this.stockAmount = stockAmount;
	}
		
	public Product() {
		
	}
	
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0,1) + id; // Burada name'in ilk harfinin ve id nin birle�tirilmesini sa�lad�k.
	}
}











