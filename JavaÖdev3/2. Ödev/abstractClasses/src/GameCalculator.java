
public abstract class GameCalculator {
	public abstract void hesapla(); // abstract : GameCalculator � extends yada implements edenlerin hesapla() metodunu mutlaka kullanmas� gerekir bu zorunludur.Ama bu metodun i�erisini kendisi olu�turmak zorundad�r.
									// abstract s�n�flar asla new lenemez.
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}
