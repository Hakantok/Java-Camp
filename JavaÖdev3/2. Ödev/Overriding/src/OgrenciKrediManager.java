
public class OgrenciKrediManager extends BaseKrediManager {
	
	public double hesapla(double tutar) { // BaseKrediManager de ve burada aynı kodu kullanarak, öğrenci için burada bu metodu ezmiş olduk.
		return tutar * 1.10;
	}
}
