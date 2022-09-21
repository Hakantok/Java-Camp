package recapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = {1.2 , 1.3 , 4.3 , 5.6}; // dizinin elemanlarýný tek tek println ile yazmak yerine bu þekilde yazabiliriz.
		double total = 0;
		double max = myList[0]; 	// dizinin 0. elemaný max'dýr diyoruz.
		for(double number:myList) {
			if(max<number) {  		// number dizinin içindeki elemanlarý dolaþýyor ve bu þarta geldiginde bizim belirledigimiz max tan büyükse eðer max'ýn yeni deðerinin o deðer olduðunu belirtiyoruz.
				max = number;
			}
			total += number;
			System.out.println(number);
		}
		
		System.out.println("Toplam = " + total);
		System.out.println("En büyük sayý = " + max);
	}

}
