package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 25;
		int remainder = number % 2; // number'daki say�n�n 2 ye b�l�m�nden kalan neyse remainder ona e�ittir.
		boolean isPrime = true;
		
		if(number == 1) { 
			System.out.println("Say� asal de�ildir");
			return; // burdan sonraki kodlar�n �al��mamas�n� sa�lar.
		}
		
		if(number < 1) {
			System.out.println("Ge�ersiz say�");
			return; // burdan sonraki kodlar�n �al��mamas�n� sa�lar.
		}
		
		for(int i=2; i<number; i++) { // i de�erini 2 den ba�latarak tan�mlad���m�z number de�erinden bir �nceki say�ya kadar 1 er 1 er art�r�yoruz.
			if(number % i == 0) { // number de�erinin i de�erine b�l�m�nden kalan 0 ise if 'in i�ine girer ve isPrime de�erini false yapar.
				isPrime = false;
			}
		}
		
		if(isPrime) { // burada isPrime de�eri true kabul edilir.
			System.out.println("Say� asald�r");
		}else {
			System.out.println("Say� asal de�ildir");
		}

	}

}
