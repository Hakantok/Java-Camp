
public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		
		//value
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2 = sayilar1; // dizilerde elemanlar ile birlikte stack k�sm�ndaki numaralarda e�itlenir. �rne�in sayilar1 in stack numaras� 101 sayilar2 nin stack numaras� 102 olsun. Buradaki i�lemi yapt���m�z zaman ikisinin de�eride 101 olur. Bu y�zden sayilar1 in 0. eleman�n� de�i�tirirsek sayilar2 ninde 0.eleman� de�i�ir. 
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);

	}

}
