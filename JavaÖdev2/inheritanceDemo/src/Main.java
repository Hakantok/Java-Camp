// Bir class sadece bir kez ba�ka bir class � extends edebilir.

public class Main {

	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new AskerKrediManager());
		

	}

}
