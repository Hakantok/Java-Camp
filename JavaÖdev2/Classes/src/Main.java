
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
		sayilar2 = sayilar1; // dizilerde elemanlar ile birlikte stack kýsmýndaki numaralarda eþitlenir. Örneðin sayilar1 in stack numarasý 101 sayilar2 nin stack numarasý 102 olsun. Buradaki iþlemi yaptýðýmýz zaman ikisinin deðeride 101 olur. Bu yüzden sayilar1 in 0. elemanýný deðiþtirirsek sayilar2 ninde 0.elemaný deðiþir. 
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);

	}

}
