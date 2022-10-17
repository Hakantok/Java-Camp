package logging;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
		
		System.out.println("Dosya veritabanýna loglandý : " + data);
		
	}

}
