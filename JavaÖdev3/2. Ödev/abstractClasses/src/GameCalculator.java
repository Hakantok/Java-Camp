
public abstract class GameCalculator {
	public abstract void hesapla(); // abstract : GameCalculator ý extends yada implements edenlerin hesapla() metodunu mutlaka kullanmasý gerekir bu zorunludur.Ama bu metodun içerisini kendisi oluþturmak zorundadýr.
									// abstract sýnýflar asla new lenemez.
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}
