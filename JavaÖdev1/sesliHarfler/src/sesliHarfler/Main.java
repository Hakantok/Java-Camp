package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		
		String harf = "M";
		
		String[] inceSesliHarf = {"e","E","�","i","�","�","�","�"};
		String[] kal�nSesliHarf = {"a","A","I","�","O","o","U","u"};
		
		
		
		for(int i=0; i < inceSesliHarf.length; i++) { 
				
				if(harf == inceSesliHarf[i]) {
					System.out.println(harf + " ince sesli bir harftir.");
					return;
				}
				
			}
		
		for(int i=0; i < kal�nSesliHarf.length; i++) {
				
				if(harf == kal�nSesliHarf[i]) {
					System.out.println(harf + " kal�n sesli bir harftir.");
					return;
				}
				
			}
		
		System.out.println(harf + " sesli bir harf de�ildir.");

	}

}
