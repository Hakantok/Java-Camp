// Bir class sadece bir kez baþka bir class ý extends edebilir.

public class Main {

	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new AskerKrediManager());
		

	}

}
