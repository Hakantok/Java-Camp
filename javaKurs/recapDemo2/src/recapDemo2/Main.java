package recapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = {1.2 , 1.3 , 4.3 , 5.6}; // dizinin elemanlar�n� tek tek println ile yazmak yerine bu �ekilde yazabiliriz.
		double total = 0;
		double max = myList[0]; 	// dizinin 0. eleman� max'd�r diyoruz.
		for(double number:myList) {
			if(max<number) {  		// number dizinin i�indeki elemanlar� dola��yor ve bu �arta geldiginde bizim belirledigimiz max tan b�y�kse e�er max'�n yeni de�erinin o de�er oldu�unu belirtiyoruz.
				max = number;
			}
			total += number;
			System.out.println(number);
		}
		
		System.out.println("Toplam = " + total);
		System.out.println("En b�y�k say� = " + max);
	}

}
